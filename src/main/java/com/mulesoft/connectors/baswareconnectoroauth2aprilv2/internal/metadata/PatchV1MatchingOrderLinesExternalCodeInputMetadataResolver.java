package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.extension.BaswareConnectorOauth2aprilv2Connector;

public class PatchV1MatchingOrderLinesExternalCodeInputMetadataResolver
    extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-v1-matching-order-lines-external-code-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnectorOauth2aprilv2Connector.API_METADATA_CATEGORY;
  }
}
