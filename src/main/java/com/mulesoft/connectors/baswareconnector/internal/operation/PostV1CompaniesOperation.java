package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1CompaniesInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1CompaniesOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PostV1CompaniesOperationRefinement;
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
public class PostV1CompaniesOperation extends PostV1CompaniesOperationRefinement {
  public PostV1CompaniesOperation() {
    super();
  }

  public PostV1CompaniesOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Note: Only consuming target system at the moment is Open Network Portal (incl. Vendor manager).
   * Companies cannot be imported to P2P through this API.
   *
   * <p>Please see section "[Usage scenario 6: Import
   * companies](https://developer.basware.com/api/p2p/manual#usage6)" of Basware Purchase-to-Pay API
   * manual for details on implementing this API.
   *
   * <p>This operation makes an HTTP POST request to the /v1/companies endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1CompaniesBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create companies")
  @Summary(
      "Note: Only consuming target system at the moment is Open Network Portal (incl. Vendor manager). Companies cannot be imported to P2P through this API. \r\n"
          + "\r\n"
          + "Please see section \"[Usage scenario 6: Import companies](https://developer.basware.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1CompaniesOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1Companies(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1CompaniesInputMetadataResolver.class)
          TypedValue<InputStream> postV1CompaniesBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1Companies(
        config,
        connection,
        contentTypeHeader,
        postV1CompaniesBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
