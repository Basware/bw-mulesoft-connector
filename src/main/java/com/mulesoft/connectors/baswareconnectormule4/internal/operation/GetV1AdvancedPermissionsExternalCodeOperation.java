package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.GetV1AdvancedPermissionsExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.GetV1AdvancedPermissionsExternalCodeOperationRefinement;
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
public class GetV1AdvancedPermissionsExternalCodeOperation
    extends GetV1AdvancedPermissionsExternalCodeOperationRefinement {
  public GetV1AdvancedPermissionsExternalCodeOperation() {
    super();
  }

  public GetV1AdvancedPermissionsExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Get advanced permissions by external code
   *
   * <p>This operation makes an HTTP GET request to the /v1/advancedPermissions/{externalCode}
   * endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The ExternalCode of the entity to be fetched
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get advanced permissions by external code")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1AdvancedPermissionsExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1AdvancedPermissionsExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code") @Summary("The ExternalCode of the entity to be fetched")
          String externalCodeUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1AdvancedPermissionsExternalCode(
        config, connection, externalCodeUriParam, parameters, overrides, streamingHelper, callback);
  }
}
