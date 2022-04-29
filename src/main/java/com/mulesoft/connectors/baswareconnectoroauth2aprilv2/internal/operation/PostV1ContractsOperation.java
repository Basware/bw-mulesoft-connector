package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1ContractsInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.metadata.PostV1ContractsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement.PostV1ContractsOperationRefinement;
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
public class PostV1ContractsOperation extends PostV1ContractsOperationRefinement {
  public PostV1ContractsOperation() {
    super();
  }

  public PostV1ContractsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1. The supplier and company code used need to exist in P2P. 2. P2P needs to know the
   * exchange rate from contract currency to company currency (if there are different).
   *
   * <p>This operation makes an HTTP POST request to the /v1/contracts endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1ContractsBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create v1 contracts")
  @Summary(
      "Notes: \r\n"
          + "1. The supplier and company code used need to exist in P2P. \r\n"
          + "2. P2P needs to know the exchange rate from contract currency to company currency (if there are different).")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1ContractsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1Contracts(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1ContractsInputMetadataResolver.class)
          TypedValue<InputStream> postV1ContractsBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1Contracts(
        config,
        connection,
        contentTypeHeader,
        postV1ContractsBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
