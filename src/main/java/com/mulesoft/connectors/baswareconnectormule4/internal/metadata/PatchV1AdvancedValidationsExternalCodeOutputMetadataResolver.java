package com.mulesoft.connectors.baswareconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.extension.BaswareConnectorMule4Connector;

public class PatchV1AdvancedValidationsExternalCodeOutputMetadataResolver
    extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-v1-advanced-validations-external-code-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnectorMule4Connector.API_METADATA_CATEGORY;
  }
}
