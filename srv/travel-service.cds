using { sap.fe.cap.travel as my } from '../db/schema';
using { Northwind as external } from './external/Northwind';

service TravelService @(path:'/processor') {

  @(restrict: [
    { grant: 'READ', to: 'authenticated-user'},
    { grant: ['rejectTravel','acceptTravel','deductDiscount'], to: 'reviewer'},
    { grant: ['*'], to: 'processor'},
    { grant: ['*'], to: 'admin'}
  ])
  entity Travel as projection on my.Travel actions {
    action createTravelByTemplate() returns Travel;
    action rejectTravel();
    action acceptTravel();
    action deductDiscount( percent: Percentage not null ) returns Travel;
  };

  @cache.timeout : 'PT5M'
  entity Employees as projection on external.Employees
    excluding { Employees1, Employee1, Orders, Territories };
}

type Percentage : Integer @assert.range: [1,100];
