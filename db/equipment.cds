namespace sap.cache.equipment;

@sap.deletable      : 'false'
@sap.content.version: '1'
@sap.label          : 'Equipment'
entity Equipment {
        @sap.display.format: 'UpperCase'
        @sap.label         : 'Equipment'
        @sap.quickinfo     : 'Equipment Number'
        @sap.updatable     : 'false'
    key Equipment                      : String(18) not null;

        @sap.display.format: 'Date'
        @sap.label         : 'Valid To'
        @sap.quickinfo     : 'Valid To Date'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
    key ValidityEndDate                : Date not null;

        @sap.label         : 'Time'
        @sap.quickinfo     : 'Equipment usage period time stamp'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        ValidityEndTime                : Time;

        @odata.Type        : 'Edm.DateTimeOffset'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentValidityEndDateTime   : DateTime;

        @sap.display.format: 'Date'
        @sap.label         : 'Valid From'
        @sap.quickinfo     : 'Valid-From Date'
        ValidityStartDate              : Date;

        @sap.label         : 'Equip Obj Instce ID'
        @sap.quickinfo     : 'Object Instance ID of an Equipment'
        EquipmentOID                   : String(128);

        @sap.label         : 'Object Description'
        @sap.quickinfo     : 'Description of technical object'
        EquipmentName                  : String(40);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Equipment category'
        EquipmentCategory              : String(1);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Object Type'
        @sap.quickinfo     : 'Type of Technical Object'
        TechnicalObjectType            : String(10);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Authorization Group'
        @sap.quickinfo     : 'Technical Object Authorization Group'
        AuthorizationGroup             : String(4);

        @sap.unit          : 'GrossWeightUnit'
        @sap.label         : 'Weight of object'
        GrossWeight                    : Decimal(13, 3);

        @sap.label         : 'Unit of weight'
        @sap.semantics     : 'unit-of-measure'
        GrossWeightUnit                : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Size/dimension'
        SizeOrDimensionText            : String(18);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Inventory Number'
        @sap.quickinfo     : 'Inventory number'
        InventoryNumber                : String(25);

        @sap.display.format: 'Date'
        @sap.label         : 'Start-up date'
        @sap.quickinfo     : 'Start-up Date of the Technical Object'
        OperationStartDate             : Date;

        @sap.unit          : 'Currency'
        @sap.variable.scale: 'true'
        @sap.label         : 'Acquisition Value'
        AcquisitionValue               : Decimal(13, 3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Currency'
        @sap.quickinfo     : 'Currency Key'
        @sap.semantics     : 'currency-code'
        Currency                       : String(5);

        @sap.display.format: 'Date'
        @sap.label         : 'Acquisition date'
        AcquisitionDate                : Date;

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Maintenance Plan'
        MaintenancePlan                : String(12);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Measuring point'
        @sap.quickinfo     : 'Measuring Point'
        MeasuringPoint                 : String(12);

        @sap.label         : 'Manufacturer'
        @sap.quickinfo     : 'Manufacturer of Asset'
        AssetManufacturerName          : String(30);

        @sap.label         : 'Model number'
        @sap.quickinfo     : 'Manufacturer model number'
        ManufacturerPartTypeName       : String(20);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Mfr Ctry/Reg'
        @sap.quickinfo     : 'Country/Region of Manufacture'
        ManufacturerCountry            : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Construction year'
        @sap.quickinfo     : 'Year of construction'
        ConstructionYear               : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Construction month'
        @sap.quickinfo     : 'Month of construction'
        ConstructionMonth              : String(2);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'ManufactPartNo.'
        @sap.quickinfo     : 'Manufacturer part number'
        ManufacturerPartNmbr           : String(30);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Manuf. Serial Number'
        @sap.quickinfo     : 'Manufacturer''s Serial Number'
        ManufacturerSerialNumber       : String(30);

        @sap.display.format: 'Date'
        @sap.label         : 'End-of-Use Date'
        @sap.quickinfo     : 'End-of-Use Date of the Technical Object'
        EquipmentEndOfUseDate          : Date;

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Maintenance Plant'
        MaintenancePlant               : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Location'
        @sap.quickinfo     : 'Location of maintenance object'
        AssetLocation                  : String(10);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Room'
        AssetRoom                      : String(8);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Plant Section'
        PlantSection                   : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Work Center'
        WorkCenter                     : String(8);

        @sap.display.format: 'NonNegative'
        @sap.label         : 'PP work center'
        @sap.quickinfo     : 'Object ID of PP work center'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        WorkCenterInternalID           : String(8);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Plant'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        WorkCenterPlant                : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'ABC Indicator'
        @sap.quickinfo     : 'ABC Indicator for Technical Object'
        ABCIndicator                   : String(1);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Sort Field'
        MaintObjectFreeDefinedAttrib   : String(30);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Title Key'
        @sap.quickinfo     : 'Form-of-Address Key'
        FormOfAddress                  : String(4);

        @sap.label         : 'Name'
        @sap.quickinfo     : 'Name 1'
        BusinessPartnerName1           : String(40);

        @sap.label: 'Name 2'
        BusinessPartnerName2           : String(40);

        @sap.label: 'City'
        CityName                       : String(40);

        @sap.label: 'House Number'
        HouseNumber                    : String(10);

        @sap.label         : 'Supplement'
        @sap.quickinfo     : 'House number supplement'
        HouseNumberSupplementText      : String(10);

        @sap.label         : 'Building Code'
        @sap.quickinfo     : 'Building (Number or Code)'
        Building                       : String(20);

        @sap.label         : 'Floor'
        @sap.quickinfo     : 'Floor in building'
        Floor                          : String(10);

        @sap.label         : 'Room Number'
        @sap.quickinfo     : 'Room or Apartment Number'
        RoomNumber                     : String(10);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Postal Code'
        @sap.quickinfo     : 'City postal code'
        PostalCode                     : String(10);

        @sap.label: 'Street'
        StreetName                     : String(60);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Region'
        @sap.quickinfo     : 'Region (State, Province, County)'
        Region                         : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Country/Region Key'
        Country                        : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Telephone'
        @sap.quickinfo     : 'Telephone No.: Dialing Code and Number'
        PhoneNumber                    : String(30);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Fax'
        @sap.quickinfo     : 'Fax Number: Dialing Code and Number'
        FaxNumber                      : String(30);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Company Code'
        CompanyCode                    : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Business Area'
        BusinessArea                   : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Asset'
        @sap.quickinfo     : 'Main Asset Number'
        MasterFixedAsset               : String(12);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Subnumber'
        @sap.quickinfo     : 'Asset Subnumber'
        FixedAsset                     : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Cost Center'
        CostCenter                     : String(10);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Controlling Area'
        ControllingArea                : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'WBS Element'
        @sap.quickinfo     : 'Work Breakdown Structure Element (WBS Element) Edited'
        WBSElementExternalID           : String(24);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Settlement Order'
        @sap.quickinfo     : 'Settlement order'
        SettlementOrder                : String(12);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Planning Plant'
        @sap.quickinfo     : 'Maintenance Planning Plant'
        MaintenancePlanningPlant       : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Maint. Planner Group'
        @sap.quickinfo     : 'Planner Group for Customer Service and Plant Maintenance'
        MaintenancePlannerGroup        : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Main Work Center'
        @sap.quickinfo     : 'Main work center for maintenance tasks'
        MainWorkCenter                 : String(8);

        @sap.display.format: 'NonNegative'
        @sap.label         : 'Work Center'
        @sap.quickinfo     : 'Object ID of the Work Center'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        MainWorkCenterInternalID       : String(8);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Plant for WorkCenter'
        @sap.quickinfo     : 'Plant associated with main work center'
        MainWorkCenterPlant            : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Catalog Profile'
        CatalogProfile                 : String(9);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Object ID'
        @sap.quickinfo     : 'Object ID of Functional Location or Equipment'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        FunctionalLocation             : String(30);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Functional Location'
        @sap.quickinfo     : 'Functional Location Label'
        FunctionalLocationLabelName    : String(40);

        @sap.label         : 'FunctLocDescrip.'
        @sap.quickinfo     : 'Description of functional location'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        FunctionalLocationName         : String(40);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Position'
        @sap.quickinfo     : 'Equipment position at InstallLoc (Superior Equip./FunctLoc)'
        EquipInstallationPositionNmbr  : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Superord. Equipment'
        @sap.quickinfo     : 'Superordinate Equipment'
        SuperordinateEquipment         : String(18);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Technical IdentNo.'
        @sap.quickinfo     : 'Technical identification number'
        TechnicalObjectSortCode        : String(25);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Construction Type'
        @sap.quickinfo     : 'Construction type material of the object'
        ConstructionMaterial           : String(40);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Material'
        @sap.quickinfo     : 'Material Number'
        Material                       : String(40);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Serial Number'
        SerialNumber                   : String(18);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'UII'
        @sap.quickinfo     : 'Unique Item Identifier'
        UniqueItemIdentifier           : String(72);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'IUID Type'
        @sap.quickinfo     : 'Structure Type of UII'
        UniqueItemIdentifierStrucType  : String(10);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Resp. Plant UII'
        @sap.quickinfo     : 'Plant Responsible for UII'
        UniqueItemIdentifierRespPlant  : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Sales Organization'
        SalesOrganization              : String(4);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Distribution Channel'
        DistributionChannel            : String(2);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Division'
        OrganizationDivision           : String(2);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Sales Group'
        SalesGroup                     : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Sales Office'
        SalesOffice                    : String(4);

        @sap.display.format: 'Date'
        @sap.label         : 'Created On'
        @sap.quickinfo     : 'Record Created On'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        CreationDate                   : Date;

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Created By'
        @sap.quickinfo     : 'Name of Person Responsible for Creating the Object'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        CreatedByUser                  : String(12);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Changed By'
        @sap.quickinfo     : 'Name of Person Who Changed Object'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        LastChangedByUser              : String(12);

        @odata.Type        : 'Edm.DateTimeOffset'
        @sap.label         : 'Short Time Stamp'
        @sap.quickinfo     : 'UTC Time Stamp in Short Form (YYYYMMDDhhmmss)'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        LastChangeDateTime             : DateTime;

        @sap.display.format: 'NonNegative'
        @sap.label         : 'NxtUsagePeriodNo.'
        @sap.quickinfo     : 'Number of next EquipUsagePeriod on same day'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        NextEquipUsagePeriodSqncNmbr   : String(3);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Loc/Acct Assignment'
        @sap.quickinfo     : 'Location and account assignment for technical object'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        MaintObjectLocAcctAssgmtNmbr   : String(12);

        @sap.display.format: 'UpperCase'
        @sap.label         : 'Object number'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        MaintObjectInternalID          : String(22);

        @sap.display.format: 'NonNegative'
        @sap.label         : 'UsgePerConsecNo.'
        @sap.quickinfo     : 'Consecutive numbering of EquipUsagePeriods on same day'
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipUsagePeriodSequenceNumber : String(3);

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsAtCustomer          : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsAvailable           : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsInWarehouse         : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsAssignedToDelivery  : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsMarkedForDeletion   : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsInstalled           : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipIsAllocToSuperiorEquip    : Boolean;

        @sap.label         : 'Checkbox'
        @sap.heading       : ''
        @sap.creatable     : 'false'
        @sap.updatable     : 'false'
        EquipmentIsInactive            : Boolean;
        EquipHasSubOrdinateEquipment   : String(1);
// to_Classification : Composition of many EquipmentClass {  };
// to_LongText : Composition of EquipmentLongText {  };
// to_Partner : Composition of many EquipmentPartner {  };
// to_ProductionResourceTool : Composition of EquipProductionResourceTool {  };
// to_Warranty : Composition of many EquipmentWarranty {  };
}