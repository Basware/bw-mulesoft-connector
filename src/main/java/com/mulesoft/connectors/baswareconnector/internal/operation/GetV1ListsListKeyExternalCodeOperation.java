package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.api.metadata.GetV1ListsListKeyExternalCodeOperationListKeyUriParamEnum;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV1ListsListKeyExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV1ListsListKeyExternalCodeOperationRefinement;
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
public class GetV1ListsListKeyExternalCodeOperation
    extends GetV1ListsListKeyExternalCodeOperationRefinement {
  public GetV1ListsListKeyExternalCodeOperation() {
    super();
  }

  public GetV1ListsListKeyExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Get lists by list key external code
   *
   * <p>This operation makes an HTTP GET request to the /v1/lists/{listKey}/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param listKeyUriParam ListKey defines the target table in Alusta. e.g. List with listKey
   *     'ACC_LIST_5' will be mapped to EXT_ACC_LIST_5.
   * @param externalCodeUriParam The ExternalCode of the list item
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get lists by list key external code")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ListsListKeyExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ListsListKeyExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("List Key")
          @Summary(
              "ListKey defines the target table in Alusta. e.g. List with listKey 'ACC_LIST_5' will be mapped to EXT_ACC_LIST_5.")
          GetV1ListsListKeyExternalCodeOperationListKeyUriParamEnum listKeyUriParam,
      @DisplayName("External Code") @Summary("The ExternalCode of the list item")
          String externalCodeUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1ListsListKeyExternalCode(
        config,
        connection,
        listKeyUriParam,
        externalCodeUriParam,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
