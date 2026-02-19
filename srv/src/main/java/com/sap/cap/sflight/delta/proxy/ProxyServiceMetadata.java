package com.sap.cap.sflight.delta.proxy;

public abstract class ProxyServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.resolve();

    public static final com.sap.cloud.server.odata.MetadataLock lock = new com.sap.cloud.server.odata.MetadataLock();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.registerAll();
        com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.immortalize();
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType airline = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Airline");

        public static final com.sap.cloud.server.odata.EntityType airport = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Airport");

        public static final com.sap.cloud.server.odata.EntityType booking = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Booking");

        public static final com.sap.cloud.server.odata.EntityType bookingStatus = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.BookingStatus");

        public static final com.sap.cloud.server.odata.EntityType bookingStatusTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.BookingStatus_texts");

        public static final com.sap.cloud.server.odata.EntityType bookingSupplement = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.BookingSupplement");

        public static final com.sap.cloud.server.odata.EntityType clientRegistration = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.ClientRegistration");

        public static final com.sap.cloud.server.odata.EntityType countries = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Countries");

        public static final com.sap.cloud.server.odata.EntityType countriesTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Countries_texts");

        public static final com.sap.cloud.server.odata.EntityType currencies = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Currencies");

        public static final com.sap.cloud.server.odata.EntityType currenciesTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Currencies_texts");

        public static final com.sap.cloud.server.odata.EntityType flight = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Flight");

        public static final com.sap.cloud.server.odata.EntityType flightConnection = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.FlightConnection");

        public static final com.sap.cloud.server.odata.EntityType passenger = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Passenger");

        public static final com.sap.cloud.server.odata.EntityType supplement = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Supplement");

        public static final com.sap.cloud.server.odata.EntityType supplementType = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.SupplementType");

        public static final com.sap.cloud.server.odata.EntityType supplementTypeTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.SupplementType_texts");

        public static final com.sap.cloud.server.odata.EntityType supplementTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Supplement_texts");

        public static final com.sap.cloud.server.odata.EntityType travel = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.Travel");

        public static final com.sap.cloud.server.odata.EntityType travelAgency = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.TravelAgency");

        public static final com.sap.cloud.server.odata.EntityType travelStatus = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.TravelStatus");

        public static final com.sap.cloud.server.odata.EntityType travelStatusTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntityType("TravelService.TravelStatus_texts");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet airline = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Airline");

        public static final com.sap.cloud.server.odata.EntitySet airport = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Airport");

        public static final com.sap.cloud.server.odata.EntitySet booking = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Booking");

        public static final com.sap.cloud.server.odata.EntitySet bookingStatus = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("BookingStatus");

        public static final com.sap.cloud.server.odata.EntitySet bookingStatusTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("BookingStatus_texts");

        public static final com.sap.cloud.server.odata.EntitySet bookingSupplement = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("BookingSupplement");

        public static final com.sap.cloud.server.odata.EntitySet clientRegistrationSet = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("ClientRegistrationSet");

        public static final com.sap.cloud.server.odata.EntitySet countries = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Countries");

        public static final com.sap.cloud.server.odata.EntitySet countriesTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Countries_texts");

        public static final com.sap.cloud.server.odata.EntitySet currencies = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Currencies");

        public static final com.sap.cloud.server.odata.EntitySet currenciesTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Currencies_texts");

        public static final com.sap.cloud.server.odata.EntitySet flight = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Flight");

        public static final com.sap.cloud.server.odata.EntitySet flightConnection = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("FlightConnection");

        public static final com.sap.cloud.server.odata.EntitySet passenger = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Passenger");

        public static final com.sap.cloud.server.odata.EntitySet supplement = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Supplement");

        public static final com.sap.cloud.server.odata.EntitySet supplementType = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("SupplementType");

        public static final com.sap.cloud.server.odata.EntitySet supplementTypeTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("SupplementType_texts");

        public static final com.sap.cloud.server.odata.EntitySet supplementTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Supplement_texts");

        public static final com.sap.cloud.server.odata.EntitySet travel = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("Travel");

        public static final com.sap.cloud.server.odata.EntitySet travelAgency = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("TravelAgency");

        public static final com.sap.cloud.server.odata.EntitySet travelStatus = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("TravelStatus");

        public static final com.sap.cloud.server.odata.EntitySet travelStatusTexts = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getEntitySet("TravelStatus_texts");
    }

    public abstract static class BoundActions
    {
        public static final com.sap.cloud.server.odata.DataMethod acceptTravel = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getDataMethod("TravelService.acceptTravel");

        public static final com.sap.cloud.server.odata.DataMethod createTravelByTemplate = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getDataMethod("TravelService.createTravelByTemplate");

        public static final com.sap.cloud.server.odata.DataMethod deductDiscount = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getDataMethod("TravelService.deductDiscount");

        public static final com.sap.cloud.server.odata.DataMethod rejectTravel = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parsed.getDataMethod("TravelService.rejectTravel");
    }
}
