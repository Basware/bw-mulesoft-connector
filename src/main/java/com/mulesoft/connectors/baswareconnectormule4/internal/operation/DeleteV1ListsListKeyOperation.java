package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.api.metadata.DeleteV1ListsListKeyOperationListKeyUriParamEnum;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.DeleteV1ListsListKeyInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.DeleteV1ListsListKeyOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.DeleteV1ListsListKeyOperationRefinement;
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
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class DeleteV1ListsListKeyOperation extends DeleteV1ListsListKeyOperationRefinement {
  public DeleteV1ListsListKeyOperation() {
    super();
  }

  public DeleteV1ListsListKeyOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Delete lists by list key
   *
   * <p>This operation makes an HTTP DELETE request to the /v1/lists/{listKey} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param listKeyUriParam Contains list item name to be deleted.
   * @param deleteV1ListsListKeyBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Delete lists by list key")
  @MediaType("application/json")
  @OutputResolver(
      output = DeleteV1ListsListKeyOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void deleteV1ListsListKey(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("List Key") @Summary("Contains list item name to be deleted.")
          DeleteV1ListsListKeyOperationListKeyUriParamEnum listKeyUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(DeleteV1ListsListKeyInputMetadataResolver.class)
          TypedValue<InputStream> deleteV1ListsListKeyBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.deleteV1ListsListKey(
        config,
        connection,
        listKeyUriParam,
        deleteV1ListsListKeyBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
