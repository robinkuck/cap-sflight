package com.sap.cap.sflight.delta.proxy.internal;

public abstract class ProxyServiceMetadataParser
{
    public static final int options = (com.sap.cloud.server.odata.csdl.CsdlOption.ALLOW_CASE_CONFLICTS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_FACET_WARNINGS | com.sap.cloud.server.odata.csdl.CsdlOption.DISABLE_NAME_VALIDATION | com.sap.cloud.server.odata.csdl.CsdlOption.PROCESS_MIXED_VERSIONS | com.sap.cloud.server.odata.csdl.CsdlOption.RETAIN_ORIGINAL_TEXT | com.sap.cloud.server.odata.csdl.CsdlOption.IGNORE_UNDEFINED_TERMS);

    public static final com.sap.cloud.server.odata.csdl.CsdlDocument parsed = com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.parse();

    public static com.sap.cloud.server.odata.csdl.CsdlDocument parse()
    {
        final com.sap.cloud.server.odata.csdl.CsdlParser parser = new com.sap.cloud.server.odata.csdl.CsdlParser();
        parser.setLogWarnings(false);
        parser.setCsdlOptions(com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataParser.options);
        final com.sap.cloud.server.odata.csdl.CsdlDocument metadata = parser.parseInProxy(com.sap.cap.sflight.delta.proxy.internal.ProxyServiceMetadataText.XML, "TravelService");
        metadata.setProxyVersion("26.1.0-SNAPSHOT");
        return metadata;
    }
}
