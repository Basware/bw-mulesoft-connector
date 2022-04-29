package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.extension.BaswareConnectorOauth2aprilv2Connector;

public class DeleteV1PurchaseRequisitionsInputMetadataResolver extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/delete-v1-accounting-documents-input-schema.json";
  }

  @Override
  public String getCategoryName() {
    return BaswareConnectorOauth2aprilv2Connector.API_METADATA_CATEGORY;
  }
}
