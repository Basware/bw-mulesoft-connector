package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1AccountingDocumentsInvoiceIdAcknowledgeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationRefinement;
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
public class PostV1AccountingDocumentsInvoiceIdAcknowledgeOperation
    extends PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationRefinement {
  public PostV1AccountingDocumentsInvoiceIdAcknowledgeOperation() {
    super();
  }

  public PostV1AccountingDocumentsInvoiceIdAcknowledgeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Updates 'processingStatus' -field on the invoice to allow filtering out the invoice
   * on the next GET operation. 2) For an invoice which is already acknowledged (processingStatus:
   * 'TransferInProgress' or 'PrebookInProgress'), API will return 405 'Method not allowed' if
   * acknowledge is attempted again on the invoice.
   *
   * <p>Please see section "[Usage scenario 3: Prebook and transfer invoice to
   * Accounting](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay
   * API manual for details on implementing invoice transfer process with Basware API.
   *
   * <p>This operation makes an HTTP POST request to the
   * /v1/accountingDocuments/{invoiceId}/acknowledge endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param invoiceIdUriParam Invoice Id of the accountingDocument to be acknowledged.
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Accounting documents acknowledge")
  @Summary(
      "Notes: \r\n"
          + "1) Updates 'processingStatus' -field on the invoice to allow filtering out the invoice on the next GET operation.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1AccountingDocumentsInvoiceIdAcknowledgeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1AccountingDocumentsInvoiceIdAcknowledge(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Invoice Id")
          @Summary("Invoice Id of the accountingDocument to be acknowledged.")
          String invoiceIdUriParam,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1AccountingDocumentsInvoiceIdAcknowledge(
        config,
        connection,
        invoiceIdUriParam,
        contentTypeHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
