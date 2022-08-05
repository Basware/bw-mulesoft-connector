package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.api.metadata.GetV1ErrorFeedbacksOperationEntityTypeQueryParamEnum;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.GetV1ErrorFeedbacksOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.GetV1ErrorFeedbacksOperationRefinement;
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
public class GetV1ErrorFeedbacksOperation extends GetV1ErrorFeedbacksOperationRefinement {
  public GetV1ErrorFeedbacksOperation() {
    super();
  }

  public GetV1ErrorFeedbacksOperation(ExpressionLanguage arg0) {
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
   * <p>This operation makes an HTTP GET request to the /v1/errorFeedbacks endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param targetSystemQueryParam Basware application module which has posted error ("P2P", "Vendor
   *     Manager", "Purchase Manager", etc.)
   * @param entityTypeQueryParam The EntityType of the entities to be fetched.
   * @param pageSizeQueryParam A limit for the number of items to be returned for one request. Limit
   *     can range between 1 and 500 items.
   * @param lastUpdatedQueryParam Date Filter. Returns items that have been updated after specified
   *     date.
   * @param xAmzMetaContinuationtokenHeader Used to get next page of results when item count
   *     indicated by 'pageSize' is exceeded. A token is returned in header (not body) parameter
   *     'X-amz-meta-continuationToken' of the response whenever there are more records to fetch.
   *     Post the received value here in a new HEADER parameter on the next GET request to receive
   *     the next page of results. When getting the next page of results, you must include the same
   *     query parameters that were used when getting the first page.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get error feedbacks")
  @Summary(
      "If errors occur after Basware API has validated the data schema, these will be returned from target systems asynchronously in this interface.\r\n"
          + "\r\n"
          + "Please see section \"[Usage scenario 5: Error handling and monitoring](https://developer.basware.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ErrorFeedbacksOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ErrorFeedbacks(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Target System")
          @Summary(
              "Basware application module which has posted error (\"P2P\", \"Vendor Manager\", \"Purchase Manager\", etc.)")
          String targetSystemQueryParam,
      @Optional
          @DisplayName("Entity Type")
          @Summary("The EntityType of the entities to be fetched.")
          GetV1ErrorFeedbacksOperationEntityTypeQueryParamEnum entityTypeQueryParam,
      @Optional(defaultValue = "500")
          @DisplayName("Page Size")
          @Summary(
              "A limit for the number of items to be returned for one request. Limit can range between 1 and 500 items.")
          Integer pageSizeQueryParam,
      @Optional
          @DisplayName("Last Updated")
          @Summary("Date Filter. Returns items that have been updated after specified date.")
          String lastUpdatedQueryParam,
      @Optional
          @DisplayName("X amz meta continuationtoken")
          @Summary(
              "Used to get next page of results when item count indicated by 'pageSize' is exceeded. A token is returned in header (not body) parameter 'X-amz-meta-continuationToken' of the response whenever there are more records to fetch.")
          String xAmzMetaContinuationtokenHeader,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1ErrorFeedbacks(
        config,
        connection,
        targetSystemQueryParam,
        entityTypeQueryParam,
        pageSizeQueryParam,
        lastUpdatedQueryParam,
        xAmzMetaContinuationtokenHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
