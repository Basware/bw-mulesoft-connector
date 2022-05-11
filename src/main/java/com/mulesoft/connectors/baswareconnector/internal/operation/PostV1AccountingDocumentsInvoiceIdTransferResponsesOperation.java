package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1AccountingDocumentsInvoiceIdTransferResponsesInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1AccountingDocumentsInvoiceIdTransferResponsesOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PostV1AccountingDocumentsInvoiceIdTransferResponsesOperationRefinement;
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
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PostV1AccountingDocumentsInvoiceIdTransferResponsesOperation
    extends PostV1AccountingDocumentsInvoiceIdTransferResponsesOperationRefinement {
  public PostV1AccountingDocumentsInvoiceIdTransferResponsesOperation() {
    super();
  }

  public PostV1AccountingDocumentsInvoiceIdTransferResponsesOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Transfer responses for already transferred invoices (where processingStatus =
   * 'Transferred') are not allowed. 2) Saving voucher numbers and payment block -information to the
   * invoice in P2P requires a succesful transfer to ERP ('success' = 'true'). The responseMessage
   * gets saved also when success = false. 3) Please do not send acknowledge and transferResponse
   * for at the same time for the same invoice. If acknowledge is used, please wait for acknowledge
   * to complete before sending the transferResponse.
   *
   * <p>Please see section "[Usage scenario 3: Prebook and transfer invoice to
   * Accounting](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay
   * API manual for details on implementing invoice transfer process with Basware API.
   *
   * <p>This operation makes an HTTP POST request to the
   * /v1/accountingDocuments/{invoiceId}/transferResponses endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param invoiceIdUriParam Invoice Id of the accountingDocument to be updated
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1AccountingDocumentsInvoiceIdTransferResponsesBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Accounting documents transfer responses")
  @Summary(
      "Notes: \r\n"
          + "1) Transfer responses for already transferred invoices (where processingStatus = 'Transferred') are not allowed. \r\n"
          + "2) Saving voucher numbers and payment block -information to the invoice in P2P requires a succesful transfer to ERP ('success' = 'true').")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1AccountingDocumentsInvoiceIdTransferResponsesOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1AccountingDocumentsInvoiceIdTransferResponses(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Invoice Id") @Summary("Invoice Id of the accountingDocument to be updated")
          String invoiceIdUriParam,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(
              PostV1AccountingDocumentsInvoiceIdTransferResponsesInputMetadataResolver.class)
          TypedValue<InputStream> postV1AccountingDocumentsInvoiceIdTransferResponsesBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1AccountingDocumentsInvoiceIdTransferResponses(
        config,
        connection,
        invoiceIdUriParam,
        contentTypeHeader,
        postV1AccountingDocumentsInvoiceIdTransferResponsesBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
