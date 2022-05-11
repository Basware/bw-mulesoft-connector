package com.mulesoft.connectors.baswareconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.extension.BaswareConnector;

public class PatchV1MatchingOrdersExternalCodeInputMetadataResolver
    extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-v1-matching-orders-external-code-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnector.API_METADATA_CATEGORY;
  }
}
