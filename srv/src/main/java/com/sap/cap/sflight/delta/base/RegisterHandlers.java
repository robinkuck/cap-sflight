// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.sap.cap.sflight.delta.base;

import com.sap.cloud.server.odata.*;

public class RegisterHandlers {
    public static EntityHandler handler_Airline;
    public static EntityHandler handler_Airport;
    public static EntityHandler handler_Booking;
    public static EntityHandler handler_BookingStatus;
    public static EntityHandler handler_BookingStatus_texts;
    public static EntityHandler handler_BookingSupplement;
    public static EntityHandler handler_ClientRegistration;
    public static EntityHandler handler_Countries;
    public static EntityHandler handler_Countries_texts;
    public static EntityHandler handler_Currencies;
    public static EntityHandler handler_Currencies_texts;
    public static EntityHandler handler_Flight;
    public static EntityHandler handler_FlightConnection;
    public static EntityHandler handler_Passenger;
    public static EntityHandler handler_Supplement;
    public static EntityHandler handler_SupplementType;
    public static EntityHandler handler_SupplementType_texts;
    public static EntityHandler handler_Supplement_texts;
    public static EntityHandler handler_Travel;
    public static EntityHandler handler_TravelAgency;
    public static EntityHandler handler_TravelStatus;
    public static EntityHandler handler_TravelStatus_texts;

    public static void withServlet(com.sap.cap.sflight.delta.MainServlet servlet) {
        com.sap.cap.sflight.delta.proxy.ProxyService service = (com.sap.cap.sflight.delta.proxy.ProxyService)servlet.getBackendService();
        handler_Airline = new com.sap.cap.sflight.delta.handler.AirlineHandler(servlet, service);
        handler_Airport = new com.sap.cap.sflight.delta.handler.AirportHandler(servlet, service);
        handler_Booking = new com.sap.cap.sflight.delta.handler.BookingHandler(servlet, service);
        handler_BookingStatus = new com.sap.cap.sflight.delta.handler.BookingStatusHandler(servlet, service);
        handler_BookingStatus_texts = new com.sap.cap.sflight.delta.handler.BookingStatusTextsHandler(servlet, service);
        handler_BookingSupplement = new com.sap.cap.sflight.delta.handler.BookingSupplementHandler(servlet, service);
        handler_ClientRegistration = new com.sap.cap.sflight.delta.handler.ClientRegistrationHandler(servlet, service);
        handler_Countries = new com.sap.cap.sflight.delta.handler.CountriesHandler(servlet, service);
        handler_Countries_texts = new com.sap.cap.sflight.delta.handler.CountriesTextsHandler(servlet, service);
        handler_Currencies = new com.sap.cap.sflight.delta.handler.CurrenciesHandler(servlet, service);
        handler_Currencies_texts = new com.sap.cap.sflight.delta.handler.CurrenciesTextsHandler(servlet, service);
        handler_Flight = new com.sap.cap.sflight.delta.handler.FlightHandler(servlet, service);
        handler_FlightConnection = new com.sap.cap.sflight.delta.handler.FlightConnectionHandler(servlet, service);
        handler_Passenger = new com.sap.cap.sflight.delta.handler.PassengerHandler(servlet, service);
        handler_Supplement = new com.sap.cap.sflight.delta.handler.SupplementHandler(servlet, service);
        handler_SupplementType = new com.sap.cap.sflight.delta.handler.SupplementTypeHandler(servlet, service);
        handler_SupplementType_texts = new com.sap.cap.sflight.delta.handler.SupplementTypeTextsHandler(servlet, service);
        handler_Supplement_texts = new com.sap.cap.sflight.delta.handler.SupplementTextsHandler(servlet, service);
        handler_Travel = new com.sap.cap.sflight.delta.handler.TravelHandler(servlet, service);
        handler_TravelAgency = new com.sap.cap.sflight.delta.handler.TravelAgencyHandler(servlet, service);
        handler_TravelStatus = new com.sap.cap.sflight.delta.handler.TravelStatusHandler(servlet, service);
        handler_TravelStatus_texts = new com.sap.cap.sflight.delta.handler.TravelStatusTextsHandler(servlet, service);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline, handler_Airline);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport, handler_Airport);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking, handler_Booking);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus, handler_BookingStatus);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatusTexts, handler_BookingStatus_texts);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement, handler_BookingSupplement);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration, handler_ClientRegistration);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries, handler_Countries);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts, handler_Countries_texts);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies, handler_Currencies);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts, handler_Currencies_texts);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight, handler_Flight);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection, handler_FlightConnection);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger, handler_Passenger);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement, handler_Supplement);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType, handler_SupplementType);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts, handler_SupplementType_texts);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts, handler_Supplement_texts);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel, handler_Travel);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency, handler_TravelAgency);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus, handler_TravelStatus);
        servlet.registerEntityHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts, handler_TravelStatus_texts);
        servlet.registerMethodHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.acceptTravel, new com.sap.cap.sflight.delta.handler.AcceptTravelHandler(servlet, service));
        servlet.registerMethodHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.createTravelByTemplate, new com.sap.cap.sflight.delta.handler.CreateTravelByTemplateHandler(servlet, service));
        servlet.registerMethodHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.deductDiscount, new com.sap.cap.sflight.delta.handler.DeductDiscountHandler(servlet, service));
        servlet.registerMethodHandler(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.rejectTravel, new com.sap.cap.sflight.delta.handler.RejectTravelHandler(servlet, service));
    }

    public static void startRefresh(com.sap.cap.sflight.delta.MainServlet servlet) {
        servlet.createRefreshSemaphores();
    }
}
