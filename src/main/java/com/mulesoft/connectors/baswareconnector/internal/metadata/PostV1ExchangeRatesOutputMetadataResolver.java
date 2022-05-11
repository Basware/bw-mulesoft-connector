package com.mulesoft.connectors.baswareconnector.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.extension.BaswareConnector;

public class PostV1ExchangeRatesOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-v1-exchange-rates-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnector.API_METADATA_CATEGORY;
  }
}