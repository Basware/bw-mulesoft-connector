package com.mulesoft.connectors.baswareconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.extension.BaswareConnector;

public class GetV1ExportedContractSpendsExternalCodeOutputMetadataResolver
    extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-v1-exported-contract-spends-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnector.API_METADATA_CATEGORY;
  }
}
