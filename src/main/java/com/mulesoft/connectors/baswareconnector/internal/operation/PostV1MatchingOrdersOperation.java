package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1MatchingOrdersInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1MatchingOrdersOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PostV1MatchingOrdersOperationRefinement;
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
public class PostV1MatchingOrdersOperation extends PostV1MatchingOrdersOperationRefinement {
  public PostV1MatchingOrdersOperation() {
    super();
  }

  public PostV1MatchingOrdersOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Please make sure you have POSTed the order header to matchingOrders API before
   * posting lines to the same order through matchingOrderLines API. It is enough to POST the order
   * header only once (unless updates are needed to the order header). The order becomes available
   * in P2P after order lines lines have been added. 2) Vendor(s) used by the order need to be in
   * P2P before importing the order. 3) The following fields uniquely identify an order in P2P:
   * Order number, source system, company code and organization element code.
   *
   * <p>Please see section "[Usage scenario 2: Import external purchase orders for Order
   * Matching](https://developer.basware.com/api/p2p/manual#usage2)" for details on implementing
   * this API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/matchingOrders endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1MatchingOrdersBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create matching orders")
  @Summary(
      "Notes: \r\n"
          + "1) Please make sure you have POSTed the order header to matchingOrders API before posting lines to the same order through matchingOrderLines API. It is enough to POST the order header only once (unless updates are needed to the order header).")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1MatchingOrdersOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1MatchingOrders(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1MatchingOrdersInputMetadataResolver.class)
          TypedValue<InputStream> postV1MatchingOrdersBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1MatchingOrders(
        config,
        connection,
        contentTypeHeader,
        postV1MatchingOrdersBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
