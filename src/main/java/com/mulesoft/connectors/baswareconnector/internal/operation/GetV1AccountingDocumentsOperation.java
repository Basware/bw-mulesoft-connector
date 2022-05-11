package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.api.metadata.GetV1AccountingDocumentsOperationProcessingStatusQueryParamEnum;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV1AccountingDocumentsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV1AccountingDocumentsOperationRefinement;
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
public class GetV1AccountingDocumentsOperation extends GetV1AccountingDocumentsOperationRefinement {
  public GetV1AccountingDocumentsOperation() {
    super();
  }

  public GetV1AccountingDocumentsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) This API supports sending webhook based [push
   * notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is
   * available to be exported. 2) This GET operation returns a HTTP redirect, which the API client
   * needs to follow. * 'Authorization' header must not be included in the redirected request (the
   * second request after receiving a redirect). * 'Host' header needs to be included.
   *
   * <p>Please see section "[Usage scenario 3: Prebook and transfer invoice to
   * Accounting](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay
   * API manual for details on implementing invoice transfer process with Basware API.
   *
   * <p>This operation makes an HTTP GET request to the /v1/accountingDocuments endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param processingStatusQueryParam Document status filter. Returns items by accounting document
   *     status. To get new invoices waiting for transfer, use filter 'WaitingForTransfer'. See
   *     [diagram on developer
   *     site](https://developer.basware.com/api/p2p/manual#ProcessingStatusDiagram) for details on
   *     available status transitions.
   * @param pageSizeQueryParam A limit for the number of items to be returned for one request. Limit
   *     can range between 1 and 100 items. For invoices with large numbers of coding rows, number
   *     of invoices returned will be less in order to limit response message size.
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
  @DisplayName("Get accounting documents")
  @Summary(
      "Notes: \r\n"
          + "1) This API supports sending webhook based  [push notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is available to be exported. \r\n"
          + "2) This GET operation returns a HTTP redirect, which the API client needs to follow.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1AccountingDocumentsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1AccountingDocuments(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Processing Status")
          @Summary(
              "Document status filter. Returns items by accounting document status. To get new invoices waiting for transfer, use filter 'WaitingForTransfer'. See [diagram on developer site](https://developer.basware.com/api/p2p/manual#ProcessingStatusDiagram) for details on available status transitions.")
          GetV1AccountingDocumentsOperationProcessingStatusQueryParamEnum
              processingStatusQueryParam,
      @Optional(defaultValue = "100")
          @DisplayName("Page Size")
          @Summary(
              "A limit for the number of items to be returned for one request. Limit can range between 1 and 100 items. For invoices with large numbers of coding rows, number of invoices returned will be less in order to limit response message size.")
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
    super.getV1AccountingDocuments(
        config,
        connection,
        processingStatusQueryParam,
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
