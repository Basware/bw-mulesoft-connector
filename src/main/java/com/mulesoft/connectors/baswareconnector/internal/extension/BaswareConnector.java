package com.mulesoft.connectors.baswareconnector.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.baswareconnector.internal.config.BaswareConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Basware Connector")
@Xml(prefix = "basware-connector")
@Configurations({BaswareConfiguration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class BaswareConnector {
  public static final String API_METADATA_CATEGORY = "Basware Connector";
}
