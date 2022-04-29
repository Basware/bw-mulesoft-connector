package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1AccountingDocumentsInvoiceIdPrebookResponsesInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1AccountingDocumentsInvoiceIdPrebookResponsesOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.PostV1AccountingDocumentsInvoiceIdPrebookResponsesOperationRefinement;
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
public class PostV1AccountingDocumentsInvoiceIdPrebookResponsesOperation
    extends PostV1AccountingDocumentsInvoiceIdPrebookResponsesOperationRefinement {
  public PostV1AccountingDocumentsInvoiceIdPrebookResponsesOperation() {
    super();
  }

  public PostV1AccountingDocumentsInvoiceIdPrebookResponsesOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1. Prebook responses for already prebooked invoices (where processingStatus =
   * 'Prebooked') are not allowed. 2. Saving voucher numbers and payment block -information to the
   * invoice in P2P requires a succesful prebook response from ERP ('success' = 'true'). The
   * responseMessage gets saved also when success = false. 3. Please do not send acknowledge and
   * prebookResponse at the same time for the same invoice. If acknowledge is used, please wait for
   * acknowledge to complete before sending the transferResponse. 4. Prebook failed -invoices
   * (success = false) are processed manually in P2P.
   *
   * <p>Please see section "[Usage scenario 3: Prebook and transfer invoice to
   * Accounting](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay
   * API manual for details on implementing invoice transfer process with Basware API.
   *
   * <p>This operation makes an HTTP POST request to the
   * /v1/accountingDocuments/{invoiceId}/prebookResponses endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param invoiceIdUriParam Invoice Id of the accountingDocument to be updated
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1AccountingDocumentsInvoiceIdPrebookResponsesBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create v1 accounting documents prebook responses by invoice id")
  @Summary(
      "Notes: \r\n"
          + "1. Prebook responses for already prebooked invoices (where processingStatus = 'Prebooked') are not allowed.\r\n"
          + "2. Saving voucher numbers and payment block -information to the invoice in P2P requires a succesful prebook response from ERP ('success' = 'true').")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1AccountingDocumentsInvoiceIdPrebookResponsesOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1AccountingDocumentsInvoiceIdPrebookResponses(
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
              PostV1AccountingDocumentsInvoiceIdPrebookResponsesInputMetadataResolver.class)
          TypedValue<InputStream> postV1AccountingDocumentsInvoiceIdPrebookResponsesBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1AccountingDocumentsInvoiceIdPrebookResponses(
        config,
        connection,
        invoiceIdUriParam,
        contentTypeHeader,
        postV1AccountingDocumentsInvoiceIdPrebookResponsesBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
