package com.mulesoft.connectors.baswareconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.extension.BaswareConnector;

public class GetV1MatchingOrderLinesOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-v1-matching-order-lines-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnector.API_METADATA_CATEGORY;
  }
}
