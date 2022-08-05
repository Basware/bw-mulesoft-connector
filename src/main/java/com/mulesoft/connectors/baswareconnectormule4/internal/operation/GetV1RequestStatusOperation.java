package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.api.metadata.GetV1RequestStatusOperationEntityTypeQueryParamEnum;
import com.mulesoft.connectors.baswareconnectormule4.api.metadata.GetV1RequestStatusOperationStatusQueryParamEnum;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.GetV1RequestStatusOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.GetV1RequestStatusOperationRefinement;
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
public class GetV1RequestStatusOperation extends GetV1RequestStatusOperationRefinement {
  public GetV1RequestStatusOperation() {
    super();
  }

  public GetV1RequestStatusOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) This API supports sending webhook based [push
   * notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is
   * available to be exported. 2) RequestStatus functionality is not yet available for 'users' API
   * for following target systems: * Network consumer (application codes 'SupplierPortal' and
   * 'SupplierManagement') * Basware Access
   *
   * <p>Please see section "[Usage scenario 5: Error handling and
   * monitoring](https://developer.basware.com/api/p2p/manual#usage5)" in Basware Purchase-to-Pay
   * API manual for details on implementing error handling with Basware API.
   *
   * <p>This operation makes an HTTP GET request to the /v1/requestStatus endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param statusQueryParam Allows filtering requests by status. Defaults to status â€˜Errorâ€™ if
   *     search is not narrowed-down by entityType or system.
   * @param entityTypeQueryParam Allows filtering requests by EntityType.
   * @param ignoreSuccessfullItemsQueryParam Allows filtering out succesful records within the
   *     response. Can be used to show only records with errors and records in progress.
   * @param systemQueryParam Allows limiting the responses to requests routed to a particular target
   *     system.
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
  @DisplayName("Get request status")
  @Summary(
      "Notes:\r\n"
          + "1) This API supports sending webhook based [push notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is available to be exported.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1RequestStatusOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1RequestStatus(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("status")
          @Summary(
              "Allows filtering requests by status. Defaults to status â€˜Errorâ€™ if search is not narrowed-down by entityType or system.")
          GetV1RequestStatusOperationStatusQueryParamEnum statusQueryParam,
      @Optional @DisplayName("Entity Type") @Summary("Allows filtering requests by EntityType.")
          GetV1RequestStatusOperationEntityTypeQueryParamEnum entityTypeQueryParam,
      @Optional
          @DisplayName("Ignore Successfull Items")
          @Summary(
              "Allows filtering out succesful records within the response. Can be used to show only records with errors and records in progress.")
          boolean ignoreSuccessfullItemsQueryParam,
      @Optional
          @DisplayName("system")
          @Summary(
              "Allows limiting the responses to requests routed to a particular target system.")
          String systemQueryParam,
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
    super.getV1RequestStatus(
        config,
        connection,
        statusQueryParam,
        entityTypeQueryParam,
        ignoreSuccessfullItemsQueryParam,
        systemQueryParam,
        pageSizeQueryParam,
        lastUpdatedQueryParam,
        xAmzMetaContinuationtokenHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
