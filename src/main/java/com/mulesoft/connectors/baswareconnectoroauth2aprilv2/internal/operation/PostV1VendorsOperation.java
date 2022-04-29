package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1VendorsInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1VendorsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.PostV1VendorsOperationRefinement;
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
public class PostV1VendorsOperation extends PostV1VendorsOperationRefinement {
  public PostV1VendorsOperation() {
    super();
  }

  public PostV1VendorsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Payment terms used by the vendor(s) need to exist in P2P. Payment terms can be
   * imported through paymentTerms API or maintained manually in P2P. 2) Currencies used by the
   * vendor(s) need to be active in P2P. Active currencies are maintained manually in P2P. 3)
   * Vendors used with P2P Purchase need to have 'orderingFormat' value different from 'none'.
   * 'OrderingFormat' field can be specified through vendors API (in orderingDetails -block), or it
   * can be manually maintained in P2P. 4) Posting vendors to Bsaware Portal requires company
   * structure to be imported to portal. The company structure can also be backfilled to portal from
   * P2P. 5) Up to 200 vendor records can be sent in one POST vendors request.
   *
   * <p>Check out the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/vendors endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1VendorsBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create v1 vendors")
  @Summary(
      "Notes: \r\n"
          + "1) Payment terms used by the vendor(s) need to exist in P2P. Payment terms can be imported through paymentTerms API or maintained manually in P2P.  \r\n"
          + "2) Currencies used by the vendor(s) need to be active in P2P. Active currencies are maintained manually in P2P.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1VendorsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1Vendors(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1VendorsInputMetadataResolver.class)
          TypedValue<InputStream> postV1VendorsBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1Vendors(
        config,
        connection,
        contentTypeHeader,
        postV1VendorsBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
