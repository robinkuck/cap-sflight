----- sap.fe.cap.travel.Travel.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Travel (
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  LastChangedAt TIMESTAMP,
  LastChangedBy NVARCHAR(255),
  TravelUUID NVARCHAR(36) NOT NULL,
  TravelID INTEGER DEFAULT 0,
  BeginDate DATE,
  EndDate DATE,
  BookingFee DECIMAL(16, 3) DEFAULT 0,
  TotalPrice DECIMAL(16, 3),
  CurrencyCode_code NVARCHAR(3) DEFAULT 'EUR',
  Description NVARCHAR(1024),
  TravelStatus_code NVARCHAR(1) DEFAULT 'O',
  to_Agency_AgencyID NVARCHAR(6),
  to_Customer_CustomerID NVARCHAR(6),
  GoGreen BOOLEAN DEFAULT FALSE,
  GreenFee DECIMAL(16, 3),
  TreesPlanted INTEGER,
  PRIMARY KEY(TravelUUID)
)
----- sap.common.Currencies.hdbtable -----
COLUMN TABLE sap_common_Currencies (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(3) NOT NULL,
  symbol NVARCHAR(5),
  minorUnit SMALLINT,
  numcode INTEGER,
  exponent INTEGER,
  minor NVARCHAR(5000),
  PRIMARY KEY(code)
)
----- sap.common.Currencies_texts.hdbtable -----
COLUMN TABLE sap_common_Currencies_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(3) NOT NULL,
  PRIMARY KEY(locale, code)
)
----- sap.fe.cap.travel.TravelStatus.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_TravelStatus (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(1) NOT NULL,
  PRIMARY KEY(code)
)
----- sap.fe.cap.travel.TravelStatus_texts.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_TravelStatus_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(1) NOT NULL,
  PRIMARY KEY(locale, code)
)
----- sap.fe.cap.travel.TravelAgency.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_TravelAgency (
  AgencyID NVARCHAR(6) NOT NULL,
  Name NVARCHAR(80),
  Street NVARCHAR(60),
  PostalCode NVARCHAR(10),
  City NVARCHAR(40),
  CountryCode_code NVARCHAR(3),
  PhoneNumber NVARCHAR(30),
  EMailAddress NVARCHAR(256),
  WebAddress NVARCHAR(256),
  PRIMARY KEY(AgencyID)
)
----- sap.common.Countries.hdbtable -----
COLUMN TABLE sap_common_Countries (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(3) NOT NULL,
  PRIMARY KEY(code)
)
----- sap.common.Countries_texts.hdbtable -----
COLUMN TABLE sap_common_Countries_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(3) NOT NULL,
  PRIMARY KEY(locale, code)
)
----- sap.fe.cap.travel.Passenger.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Passenger (
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  LastChangedAt TIMESTAMP,
  LastChangedBy NVARCHAR(255),
  CustomerID NVARCHAR(6) NOT NULL,
  FirstName NVARCHAR(40),
  LastName NVARCHAR(40),
  Title NVARCHAR(10),
  Street NVARCHAR(60),
  PostalCode NVARCHAR(10),
  City NVARCHAR(40),
  CountryCode_code NVARCHAR(3),
  PhoneNumber NVARCHAR(30),
  EMailAddress NVARCHAR(256),
  PRIMARY KEY(CustomerID)
)
----- sap.fe.cap.travel.Booking.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Booking (
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  LastChangedAt TIMESTAMP,
  LastChangedBy NVARCHAR(255),
  BookingUUID NVARCHAR(36) NOT NULL,
  BookingID INTEGER,
  BookingDate DATE,
  ConnectionID NVARCHAR(4),
  FlightDate DATE,
  FlightPrice DECIMAL(16, 3),
  CurrencyCode_code NVARCHAR(3),
  BookingStatus_code NVARCHAR(1) DEFAULT 'N',
  to_Carrier_AirlineID NVARCHAR(3),
  to_Customer_CustomerID NVARCHAR(6),
  to_Travel_TravelUUID NVARCHAR(36),
  PRIMARY KEY(BookingUUID)
)
----- sap.fe.cap.travel.BookingStatus.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_BookingStatus (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(1) NOT NULL,
  PRIMARY KEY(code)
)
----- sap.fe.cap.travel.BookingStatus_texts.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_BookingStatus_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(1) NOT NULL,
  PRIMARY KEY(locale, code)
)
----- sap.fe.cap.travel.BookingSupplement.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_BookingSupplement (
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  LastChangedAt TIMESTAMP,
  LastChangedBy NVARCHAR(255),
  BookSupplUUID NVARCHAR(36) NOT NULL,
  BookingSupplementID INTEGER,
  Price DECIMAL(16, 3),
  CurrencyCode_code NVARCHAR(3),
  to_Booking_BookingUUID NVARCHAR(36),
  to_Travel_TravelUUID NVARCHAR(36),
  to_Supplement_SupplementID NVARCHAR(10),
  PRIMARY KEY(BookSupplUUID)
)
----- sap.fe.cap.travel.Supplement.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Supplement (
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  LastChangedAt TIMESTAMP,
  LastChangedBy NVARCHAR(255),
  SupplementID NVARCHAR(10) NOT NULL,
  Price DECIMAL(16, 3),
  Type_code NVARCHAR(2),
  Description NVARCHAR(1024),
  CurrencyCode_code NVARCHAR(3),
  PRIMARY KEY(SupplementID)
)
----- sap.fe.cap.travel.SupplementType.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_SupplementType (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(2) NOT NULL,
  PRIMARY KEY(code)
)
----- sap.fe.cap.travel.SupplementType_texts.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_SupplementType_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(2) NOT NULL,
  PRIMARY KEY(locale, code)
)
----- sap.fe.cap.travel.Supplement_texts.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Supplement_texts (
  locale NVARCHAR(14) NOT NULL,
  SupplementID NVARCHAR(10) NOT NULL,
  Description NVARCHAR(1024),
  PRIMARY KEY(locale, SupplementID)
)
----- sap.fe.cap.travel.Airline.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Airline (
  AirlineID NVARCHAR(3) NOT NULL,
  Name NVARCHAR(40),
  CurrencyCode_code NVARCHAR(3),
  AirlinePicURL NVARCHAR(5000),
  PRIMARY KEY(AirlineID)
)
----- sap.fe.cap.travel.Flight.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Flight (
  AirlineID NVARCHAR(3) NOT NULL,
  FlightDate DATE NOT NULL,
  ConnectionID NVARCHAR(4) NOT NULL,
  Price DECIMAL(16, 3),
  CurrencyCode_code NVARCHAR(3),
  PlaneType NVARCHAR(10),
  MaximumSeats INTEGER,
  OccupiedSeats INTEGER,
  PRIMARY KEY(AirlineID, FlightDate, ConnectionID)
)
----- sap.fe.cap.travel.FlightConnection.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_FlightConnection (
  ConnectionID NVARCHAR(4) NOT NULL,
  AirlineID NVARCHAR(3) NOT NULL,
  DepartureAirport_AirportID NVARCHAR(3),
  DestinationAirport_AirportID NVARCHAR(3),
  DepartureTime TIME,
  ArrivalTime TIME,
  "DISTANCE" INTEGER,
  DistanceUnit NVARCHAR(3),
  PRIMARY KEY(ConnectionID, AirlineID)
)
----- sap.fe.cap.travel.Airport.hdbtable -----
COLUMN TABLE sap_fe_cap_travel_Airport (
  AirportID NVARCHAR(3) NOT NULL,
  Name NVARCHAR(40),
  City NVARCHAR(40),
  CountryCode_code NVARCHAR(3),
  PRIMARY KEY(AirportID)
)
----- TravelService.Travel.hdbview -----
VIEW TravelService_Travel AS SELECT
  Travel_0.createdAt,
  Travel_0.createdBy,
  Travel_0.LastChangedAt,
  Travel_0.LastChangedBy,
  Travel_0.TravelUUID,
  Travel_0.TravelID,
  Travel_0.BeginDate,
  Travel_0.EndDate,
  Travel_0.BookingFee,
  Travel_0.TotalPrice,
  Travel_0.CurrencyCode_code,
  Travel_0.Description,
  Travel_0.TravelStatus_code,
  Travel_0.to_Agency_AgencyID,
  Travel_0.to_Customer_CustomerID,
  Travel_0.GoGreen,
  Travel_0.GreenFee,
  Travel_0.TreesPlanted
