package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1CostCentersExternalCodeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1CostCentersExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PatchV1CostCentersExternalCodeOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PatchV1CostCentersExternalCodeOperation
    extends PatchV1CostCentersExternalCodeOperationRefinement {
  public PatchV1CostCentersExternalCodeOperation() {
    super();
  }

  public PatchV1CostCentersExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Patch cost centers
   *
   * <p>This operation makes an HTTP PATCH request to the /v1/costCenters/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The ExternalCode of the CostCenter to be updated
   * @param patchV1CostCentersExternalCodeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Patch cost centers")
  @MediaType("application/json")
  @OutputResolver(
      output = PatchV1CostCentersExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void patchV1CostCentersExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code") @Summary("The ExternalCode of the CostCenter to be updated")
          String externalCodeUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PatchV1CostCentersExternalCodeInputMetadataResolver.class)
          TypedValue<InputStream> patchV1CostCentersExternalCodeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.patchV1CostCentersExternalCode(
        config,
        connection,
        externalCodeUriParam,
        patchV1CostCentersExternalCodeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
