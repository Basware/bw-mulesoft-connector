package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1PurchaseGoodsReceiptsInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1PurchaseGoodsReceiptsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1PurchaseGoodsReceiptsOperationRefinement;
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
public class PostV1PurchaseGoodsReceiptsOperation
    extends PostV1PurchaseGoodsReceiptsOperationRefinement {
  public PostV1PurchaseGoodsReceiptsOperation() {
    super();
  }

  public PostV1PurchaseGoodsReceiptsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Specifies a single goods receipt or reverse goods receipt document concerning one purchase
   * order. Goods receipt document can contain single receiving for some or all PO lines. So you can
   * receive all order lines, some order lines or some order lines partly. Reversing has reference
   * to GR document and line to reverse with negative quanties. For receiving or reversing to
   * succeed all lines need to exist in order having sufficient quantity to receive. They cannot be
   * closed, cancelled or matched. Several goods receipt documents can be sent for the same purchase
   * order in one JSON. Suggested practice is to group lines received at one time in one location
   * for the PO into a single goods receipt document. Notes: 1. All the lines received on single
   * goods receipt document must be ordered to the same delivery location as stated in order. Each
   * delivery location requires a separate goods receipt document. 2. A single goods receipt
   * document is processed fully when imported to P2P. There is no partial processing: All lines are
   * either accepted or the complete goods receipt document is rejected. 3. P2P supports reversing
   * GR documents. When sending a GR reversal, all lines on the GR document must be reversal lines.
   * Normal goods receipt lines and reversal lines cannot be mixed on the same goods reeipt
   * document.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/purchaseGoodsReceipts endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1PurchaseGoodsReceiptsBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create purchase goods receipts")
  @Summary(
      "Specifies a single goods receipt or reverse goods receipt document concerning one purchase order. Goods receipt document can contain single receiving for some or all PO lines. So you can receive all order lines, some order lines or some order lines partly.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1PurchaseGoodsReceiptsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1PurchaseGoodsReceipts(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1PurchaseGoodsReceiptsInputMetadataResolver.class)
          TypedValue<InputStream> postV1PurchaseGoodsReceiptsBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1PurchaseGoodsReceipts(
        config,
        connection,
        contentTypeHeader,
        postV1PurchaseGoodsReceiptsBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