FROM sap_fe_cap_travel_Travel AS Travel_0
----- TravelService.Currencies.hdbview -----
VIEW TravelService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol,
  Currencies_0.minorUnit,
  Currencies_0.numcode,
  Currencies_0.exponent,
  Currencies_0.minor
FROM sap_common_Currencies AS Currencies_0
----- TravelService.Currencies_texts.hdbview -----
VIEW TravelService_Currencies_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_common_Currencies_texts AS texts_0
----- TravelService.TravelStatus.hdbview -----
VIEW TravelService_TravelStatus AS SELECT
  TravelStatus_0.name,
  TravelStatus_0.descr,
  TravelStatus_0.code
FROM sap_fe_cap_travel_TravelStatus AS TravelStatus_0
----- TravelService.TravelStatus_texts.hdbview -----
VIEW TravelService_TravelStatus_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_fe_cap_travel_TravelStatus_texts AS texts_0
----- TravelService.TravelAgency.hdbview -----
VIEW TravelService_TravelAgency AS SELECT
  TravelAgency_0.AgencyID,
  TravelAgency_0.Name,
  TravelAgency_0.Street,
  TravelAgency_0.PostalCode,
  TravelAgency_0.City,
  TravelAgency_0.CountryCode_code,
  TravelAgency_0.PhoneNumber,
  TravelAgency_0.EMailAddress,
  TravelAgency_0.WebAddress
