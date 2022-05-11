package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1MatchingOrdersExternalCodeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1MatchingOrdersExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PatchV1MatchingOrdersExternalCodeOperationRefinement;
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
public class PatchV1MatchingOrdersExternalCodeOperation
    extends PatchV1MatchingOrdersExternalCodeOperationRefinement {
  public PatchV1MatchingOrdersExternalCodeOperation() {
    super();
  }

  public PatchV1MatchingOrdersExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Note: Basware API considers 'null' value in field(s) equivalent to the field(s) not being sent.
   * For this reason patch method does not support setting field values to 'null'. Please see
   * section "[Usage scenario 2: Import external purchase orders for Order
   * Matching](https://developer.basware.com/api/p2p/manual#usage2)" for details on implementing
   * this API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP PATCH request to the /v1/matchingOrders/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The ExternalCode of the order to be updated
   * @param patchV1MatchingOrdersExternalCodeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Patch matching orders")
  @Summary(
      "Note: Basware API considers 'null' value in field(s) equivalent to the field(s) not being sent. For this reason patch method does not support setting field values to 'null'.\r\n"
          + "Please see section \"[Usage scenario 2: Import external purchase orders for Order Matching](https://developer.basware.")
  @MediaType("application/json")
  @OutputResolver(
      output = PatchV1MatchingOrdersExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void patchV1MatchingOrdersExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code") @Summary("The ExternalCode of the order to be updated")
          String externalCodeUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PatchV1MatchingOrdersExternalCodeInputMetadataResolver.class)
          TypedValue<InputStream> patchV1MatchingOrdersExternalCodeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.patchV1MatchingOrdersExternalCode(
        config,
        connection,
        externalCodeUriParam,
        patchV1MatchingOrdersExternalCodeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
