package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1MatchingOrderLinesInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1MatchingOrderLinesOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.PostV1MatchingOrderLinesOperationRefinement;
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
public class PostV1MatchingOrderLinesOperation extends PostV1MatchingOrderLinesOperationRefinement {
  public PostV1MatchingOrderLinesOperation() {
    super();
  }

  public PostV1MatchingOrderLinesOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Please make sure you have POSTed the order header through matchingOrders API before
   * posting lines to the same order to matchingOrderLines API. It is enough to POST the order
   * header only once (unless updates are neede to the order header). 2) Up to 100 order lines can
   * be posted in one request. Order lines for an order containing more than 100 lines need to be
   * posted in several requets. 3) A single POST operation is saved to P2P in a single transaction.
   * Multiple POST operations will be saved each in their own transactions. 4) Invoiced quantities
   * and sums need to be imported before matching has been performed against the order in P2P. 5)
   * Field 'isDeleted' needs to have a value other than null when bestfit matching is used on the
   * order in P2P.
   *
   * <p>Please see section "[Usage scenario 2: Import external purchase orders for Order
   * Matching](https://developer.basware.com/api/p2p/manual#usage2)" for details on implementing
   * this API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/matchingOrderLines endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1MatchingOrderLinesBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create v1 matching order lines")
  @Summary(
      "Notes:\r\n"
          + "1) Please make sure you have POSTed the order header through matchingOrders API before posting lines to the same order to matchingOrderLines API. It is enough to POST the order header only once (unless updates are neede to the order header).")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1MatchingOrderLinesOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1MatchingOrderLines(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1MatchingOrderLinesInputMetadataResolver.class)
          TypedValue<InputStream> postV1MatchingOrderLinesBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1MatchingOrderLines(
        config,
        connection,
        contentTypeHeader,
        postV1MatchingOrderLinesBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
