package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1PurchaseRequisitionsInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1PurchaseRequisitionsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.PostV1PurchaseRequisitionsOperationRefinement;
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
public class PostV1PurchaseRequisitionsOperation
    extends PostV1PurchaseRequisitionsOperationRefinement {
  public PostV1PurchaseRequisitionsOperation() {
    super();
  }

  public PostV1PurchaseRequisitionsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1. Any referenced vendors, users, etc. need to exist in P2P when the purchase
   * requisition is imported. 2. Updating data for existing requisitions is not supported. Posting
   * updates will result in errors in errorFeedbacks -interface and data will not be updated in
   * Alusta Purchase. The data will still be accepted and updated in Basware API. Because of this
   * updates to existing purchase requisition records will result in inconsistent data between GET
   * operations to Basware API and Alusta Purchase.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/purchaseRequisitions endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1PurchaseRequisitionsBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create v1 purchase requisitions")
  @Summary(
      " Notes: \r\n"
          + " 1. Any referenced vendors, users, etc. need to exist in P2P when the purchase requisition is imported. \r\n"
          + " 2. Updating data for existing requisitions is not supported. Posting updates will result in errors in errorFeedbacks -interface and data will not be updated in Alusta Purchase.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1PurchaseRequisitionsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1PurchaseRequisitions(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1PurchaseRequisitionsInputMetadataResolver.class)
          TypedValue<InputStream> postV1PurchaseRequisitionsBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1PurchaseRequisitions(
        config,
        connection,
        contentTypeHeader,
        postV1PurchaseRequisitionsBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
