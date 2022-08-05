package com.mulesoft.connectors.baswareconnectormule4.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.baswareconnectormule4.internal.config.BaswareConnectorMule4Configuration;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Basware Connector Mule4Connector", category = Category.CERTIFIED)
@Xml(prefix = "basware-connector-mule-4")
@Configurations({BaswareConnectorMule4Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class BaswareConnectorMule4Connector {
  public static final String API_METADATA_CATEGORY = "Basware Connector - MULE 4 Connector";
}
