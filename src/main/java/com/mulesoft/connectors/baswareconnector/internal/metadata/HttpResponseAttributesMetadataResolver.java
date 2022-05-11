package com.mulesoft.connectors.baswareconnector.internal.metadata;

import com.mulesoft.connectors.baswareconnector.internal.extension.BaswareConnector;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return BaswareConnector.API_METADATA_CATEGORY;
  }
}
