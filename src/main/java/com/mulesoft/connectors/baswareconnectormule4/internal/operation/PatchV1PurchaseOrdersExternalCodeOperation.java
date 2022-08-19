package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PatchV1PurchaseOrdersExternalCodeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PatchV1PurchaseOrdersExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PatchV1PurchaseOrdersExternalCodeOperationRefinement;
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
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PatchV1PurchaseOrdersExternalCodeOperation
    extends PatchV1PurchaseOrdersExternalCodeOperationRefinement {
  public PatchV1PurchaseOrdersExternalCodeOperation() {
    super();
  }

  public PatchV1PurchaseOrdersExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Field 'processingStatus' requires a value from API user in POST and PATCH request. If
   * you need to import an order with more than 200 lines, this can be done by setting
   * 'processingStatus' to 'Uncompleted' when POSTing the purchaseOrder and then adding additional
   * lines to it using the PATCH method. ProcessingStaus: 'Uncompleted' prevents the order from
   * being set to P2P so that more lines can be added. When all lines have been added, set
   * 'processingStaus' = 'ReadyForImport' using PATCH method and the order will be imported to P2P.
   * 2) Basware API considers 'null' value in field(s) equivalent to the field(s) not being sent.
   * For this reason patch method does not support setting field values to 'null'.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP PATCH request to the /v1/purchaseOrders/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The externalCode of the imported purchase order to be updated
   * @param patchV1PurchaseOrdersExternalCodeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Patch purchase orders")
  @Summary(
      "Notes: \r\n"
          + "1) Field 'processingStatus' requires a value from API user in POST and PATCH request.")
  @MediaType("application/json")
  @OutputResolver(
      output = PatchV1PurchaseOrdersExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void patchV1PurchaseOrdersExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code")
          @Summary("The externalCode of the imported purchase order to be updated")
          String externalCodeUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PatchV1PurchaseOrdersExternalCodeInputMetadataResolver.class)
          TypedValue<InputStream> patchV1PurchaseOrdersExternalCodeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.patchV1PurchaseOrdersExternalCode(
        config,
        connection,
        externalCodeUriParam,
        patchV1PurchaseOrdersExternalCodeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
