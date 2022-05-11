package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.api.metadata.GetV1ExportedContractSpendsOperationDocumentTypeQueryParamEnum;
import com.mulesoft.connectors.baswareconnector.api.metadata.GetV1ExportedContractSpendsOperationProcessingStatusQueryParamEnum;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV1ExportedContractSpendsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV1ExportedContractSpendsOperationRefinement;
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
public class GetV1ExportedContractSpendsOperation
    extends GetV1ExportedContractSpendsOperationRefinement {
  public GetV1ExportedContractSpendsOperation() {
    super();
  }

  public GetV1ExportedContractSpendsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Whether contract spends are collected is controlled by the fields 'invoiceSpend',
   * 'orderSpend' and 'spendPlanSpend'. Spend is not collected when these fields are set to 'false'.
   * 2) This API supports sending webhook based [push
   * notifications](https://developer.basware.com/api/p2p/manual#PushNotifications) when new data is
   * available to be exported. 3) This API exports spends for contracts imported through Basware
   * API. Spend is not exported for contracts imported through anyerp.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP GET request to the /v1/exportedContractSpends endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param processingStatusQueryParam Document status filter. Returns records by document status.
   *     Use 'WaitingForExport' to retrieve unacknowledged records.
   * @param documentTypeQueryParam Document type filter. Returns items for specific document type.
   * @param pageSizeQueryParam A limit for the number of items to be returned for one request. Limit
   *     can range between 1 and 500 items.
   * @param contractExternalCodeQueryParam Contract code filter. Returns items for specific
   *     contract.
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
  @DisplayName("Get exported contract spends")
  @Summary(
      "Notes: \r\n"
          + "1) Whether contract spends are collected is controlled by the fields 'invoiceSpend', 'orderSpend' and 'spendPlanSpend'. Spend is not collected when these fields are set to 'false'.\r\n"
          + "2) This API supports sending webhook based  [push notifications](https://developer.basware.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ExportedContractSpendsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ExportedContractSpends(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Processing Status")
          @Summary(
              "Document status filter. Returns records by document status. Use 'WaitingForExport' to retrieve unacknowledged records.")
          GetV1ExportedContractSpendsOperationProcessingStatusQueryParamEnum
              processingStatusQueryParam,
      @Optional
          @DisplayName("Document Type")
          @Summary("Document type filter. Returns items for specific document type.")
          GetV1ExportedContractSpendsOperationDocumentTypeQueryParamEnum documentTypeQueryParam,
      @Optional(defaultValue = "500")
          @DisplayName("Page Size")
          @Summary(
              "A limit for the number of items to be returned for one request. Limit can range between 1 and 500 items.")
          Integer pageSizeQueryParam,
      @Optional
          @DisplayName("Contract External Code")
          @Summary("Contract code filter. Returns items for specific contract.")
          String contractExternalCodeQueryParam,
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
    super.getV1ExportedContractSpends(
        config,
        connection,
        processingStatusQueryParam,
        documentTypeQueryParam,
        pageSizeQueryParam,
        contractExternalCodeQueryParam,
        lastUpdatedQueryParam,
        xAmzMetaContinuationtokenHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
