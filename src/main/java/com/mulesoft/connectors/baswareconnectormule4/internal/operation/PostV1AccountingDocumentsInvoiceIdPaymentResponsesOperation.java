package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1AccountingDocumentsInvoiceIdPaymentResponsesInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1AccountingDocumentsInvoiceIdPaymentResponsesOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1AccountingDocumentsInvoiceIdPaymentResponsesOperationRefinement;
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
public class PostV1AccountingDocumentsInvoiceIdPaymentResponsesOperation
    extends PostV1AccountingDocumentsInvoiceIdPaymentResponsesOperationRefinement {
  public PostV1AccountingDocumentsInvoiceIdPaymentResponsesOperation() {
    super();
  }

  public PostV1AccountingDocumentsInvoiceIdPaymentResponsesOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Payment response can be sent multiple times for the same invoice (for example when
   * updating partial payments). When sending multiple payment responses to the same invoice,
   * externalCode needs to be different on each of the paymentResponse updates. 2) Please post a
   * payment response only when data related to it on the invoice has changed (do not post same
   * contents repeatedly). 3) Fields not included on the prebook response will be cleared (e.g.
   * paymentMethod). 4) Current date is defaulted as payment date if payment date is empty.
   *
   * <p>Please see section "[Usage scenario 3: Prebook and transfer invoice to
   * Accounting](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay
   * API manual for details on implementing invoice transfer process with Basware API.
   *
   * <p>This operation makes an HTTP POST request to the
   * /v1/accountingDocuments/{invoiceId}/paymentResponses endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param invoiceIdUriParam Invoice Id of the accountingDocument to be updated
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1AccountingDocumentsInvoiceIdPaymentResponsesBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Accounting documents payment responses")
  @Summary(
      "Notes: \r\n"
          + "1) Payment response can be sent multiple times for the same invoice (for example when updating partial payments). When sending multiple payment responses to the same invoice, externalCode needs to be different on each of the paymentResponse updates.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1AccountingDocumentsInvoiceIdPaymentResponsesOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1AccountingDocumentsInvoiceIdPaymentResponses(
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
              PostV1AccountingDocumentsInvoiceIdPaymentResponsesInputMetadataResolver.class)
          TypedValue<InputStream> postV1AccountingDocumentsInvoiceIdPaymentResponsesBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1AccountingDocumentsInvoiceIdPaymentResponses(
        config,
        connection,
        invoiceIdUriParam,
        contentTypeHeader,
        postV1AccountingDocumentsInvoiceIdPaymentResponsesBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
