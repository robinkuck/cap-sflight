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
  @cache.background
  @cache.timeout : 'PT5M'
  entity Employees as projection on external.Employees
    excluding { Photo, Employees1, Employee1, Orders, Territories };

  @cache.background
  @cache.timeout : 'PT5M'
  entity Customers as projection on external.Customers
    excluding { Orders, CustomerDemographics, CustomerCustomerDemo };

  @cache.background
  @cache.timeout : 'PT5M'
  entity Orders as projection on external.Orders
    excluding { Customer, Employee, Order_Details, Shipper };
}

type Percentage : Integer @assert.range: [1,100];