FROM sap_fe_cap_travel_TravelAgency AS TravelAgency_0
----- TravelService.Countries.hdbview -----
VIEW TravelService_Countries AS SELECT
  Countries_0.name,
  Countries_0.descr,
  Countries_0.code
FROM sap_common_Countries AS Countries_0
----- TravelService.Countries_texts.hdbview -----
VIEW TravelService_Countries_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_common_Countries_texts AS texts_0
----- TravelService.Passenger.hdbview -----
VIEW TravelService_Passenger AS SELECT
  Passenger_0.createdAt,
  Passenger_0.createdBy,
  Passenger_0.LastChangedAt,
  Passenger_0.LastChangedBy,
  Passenger_0.CustomerID,
  Passenger_0.FirstName,
  Passenger_0.LastName,
  Passenger_0.Title,
  Passenger_0.Street,
  Passenger_0.PostalCode,
  Passenger_0.City,
  Passenger_0.CountryCode_code,
  Passenger_0.PhoneNumber,
  Passenger_0.EMailAddress
FROM sap_fe_cap_travel_Passenger AS Passenger_0
----- TravelService.Booking.hdbview -----
VIEW TravelService_Booking AS SELECT
  Booking_0.createdAt,
  Booking_0.createdBy,
  Booking_0.LastChangedAt,
  Booking_0.LastChangedBy,
  Booking_0.BookingUUID,
  Booking_0.BookingID,
  Booking_0.BookingDate,
  Booking_0.ConnectionID,
  Booking_0.FlightDate,
  Booking_0.FlightPrice,
  Booking_0.CurrencyCode_code,
  Booking_0.BookingStatus_code,
  Booking_0.to_Carrier_AirlineID,
  Booking_0.to_Customer_CustomerID,
  Booking_0.to_Travel_TravelUUID
FROM sap_fe_cap_travel_Booking AS Booking_0
----- TravelService.BookingStatus.hdbview -----
VIEW TravelService_BookingStatus AS SELECT
  BookingStatus_0.name,
  BookingStatus_0.descr,
  BookingStatus_0.code
