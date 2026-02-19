package com.sap.cap.sflight.delta.proxy;

public class ProxyService
    extends com.sap.cloud.server.odata.DataService
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

    public ProxyService()
    {
        this(null);
    }

    public ProxyService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "ProxyService"));
        this.getProvider().setMetadata(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.document);
        com.sap.cloud.server.odata.ProxyInternal.setCsdlFetcher(this.getProvider(), null);
        com.sap.cloud.server.odata.ProxyInternal.setCsdlOptions(this.getProvider(), com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.options);
    }

    public void acceptTravel(final com.sap.cloud.server.odata.BindingPath in)
    {
        this.acceptTravel(in, null, null, null);
    }

    public void acceptTravel(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query)
    {
        this.acceptTravel(in, query, null, null);
    }

    public void acceptTravel(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        this.acceptTravel(in, query, headers, null);
    }

    public void acceptTravel(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        com.sap.cloud.server.odata.core.Ignore.valueOf_any(this.executeQuery(var_query.bind(in).invoke(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.acceptTravel, com.sap.cloud.server.odata.ParameterList.empty), headers, options));
    }

    public com.sap.cap.sflight.delta.proxy.Travel createTravelByTemplate(final com.sap.cloud.server.odata.BindingPath in)
    {
        return this.createTravelByTemplate(in, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel createTravelByTemplate(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.createTravelByTemplate(in, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel createTravelByTemplate(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.createTravelByTemplate(in, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel createTravelByTemplate(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Travel.cast(this.executeQuery(var_query.bind(in).invoke(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.createTravelByTemplate, com.sap.cloud.server.odata.ParameterList.empty), headers, options).getCheckedResult());
    }

    public com.sap.cap.sflight.delta.proxy.Travel deductDiscount(final com.sap.cloud.server.odata.BindingPath in, final int percent)
    {
        return this.deductDiscount(in, percent, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel deductDiscount(final com.sap.cloud.server.odata.BindingPath in, final int percent, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.deductDiscount(in, percent, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel deductDiscount(final com.sap.cloud.server.odata.BindingPath in, final int percent, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.deductDiscount(in, percent, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel deductDiscount(final com.sap.cloud.server.odata.BindingPath in, final int percent, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_Travel.cast(this.executeQuery(var_query.bind(in).invoke(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.deductDiscount, new com.sap.cloud.server.odata.ParameterList(1).with("percent", com.sap.cloud.server.odata.IntValue.of(percent))), headers, options).getCheckedResult());
    }

    public com.sap.cap.sflight.delta.proxy.AirlineList getAirline()
    {
        return this.getAirline(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.AirlineList getAirline(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getAirline(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.AirlineList getAirline(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getAirline(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.AirlineList getAirline(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Airline.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.airline), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getAirline1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getAirline1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airline.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.airline), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1WithKey(final String airlineID)
    {
        return this.getAirline1WithKey(airlineID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1WithKey(final String airlineID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getAirline1WithKey(airlineID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1WithKey(final String airlineID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getAirline1WithKey(airlineID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airline getAirline1WithKey(final String airlineID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getAirline1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Airline.key(airlineID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.AirportList getAirport()
    {
        return this.getAirport(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.AirportList getAirport(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getAirport(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.AirportList getAirport(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getAirport(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.AirportList getAirport(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Airport.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.airport), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getAirport1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getAirport1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Airport.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.airport), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1WithKey(final String airportID)
    {
        return this.getAirport1WithKey(airportID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1WithKey(final String airportID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getAirport1WithKey(airportID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1WithKey(final String airportID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getAirport1WithKey(airportID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Airport getAirport1WithKey(final String airportID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getAirport1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Airport.key(airportID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.BookingList getBooking()
    {
        return this.getBooking(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingList getBooking(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBooking(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingList getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBooking(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingList getBooking(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Booking.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.booking), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBooking1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBooking1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Booking.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.booking), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1WithKey(final com.sap.cloud.server.odata.GuidValue bookingUUID)
    {
        return this.getBooking1WithKey(bookingUUID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1WithKey(final com.sap.cloud.server.odata.GuidValue bookingUUID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBooking1WithKey(bookingUUID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1WithKey(final com.sap.cloud.server.odata.GuidValue bookingUUID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBooking1WithKey(bookingUUID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Booking getBooking1WithKey(final com.sap.cloud.server.odata.GuidValue bookingUUID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBooking1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Booking.key(bookingUUID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusList getBookingStatus()
    {
        return this.getBookingStatus(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusList getBookingStatus(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingStatus(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusList getBookingStatus(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingStatus(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusList getBookingStatus(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.BookingStatus.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.bookingStatus), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingStatus1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingStatus1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingStatus.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.bookingStatus), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1WithKey(final String code)
    {
        return this.getBookingStatus1WithKey(code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingStatus1WithKey(code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingStatus1WithKey(code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatus getBookingStatus1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBookingStatus1(var_query.withKey(com.sap.cap.sflight.delta.proxy.BookingStatus.key(code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTextsList getBookingStatusTexts()
    {
        return this.getBookingStatusTexts(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTextsList getBookingStatusTexts(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingStatusTexts(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTextsList getBookingStatusTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingStatusTexts(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTextsList getBookingStatusTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.BookingStatusTexts.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.bookingStatusTexts), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingStatusTexts1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingStatusTexts1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingStatusTexts.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.bookingStatusTexts), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1WithKey(final String locale, final String code)
    {
        return this.getBookingStatusTexts1WithKey(locale, code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingStatusTexts1WithKey(locale, code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingStatusTexts1WithKey(locale, code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingStatusTexts getBookingStatusTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBookingStatusTexts1(var_query.withKey(com.sap.cap.sflight.delta.proxy.BookingStatusTexts.key(locale, code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplementList getBookingSupplement()
    {
        return this.getBookingSupplement(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplementList getBookingSupplement(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingSupplement(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplementList getBookingSupplement(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingSupplement(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplementList getBookingSupplement(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.BookingSupplement.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.bookingSupplement), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingSupplement1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingSupplement1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_BookingSupplement.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.bookingSupplement), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1WithKey(final com.sap.cloud.server.odata.GuidValue bookSupplUUID)
    {
        return this.getBookingSupplement1WithKey(bookSupplUUID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1WithKey(final com.sap.cloud.server.odata.GuidValue bookSupplUUID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getBookingSupplement1WithKey(bookSupplUUID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1WithKey(final com.sap.cloud.server.odata.GuidValue bookSupplUUID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getBookingSupplement1WithKey(bookSupplUUID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.BookingSupplement getBookingSupplement1WithKey(final com.sap.cloud.server.odata.GuidValue bookSupplUUID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getBookingSupplement1(var_query.withKey(com.sap.cap.sflight.delta.proxy.BookingSupplement.key(bookSupplUUID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistration()
    {
        return this.getClientRegistration(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistration(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getClientRegistration(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistration(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getClientRegistration(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistration(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cap.sflight.delta.proxy.ClientRegistration client = com.sap.cap.sflight.delta.proxy.internal.Any_asNullable_com_sap_cap_sflight_delta_proxy_ClientRegistration.cast(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.clientRegistrationSet), headers, options).getOptionalEntity());
        if (client == null)
        {
            final com.sap.cap.sflight.delta.proxy.ClientRegistration newClient = new com.sap.cap.sflight.delta.proxy.ClientRegistration();
            newClient.setClientGUID(com.sap.cloud.server.odata.GuidValue.random());
            return newClient;
        }
        else
        {
            return client;
        }
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistrationList getClientRegistrationSet()
    {
        return this.getClientRegistrationSet(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistrationList getClientRegistrationSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getClientRegistrationSet(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistrationList getClientRegistrationSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getClientRegistrationSet(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistrationList getClientRegistrationSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.ClientRegistration.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.clientRegistrationSet), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID)
    {
        return this.getClientRegistrationWithKey(clientID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getClientRegistrationWithKey(clientID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getClientRegistrationWithKey(clientID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.ClientRegistration getClientRegistrationWithKey(final long clientID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getClientRegistration(var_query.withKey(com.sap.cap.sflight.delta.proxy.ClientRegistration.key(clientID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesList getCountries()
    {
        return this.getCountries(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesList getCountries(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCountries(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesList getCountries(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCountries(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesList getCountries(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Countries.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.countries), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCountries1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCountries1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Countries.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.countries), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1WithKey(final String code)
    {
        return this.getCountries1WithKey(code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCountries1WithKey(code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCountries1WithKey(code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Countries getCountries1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCountries1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Countries.key(code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTextsList getCountriesTexts()
    {
        return this.getCountriesTexts(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTextsList getCountriesTexts(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCountriesTexts(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTextsList getCountriesTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCountriesTexts(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTextsList getCountriesTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.CountriesTexts.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.countriesTexts), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCountriesTexts1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCountriesTexts1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_CountriesTexts.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.countriesTexts), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1WithKey(final String locale, final String code)
    {
        return this.getCountriesTexts1WithKey(locale, code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCountriesTexts1WithKey(locale, code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCountriesTexts1WithKey(locale, code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CountriesTexts getCountriesTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCountriesTexts1(var_query.withKey(com.sap.cap.sflight.delta.proxy.CountriesTexts.key(locale, code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesList getCurrencies()
    {
        return this.getCurrencies(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesList getCurrencies(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCurrencies(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesList getCurrencies(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCurrencies(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesList getCurrencies(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Currencies.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.currencies), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCurrencies1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCurrencies1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Currencies.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.currencies), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1WithKey(final String code)
    {
        return this.getCurrencies1WithKey(code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCurrencies1WithKey(code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCurrencies1WithKey(code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Currencies getCurrencies1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCurrencies1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Currencies.key(code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTextsList getCurrenciesTexts()
    {
        return this.getCurrenciesTexts(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTextsList getCurrenciesTexts(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCurrenciesTexts(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTextsList getCurrenciesTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCurrenciesTexts(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTextsList getCurrenciesTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.CurrenciesTexts.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.currenciesTexts), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCurrenciesTexts1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCurrenciesTexts1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_CurrenciesTexts.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.currenciesTexts), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1WithKey(final String locale, final String code)
    {
        return this.getCurrenciesTexts1WithKey(locale, code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getCurrenciesTexts1WithKey(locale, code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getCurrenciesTexts1WithKey(locale, code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.CurrenciesTexts getCurrenciesTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCurrenciesTexts1(var_query.withKey(com.sap.cap.sflight.delta.proxy.CurrenciesTexts.key(locale, code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.FlightList getFlight()
    {
        return this.getFlight(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightList getFlight(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getFlight(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightList getFlight(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getFlight(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightList getFlight(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Flight.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.flight), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getFlight1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getFlight1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Flight.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.flight), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1WithKey(final String airlineID, final com.sap.cloud.server.odata.LocalDate flightDate, final String connectionID)
    {
        return this.getFlight1WithKey(airlineID, flightDate, connectionID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1WithKey(final String airlineID, final com.sap.cloud.server.odata.LocalDate flightDate, final String connectionID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getFlight1WithKey(airlineID, flightDate, connectionID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1WithKey(final String airlineID, final com.sap.cloud.server.odata.LocalDate flightDate, final String connectionID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getFlight1WithKey(airlineID, flightDate, connectionID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Flight getFlight1WithKey(final String airlineID, final com.sap.cloud.server.odata.LocalDate flightDate, final String connectionID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getFlight1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Flight.key(airlineID, flightDate, connectionID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnectionList getFlightConnection()
    {
        return this.getFlightConnection(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnectionList getFlightConnection(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getFlightConnection(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnectionList getFlightConnection(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getFlightConnection(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnectionList getFlightConnection(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.FlightConnection.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.flightConnection), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getFlightConnection1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getFlightConnection1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_FlightConnection.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.flightConnection), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1WithKey(final String connectionID, final String airlineID)
    {
        return this.getFlightConnection1WithKey(connectionID, airlineID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1WithKey(final String connectionID, final String airlineID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getFlightConnection1WithKey(connectionID, airlineID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1WithKey(final String connectionID, final String airlineID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getFlightConnection1WithKey(connectionID, airlineID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.FlightConnection getFlightConnection1WithKey(final String connectionID, final String airlineID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getFlightConnection1(var_query.withKey(com.sap.cap.sflight.delta.proxy.FlightConnection.key(connectionID, airlineID)), headers, options);
    }

    @Override public com.sap.cloud.server.odata.MetadataLock getMetadataLock()
    {
        return com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.lock;
    }

    public com.sap.cap.sflight.delta.proxy.PassengerList getPassenger()
    {
        return this.getPassenger(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.PassengerList getPassenger(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getPassenger(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.PassengerList getPassenger(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getPassenger(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.PassengerList getPassenger(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Passenger.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.passenger), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getPassenger1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getPassenger1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Passenger.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.passenger), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1WithKey(final String customerID)
    {
        return this.getPassenger1WithKey(customerID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1WithKey(final String customerID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getPassenger1WithKey(customerID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1WithKey(final String customerID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getPassenger1WithKey(customerID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Passenger getPassenger1WithKey(final String customerID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getPassenger1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Passenger.key(customerID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementList getSupplement()
    {
        return this.getSupplement(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementList getSupplement(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplement(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementList getSupplement(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplement(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementList getSupplement(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Supplement.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplement), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplement1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplement1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Supplement.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplement), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1WithKey(final String supplementID)
    {
        return this.getSupplement1WithKey(supplementID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1WithKey(final String supplementID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplement1WithKey(supplementID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1WithKey(final String supplementID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplement1WithKey(supplementID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Supplement getSupplement1WithKey(final String supplementID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getSupplement1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Supplement.key(supplementID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTextsList getSupplementTexts()
    {
        return this.getSupplementTexts(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTextsList getSupplementTexts(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementTexts(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTextsList getSupplementTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementTexts(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTextsList getSupplementTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.SupplementTexts.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplementTexts), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementTexts1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementTexts1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTexts.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplementTexts), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1WithKey(final String locale, final String supplementID)
    {
        return this.getSupplementTexts1WithKey(locale, supplementID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1WithKey(final String locale, final String supplementID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementTexts1WithKey(locale, supplementID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1WithKey(final String locale, final String supplementID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementTexts1WithKey(locale, supplementID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTexts getSupplementTexts1WithKey(final String locale, final String supplementID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getSupplementTexts1(var_query.withKey(com.sap.cap.sflight.delta.proxy.SupplementTexts.key(locale, supplementID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeList getSupplementType()
    {
        return this.getSupplementType(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeList getSupplementType(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementType(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeList getSupplementType(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementType(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeList getSupplementType(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.SupplementType.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplementType), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementType1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementType1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementType.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplementType), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1WithKey(final String code)
    {
        return this.getSupplementType1WithKey(code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementType1WithKey(code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementType1WithKey(code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementType getSupplementType1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getSupplementType1(var_query.withKey(com.sap.cap.sflight.delta.proxy.SupplementType.key(code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList getSupplementTypeTexts()
    {
        return this.getSupplementTypeTexts(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList getSupplementTypeTexts(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementTypeTexts(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList getSupplementTypeTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementTypeTexts(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTextsList getSupplementTypeTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplementTypeTexts), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementTypeTexts1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementTypeTexts1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_SupplementTypeTexts.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.supplementTypeTexts), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1WithKey(final String locale, final String code)
    {
        return this.getSupplementTypeTexts1WithKey(locale, code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getSupplementTypeTexts1WithKey(locale, code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getSupplementTypeTexts1WithKey(locale, code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.SupplementTypeTexts getSupplementTypeTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getSupplementTypeTexts1(var_query.withKey(com.sap.cap.sflight.delta.proxy.SupplementTypeTexts.key(locale, code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.TravelList getTravel()
    {
        return this.getTravel(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelList getTravel(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravel(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelList getTravel(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravel(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelList getTravel(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.Travel.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travel), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravel1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravel1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_Travel.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travel), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1WithKey(final com.sap.cloud.server.odata.GuidValue travelUUID)
    {
        return this.getTravel1WithKey(travelUUID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1WithKey(final com.sap.cloud.server.odata.GuidValue travelUUID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravel1WithKey(travelUUID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1WithKey(final com.sap.cloud.server.odata.GuidValue travelUUID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravel1WithKey(travelUUID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.Travel getTravel1WithKey(final com.sap.cloud.server.odata.GuidValue travelUUID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getTravel1(var_query.withKey(com.sap.cap.sflight.delta.proxy.Travel.key(travelUUID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgencyList getTravelAgency()
    {
        return this.getTravelAgency(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgencyList getTravelAgency(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelAgency(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgencyList getTravelAgency(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelAgency(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgencyList getTravelAgency(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.TravelAgency.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travelAgency), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelAgency1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelAgency1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelAgency.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travelAgency), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1WithKey(final String agencyID)
    {
        return this.getTravelAgency1WithKey(agencyID, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1WithKey(final String agencyID, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelAgency1WithKey(agencyID, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1WithKey(final String agencyID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelAgency1WithKey(agencyID, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelAgency getTravelAgency1WithKey(final String agencyID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getTravelAgency1(var_query.withKey(com.sap.cap.sflight.delta.proxy.TravelAgency.key(agencyID)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusList getTravelStatus()
    {
        return this.getTravelStatus(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusList getTravelStatus(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelStatus(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusList getTravelStatus(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelStatus(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusList getTravelStatus(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.TravelStatus.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travelStatus), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelStatus1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelStatus1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelStatus.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travelStatus), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1WithKey(final String code)
    {
        return this.getTravelStatus1WithKey(code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelStatus1WithKey(code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelStatus1WithKey(code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatus getTravelStatus1WithKey(final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getTravelStatus1(var_query.withKey(com.sap.cap.sflight.delta.proxy.TravelStatus.key(code)), headers, options);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTextsList getTravelStatusTexts()
    {
        return this.getTravelStatusTexts(null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTextsList getTravelStatusTexts(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelStatusTexts(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTextsList getTravelStatusTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelStatusTexts(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTextsList getTravelStatusTexts(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return com.sap.cap.sflight.delta.proxy.TravelStatusTexts.list(this.executeQuery(var_query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travelStatusTexts), headers, options).getEntityList());
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1(final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelStatusTexts1(query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelStatusTexts1(query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        return com.sap.cap.sflight.delta.proxy.internal.Any_as_com_sap_cap_sflight_delta_proxy_TravelStatusTexts.cast(this.executeQuery(query.fromDefault(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.EntitySets.travelStatusTexts), headers, options).getRequiredEntity());
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1WithKey(final String locale, final String code)
    {
        return this.getTravelStatusTexts1WithKey(locale, code, null, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query)
    {
        return this.getTravelStatusTexts1WithKey(locale, code, query, null, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        return this.getTravelStatusTexts1WithKey(locale, code, query, headers, null);
    }

    public com.sap.cap.sflight.delta.proxy.TravelStatusTexts getTravelStatusTexts1WithKey(final String locale, final String code, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getTravelStatusTexts1(var_query.withKey(com.sap.cap.sflight.delta.proxy.TravelStatusTexts.key(locale, code)), headers, options);
    }

    @Override public void refreshMetadata()
    {
        com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
    }

    public void rejectTravel(final com.sap.cloud.server.odata.BindingPath in)
    {
        this.rejectTravel(in, null, null, null);
    }

    public void rejectTravel(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query)
    {
        this.rejectTravel(in, query, null, null);
    }

    public void rejectTravel(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        this.rejectTravel(in, query, headers, null);
    }

    public void rejectTravel(final com.sap.cloud.server.odata.BindingPath in, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        com.sap.cloud.server.odata.core.Ignore.valueOf_any(this.executeQuery(var_query.bind(in).invoke(com.sap.cap.sflight.delta.proxy.ProxyServiceMetadata.BoundActions.rejectTravel, com.sap.cloud.server.odata.ParameterList.empty), headers, options));
    }
}
