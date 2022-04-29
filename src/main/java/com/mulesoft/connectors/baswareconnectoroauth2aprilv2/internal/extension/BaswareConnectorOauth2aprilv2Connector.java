package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.config.BaswareConnectorOauth2aprilv2Configuration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Basware Connector Oauth2aprilv2Connector")
@Xml(prefix = "basware-connector-oauth2aprilv2")
@Configurations({BaswareConnectorOauth2aprilv2Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class BaswareConnectorOauth2aprilv2Connector {
  public static final String API_METADATA_CATEGORY = "Basware ConnectorOAUTH2APRILv2 Connector";
}
