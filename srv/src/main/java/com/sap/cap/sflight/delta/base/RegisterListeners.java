// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.sap.cap.sflight.delta.base;

import com.sap.cloud.server.odata.*;

public class RegisterListeners {
    public static EntityListener listener_Airline;
    public static EntityListener listener_Airport;
    public static EntityListener listener_Booking;
    public static EntityListener listener_BookingStatus;
    public static EntityListener listener_BookingStatus_texts;
    public static EntityListener listener_BookingSupplement;
    public static EntityListener listener_ClientRegistration;
    public static EntityListener listener_Countries;
    public static EntityListener listener_Countries_texts;
    public static EntityListener listener_Currencies;
    public static EntityListener listener_Currencies_texts;
    public static EntityListener listener_Flight;
    public static EntityListener listener_FlightConnection;
    public static EntityListener listener_Passenger;
    public static EntityListener listener_Supplement;
    public static EntityListener listener_SupplementType;
    public static EntityListener listener_SupplementType_texts;
    public static EntityListener listener_Supplement_texts;
    public static EntityListener listener_Travel;
    public static EntityListener listener_TravelAgency;
    public static EntityListener listener_TravelStatus;
    public static EntityListener listener_TravelStatus_texts;

    public static void withServlet(com.sap.cap.sflight.delta.MainServlet servlet) {
        com.sap.cap.sflight.delta.proxy.ProxyService service = (com.sap.cap.sflight.delta.proxy.ProxyService)servlet.getDataService();
        listener_Airline = new com.sap.cap.sflight.delta.listener.AirlineListener(servlet, service);
        listener_Airport = new com.sap.cap.sflight.delta.listener.AirportListener(servlet, service);
        listener_Booking = new com.sap.cap.sflight.delta.listener.BookingListener(servlet, service);
        listener_BookingStatus = new com.sap.cap.sflight.delta.listener.BookingStatusListener(servlet, service);
        listener_BookingStatus_texts = new com.sap.cap.sflight.delta.listener.BookingStatusTextsListener(servlet, service);
        listener_BookingSupplement = new com.sap.cap.sflight.delta.listener.BookingSupplementListener(servlet, service);
        listener_ClientRegistration = new com.sap.cap.sflight.delta.listener.ClientRegistrationListener(servlet, service);
        listener_Countries = new com.sap.cap.sflight.delta.listener.CountriesListener(servlet, service);
        listener_Countries_texts = new com.sap.cap.sflight.delta.listener.CountriesTextsListener(servlet, service);
        listener_Currencies = new com.sap.cap.sflight.delta.listener.CurrenciesListener(servlet, service);
        listener_Currencies_texts = new com.sap.cap.sflight.delta.listener.CurrenciesTextsListener(servlet, service);
        listener_Flight = new com.sap.cap.sflight.delta.listener.FlightListener(servlet, service);
        listener_FlightConnection = new com.sap.cap.sflight.delta.listener.FlightConnectionListener(servlet, service);
        listener_Passenger = new com.sap.cap.sflight.delta.listener.PassengerListener(servlet, service);
        listener_Supplement = new com.sap.cap.sflight.delta.listener.SupplementListener(servlet, service);
        listener_SupplementType = new com.sap.cap.sflight.delta.listener.SupplementTypeListener(servlet, service);
        listener_SupplementType_texts = new com.sap.cap.sflight.delta.listener.SupplementTypeTextsListener(servlet, service);
        listener_Supplement_texts = new com.sap.cap.sflight.delta.listener.SupplementTextsListener(servlet, service);
        listener_Travel = new com.sap.cap.sflight.delta.listener.TravelListener(servlet, service);
        listener_TravelAgency = new com.sap.cap.sflight.delta.listener.TravelAgencyListener(servlet, service);
        listener_TravelStatus = new com.sap.cap.sflight.delta.listener.TravelStatusListener(servlet, service);
        listener_TravelStatus_texts = new com.sap.cap.sflight.delta.listener.TravelStatusTextsListener(servlet, service);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline, listener_Airline);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport, listener_Airport);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking, listener_Booking);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus, listener_BookingStatus);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatusTexts, listener_BookingStatus_texts);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement, listener_BookingSupplement);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration, listener_ClientRegistration);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries, listener_Countries);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts, listener_Countries_texts);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies, listener_Currencies);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts, listener_Currencies_texts);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight, listener_Flight);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection, listener_FlightConnection);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger, listener_Passenger);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement, listener_Supplement);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType, listener_SupplementType);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts, listener_SupplementType_texts);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts, listener_Supplement_texts);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel, listener_Travel);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency, listener_TravelAgency);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus, listener_TravelStatus);
        servlet.registerEntityListener(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts, listener_TravelStatus_texts);
    }
}
