package com.sap.cap.sflight.delta.proxy.internal;

public abstract class ProxyServiceFactory
{
    public static void registerAll()
    {
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airline.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateAirline());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.airport.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateAirport());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.booking.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateBooking());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatus.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateBookingStatus());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingStatusTexts.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateBookingStatusTexts());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.bookingSupplement.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateBookingSupplement());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.clientRegistration.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateClientRegistration());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countries.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateCountries());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.countriesTexts.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateCountriesTexts());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currencies.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateCurrencies());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.currenciesTexts.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateCurrenciesTexts());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flight.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateFlight());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.flightConnection.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateFlightConnection());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.passenger.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreatePassenger());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplement.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateSupplement());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementType.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateSupplementType());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTypeTexts.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateSupplementTypeTexts());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.supplementTexts.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateSupplementTexts());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travel.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateTravel());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelAgency.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateTravelAgency());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatus.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateTravelStatus());
        com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntityTypes.travelStatusTexts.registerFactory(new com.sap.cap.sflight.delta.proxy.internal.ProxyServiceFactory.CreateTravelStatusTexts());
    }

    public static class CreateAirline
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Airline(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Airline(false, indexMap);
        }
    }

    public static class CreateAirport
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Airport(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Airport(false, indexMap);
        }
    }

    public static class CreateBooking
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Booking(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Booking(false, indexMap);
        }
    }

    public static class CreateBookingStatus
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.BookingStatus(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.BookingStatus(false, indexMap);
        }
    }

    public static class CreateBookingStatusTexts
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.BookingStatusTexts(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.BookingStatusTexts(false, indexMap);
        }
    }

    public static class CreateBookingSupplement
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.BookingSupplement(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.BookingSupplement(false, indexMap);
        }
    }

    public static class CreateClientRegistration
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.ClientRegistration(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.ClientRegistration(false, indexMap);
        }
    }

    public static class CreateCountries
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Countries(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Countries(false, indexMap);
        }
    }

    public static class CreateCountriesTexts
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.CountriesTexts(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.CountriesTexts(false, indexMap);
        }
    }

    public static class CreateCurrencies
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Currencies(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Currencies(false, indexMap);
        }
    }

    public static class CreateCurrenciesTexts
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.CurrenciesTexts(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.CurrenciesTexts(false, indexMap);
        }
    }

    public static class CreateFlight
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Flight(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Flight(false, indexMap);
        }
    }

    public static class CreateFlightConnection
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.FlightConnection(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.FlightConnection(false, indexMap);
        }
    }

    public static class CreatePassenger
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Passenger(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Passenger(false, indexMap);
        }
    }

    public static class CreateSupplement
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Supplement(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Supplement(false, indexMap);
        }
    }

    public static class CreateSupplementType
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.SupplementType(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.SupplementType(false, indexMap);
        }
    }

    public static class CreateSupplementTypeTexts
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.SupplementTypeTexts(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.SupplementTypeTexts(false, indexMap);
        }
    }

    public static class CreateSupplementTexts
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.SupplementTexts(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.SupplementTexts(false, indexMap);
        }
    }

    public static class CreateTravel
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.Travel(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.Travel(false, indexMap);
        }
    }

    public static class CreateTravelAgency
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.TravelAgency(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.TravelAgency(false, indexMap);
        }
    }

    public static class CreateTravelStatus
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.TravelStatus(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.TravelStatus(false, indexMap);
        }
    }

    public static class CreateTravelStatusTexts
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @Override public Object create()
        {
            return new com.sap.cap.sflight.delta.proxy.TravelStatusTexts(false);
        }

        @Override public Object createWithSparseArray(final com.sap.cloud.server.odata.core.SparseIndexMap indexMap)
        {
            return new com.sap.cap.sflight.delta.proxy.TravelStatusTexts(false, indexMap);
        }
    }
}