FROM sap_fe_cap_travel_BookingStatus AS BookingStatus_0
----- TravelService.BookingStatus_texts.hdbview -----
VIEW TravelService_BookingStatus_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_fe_cap_travel_BookingStatus_texts AS texts_0
----- TravelService.BookingSupplement.hdbview -----
VIEW TravelService_BookingSupplement AS SELECT
  BookingSupplement_0.createdAt,
  BookingSupplement_0.createdBy,
  BookingSupplement_0.LastChangedAt,
  BookingSupplement_0.LastChangedBy,
  BookingSupplement_0.BookSupplUUID,
  BookingSupplement_0.BookingSupplementID,
  BookingSupplement_0.Price,
  BookingSupplement_0.CurrencyCode_code,
  BookingSupplement_0.to_Booking_BookingUUID,
  BookingSupplement_0.to_Travel_TravelUUID,
  BookingSupplement_0.to_Supplement_SupplementID
FROM sap_fe_cap_travel_BookingSupplement AS BookingSupplement_0
----- TravelService.Supplement.hdbview -----
VIEW TravelService_Supplement AS SELECT
  Supplement_0.createdAt,
  Supplement_0.createdBy,
  Supplement_0.LastChangedAt,
  Supplement_0.LastChangedBy,
  Supplement_0.SupplementID,
  Supplement_0.Price,
  Supplement_0.Type_code,
  Supplement_0.Description,
  Supplement_0.CurrencyCode_code
FROM sap_fe_cap_travel_Supplement AS Supplement_0
----- TravelService.SupplementType.hdbview -----
VIEW TravelService_SupplementType AS SELECT
  SupplementType_0.name,
  SupplementType_0.descr,
  SupplementType_0.code
FROM sap_fe_cap_travel_SupplementType AS SupplementType_0
----- TravelService.SupplementType_texts.hdbview -----
VIEW TravelService_SupplementType_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_fe_cap_travel_SupplementType_texts AS texts_0
----- TravelService.Supplement_texts.hdbview -----
VIEW TravelService_Supplement_texts AS SELECT
  texts_0.locale,
  texts_0.SupplementID,
  texts_0.Description
FROM sap_fe_cap_travel_Supplement_texts AS texts_0
----- TravelService.Airline.hdbview -----
VIEW TravelService_Airline AS SELECT
  Airline_0.AirlineID,
  Airline_0.Name,
  Airline_0.CurrencyCode_code,
  Airline_0.AirlinePicURL
FROM sap_fe_cap_travel_Airline AS Airline_0
----- TravelService.Flight.hdbview -----
VIEW TravelService_Flight AS SELECT
  Flight_0.AirlineID,
  Flight_0.FlightDate,
  Flight_0.ConnectionID,
  Flight_0.Price,
  Flight_0.CurrencyCode_code,
  Flight_0.PlaneType,
  Flight_0.MaximumSeats,
  Flight_0.OccupiedSeats
FROM sap_fe_cap_travel_Flight AS Flight_0
----- TravelService.FlightConnection.hdbview -----
VIEW TravelService_FlightConnection AS SELECT
  FlightConnection_0.ConnectionID,
  FlightConnection_0.AirlineID,
  FlightConnection_0.DepartureAirport_AirportID,
  FlightConnection_0.DestinationAirport_AirportID,
  FlightConnection_0.DepartureTime,
  FlightConnection_0.ArrivalTime,
  FlightConnection_0."DISTANCE",
  FlightConnection_0.DistanceUnit
FROM sap_fe_cap_travel_FlightConnection AS FlightConnection_0
----- TravelService.Airport.hdbview -----
VIEW TravelService_Airport AS SELECT
  Airport_0.AirportID,
  Airport_0.Name,
  Airport_0.City,
  Airport_0.CountryCode_code
FROM sap_fe_cap_travel_Airport AS Airport_0
----- localized.sap.common.Currencies.hdbview -----
VIEW localized_sap_common_Currencies AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.symbol,
  L_0.minorUnit,
  L_0.numcode,
  L_0.exponent,
  L_0.minor
