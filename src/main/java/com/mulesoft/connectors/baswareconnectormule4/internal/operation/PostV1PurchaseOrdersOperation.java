package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1PurchaseOrdersInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1PurchaseOrdersOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1PurchaseOrdersOperationRefinement;
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
public class PostV1PurchaseOrdersOperation extends PostV1PurchaseOrdersOperationRefinement {
  public PostV1PurchaseOrdersOperation() {
    super();
  }

  public PostV1PurchaseOrdersOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1. Any referenced vendors, users, payment terms, purchasing categories, quantity units,
   * etc. need to exist in P2P when the purchase order is posted. 2. Orders are technically handled
   * as auto-approved requisitions resulting in a corresponding order being created. If you don't
   * find the order in P2P UI, try looking for it as a requisition. It might have invalid data (see
   * above) or the requisition approval process may be configured in a way to block automatic order
   * creation. 3. Field 'processingStatus' requires a value from API user in POST and PATCH request.
   * If you need to import an order with more than 200 lines, this can be done by setting
   * 'processingStatus' to 'Uncompleted' when POSTing the purchaseOrder and then adding additional
   * lines to it using the PATCH method. ProcessingStaus: 'Uncompleted' prevents the order from
   * being set to P2P so that more lines can be added. When all lines have been added, set
   * 'processingStaus' = 'ReadyForImport' using PATCH method and the order will be imported to P2P.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/purchaseOrders endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1PurchaseOrdersBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create purchase orders")
  @Summary(
      "Notes: \r\n"
          + "1. Any referenced vendors, users, payment terms, purchasing categories, quantity units, etc. need to exist in P2P when the purchase order is posted.\r\n"
          + "2. Orders are technically handled as auto-approved requisitions resulting in a corresponding order being created.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1PurchaseOrdersOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1PurchaseOrders(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1PurchaseOrdersInputMetadataResolver.class)
          TypedValue<InputStream> postV1PurchaseOrdersBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1PurchaseOrders(
        config,
        connection,
        contentTypeHeader,
        postV1PurchaseOrdersBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
