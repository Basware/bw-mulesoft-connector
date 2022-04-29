package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.GetV1ErrorFeedbacksRequestIdOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.GetV1ErrorFeedbacksRequestIdOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetV1ErrorFeedbacksRequestIdOperation
    extends GetV1ErrorFeedbacksRequestIdOperationRefinement {
  public GetV1ErrorFeedbacksRequestIdOperation() {
    super();
  }

  public GetV1ErrorFeedbacksRequestIdOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * If errors occur after Basware API has validated the data schema, these will be returned from
   * target systems asynchronously in this interface.
   *
   * <p>Please see section "[Usage scenario 5: Error handling and
   * monitoring](https://developer.basware.com/api/p2p/manual#usage5)" in Basware Purchase-to-Pay
   * API manual for details on implementing error handling with Basware API.
   *
   * <p>This operation makes an HTTP GET request to the /v1/errorFeedbacks/{requestId} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param requestIdUriParam The RequestId of the entity to be fetched
   * @param pageSizeQueryParam A limit for the number of items to be returned for one request. Limit
   *     can range between 1 and 500 items.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get v1 error feedbacks by request id")
  @Summary(
      "If errors occur after Basware API has validated the data schema, these will be returned from target systems asynchronously in this interface.\r\n"
          + "\r\n"
          + "Please see section \"[Usage scenario 5: Error handling and monitoring](https://developer.basware.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ErrorFeedbacksRequestIdOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ErrorFeedbacksRequestId(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Request Id") @Summary("The RequestId of the entity to be fetched")
          String requestIdUriParam,
      @Optional(defaultValue = "500")
          @DisplayName("Page Size")
          @Summary(
              "A limit for the number of items to be returned for one request. Limit can range between 1 and 500 items.")
          Integer pageSizeQueryParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1ErrorFeedbacksRequestId(
        config,
        connection,
        requestIdUriParam,
        pageSizeQueryParam,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
