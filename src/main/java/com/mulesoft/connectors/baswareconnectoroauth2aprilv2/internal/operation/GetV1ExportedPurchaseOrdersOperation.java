package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata.GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.GetV1ExportedPurchaseOrdersOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.GetV1ExportedPurchaseOrdersOperationRefinement;
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
public class GetV1ExportedPurchaseOrdersOperation
    extends GetV1ExportedPurchaseOrdersOperationRefinement {
  public GetV1ExportedPurchaseOrdersOperation() {
    super();
  }

  public GetV1ExportedPurchaseOrdersOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) This API supports sending webhook based [push
   * notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is
   * available to be exported. 2) This GET operation returns a HTTP redirect, which the API client
   * needs to follow. * 'Authorization' header must not be included in the redirected request (the
   * second request after receiving a redirect). * 'Host' header needs to be included.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API.
   *
   * <p>This operation makes an HTTP GET request to the /v1/exportedPurchaseOrders endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param orderStatusQueryParam Document status filter. Returns items by order document status.
   * @param pageSizeQueryParam A limit for the number of items to be returned for one request. Limit
   *     can range between 1 and 100 items.
   * @param companyCodeQueryParam Company filter. Returns items for specific company.
   * @param lastUpdatedQueryParam Date filter. Returns items that have been updated after specified
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
  @DisplayName("Get v1 exported purchase orders")
  @Summary(
      "Notes: \r\n"
          + "1) This API supports sending webhook based  [push notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is available to be exported. \r\n"
          + "2) This GET operation returns a HTTP redirect, which the API client needs to follow.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ExportedPurchaseOrdersOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ExportedPurchaseOrders(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Order Status")
          @Summary("Document status filter. Returns items by order document status.")
          GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum orderStatusQueryParam,
      @Optional(defaultValue = "100")
          @DisplayName("Page Size")
          @Summary(
              "A limit for the number of items to be returned for one request. Limit can range between 1 and 100 items.")
          Integer pageSizeQueryParam,
      @Optional
          @DisplayName("Company Code")
          @Summary("Company filter. Returns items for specific company.")
          String companyCodeQueryParam,
      @Optional
          @DisplayName("Last Updated")
          @Summary("Date filter. Returns items that have been updated after specified date.")
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
    super.getV1ExportedPurchaseOrders(
        config,
        connection,
        orderStatusQueryParam,
        pageSizeQueryParam,
        companyCodeQueryParam,
        lastUpdatedQueryParam,
        xAmzMetaContinuationtokenHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