FROM (sap_common_Currencies AS L_0 LEFT JOIN sap_common_Currencies_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = SESSION_CONTEXT('LOCALE'))
----- localized.sap.fe.cap.travel.TravelStatus.hdbview -----
VIEW localized_sap_fe_cap_travel_TravelStatus AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_fe_cap_travel_TravelStatus AS L_0 LEFT JOIN sap_fe_cap_travel_TravelStatus_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = SESSION_CONTEXT('LOCALE'))
----- localized.sap.common.Countries.hdbview -----
VIEW localized_sap_common_Countries AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_common_Countries AS L_0 LEFT JOIN sap_common_Countries_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = SESSION_CONTEXT('LOCALE'))
----- localized.sap.fe.cap.travel.BookingStatus.hdbview -----
VIEW localized_sap_fe_cap_travel_BookingStatus AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_fe_cap_travel_BookingStatus AS L_0 LEFT JOIN sap_fe_cap_travel_BookingStatus_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = SESSION_CONTEXT('LOCALE'))
----- localized.sap.fe.cap.travel.Supplement.hdbview -----
VIEW localized_sap_fe_cap_travel_Supplement AS SELECT
  L_0.createdAt,
  L_0.createdBy,
  L_0.LastChangedAt,
  L_0.LastChangedBy,
  L_0.SupplementID,
  L_0.Price,
  L_0.Type_code,
  coalesce(localized_1.Description, L_0.Description) AS Description,
  L_0.CurrencyCode_code
FROM (sap_fe_cap_travel_Supplement AS L_0 LEFT JOIN sap_fe_cap_travel_Supplement_texts AS localized_1 ON localized_1.SupplementID = L_0.SupplementID AND localized_1.locale = SESSION_CONTEXT('LOCALE'))
----- localized.sap.fe.cap.travel.SupplementType.hdbview -----
VIEW localized_sap_fe_cap_travel_SupplementType AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_fe_cap_travel_SupplementType AS L_0 LEFT JOIN sap_fe_cap_travel_SupplementType_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = SESSION_CONTEXT('LOCALE'))
----- localized.TravelService.Currencies.hdbview -----
VIEW localized_TravelService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol,
  Currencies_0.minorUnit,
  Currencies_0.numcode,
  Currencies_0.exponent,
  Currencies_0.minor
FROM localized_sap_common_Currencies AS Currencies_0
----- localized.TravelService.TravelStatus.hdbview -----
VIEW localized_TravelService_TravelStatus AS SELECT
  TravelStatus_0.name,
  TravelStatus_0.descr,
  TravelStatus_0.code
FROM localized_sap_fe_cap_travel_TravelStatus AS TravelStatus_0
----- localized.TravelService.Countries.hdbview -----
VIEW localized_TravelService_Countries AS SELECT
  Countries_0.name,
  Countries_0.descr,
  Countries_0.code
FROM localized_sap_common_Countries AS Countries_0
----- localized.TravelService.BookingStatus.hdbview -----
VIEW localized_TravelService_BookingStatus AS SELECT
  BookingStatus_0.name,
  BookingStatus_0.descr,
  BookingStatus_0.code
FROM localized_sap_fe_cap_travel_BookingStatus AS BookingStatus_0
----- localized.TravelService.Supplement.hdbview -----
VIEW localized_TravelService_Supplement AS SELECT
  Supplement_0.createdAt,
  Supplement_0.createdBy,
  Supplement_0.LastChangedAt,
  Supplement_0.LastChangedBy,
  Supplement_0.SupplementID,
  Supplement_0.Price,
  Supplement_0.Type_code,
  Supplement_0.Description,
  Supplement_0.CurrencyCode_code
FROM localized_sap_fe_cap_travel_Supplement AS Supplement_0
----- localized.TravelService.SupplementType.hdbview -----
VIEW localized_TravelService_SupplementType AS SELECT
  SupplementType_0.name,
  SupplementType_0.descr,
  SupplementType_0.code
FROM localized_sap_fe_cap_travel_SupplementType AS SupplementType_0