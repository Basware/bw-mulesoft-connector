package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.GetV1ApplicationGroupsApplicationGroupCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.GetV1ApplicationGroupsApplicationGroupCodeOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetV1ApplicationGroupsApplicationGroupCodeOperation
    extends GetV1ApplicationGroupsApplicationGroupCodeOperationRefinement {
  public GetV1ApplicationGroupsApplicationGroupCodeOperation() {
    super();
  }

  public GetV1ApplicationGroupsApplicationGroupCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Application groups give access to a specific set of applications for users imported through
   * 'users' API. Each user needs to be assigned to one or more application group(s) by specifying
   * 'applicationGroupCode' values in users API.
   *
   * <p>This operation makes an HTTP GET request to the /v1/applicationGroups/{applicationGroupCode}
   * endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param applicationGroupCodeUriParam The external code of the entity to be fetched
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get application groups by application group code")
  @Summary(
      "Application groups give access to a specific set of applications for users imported through 'users' API. Each user needs to be assigned to one or more application group(s) by specifying 'applicationGroupCode' values in users API.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ApplicationGroupsApplicationGroupCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ApplicationGroupsApplicationGroupCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Application Group Code")
          @Summary("The external code of the entity to be fetched")
          String applicationGroupCodeUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1ApplicationGroupsApplicationGroupCode(
        config,
        connection,
        applicationGroupCodeUriParam,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
