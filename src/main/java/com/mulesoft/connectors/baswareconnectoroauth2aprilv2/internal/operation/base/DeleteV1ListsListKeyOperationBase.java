package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata.DeleteV1ListsListKeyOperationListKeyUriParamEnum;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.exception.ModuleException;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;
import org.mule.runtime.http.api.HttpConstants;

/** Higher part of the Operation. It has the implementation of the operation. */
public abstract class DeleteV1ListsListKeyOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/lists/{listKey}";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public DeleteV1ListsListKeyOperationBase() {
    super();
  }

  public DeleteV1ListsListKeyOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void deleteV1ListsListKey(
      RestConfiguration config,
      RestConnection connection,
      DeleteV1ListsListKeyOperationListKeyUriParamEnum listKeyUriParam,
      TypedValue<InputStream> deleteV1ListsListKeyBody,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      deleteV1ListsListKeyMain(
          config,
          connection,
          listKeyUriParam,
          customParameterBindings,
          deleteV1ListsListKeyBody,
          parameters,
          overrides,
          streamingHelper,
          callback);
    } catch (ModuleException e) {
      callback.error(e);
    } catch (Throwable e) {
      callback.error(new ModuleException("Unknown error", RestError.CONNECTIVITY, e));
    }
  }

  protected void deleteV1ListsListKeyMain(
      RestConfiguration config,
      RestConnection connection,
      DeleteV1ListsListKeyOperationListKeyUriParamEnum listKeyUriParam,
      Map<String, Object> customParameterBindings,
      TypedValue<InputStream> deleteV1ListsListKeyBody,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    Map<String, Object> parameterBindings = new HashMap<>();
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), OPERATION_PATH, HttpConstants.Method.DELETE, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("content-type", "application/json")
            .addHeader("accept", "application/json")
            .addUriParam("listKey", listKeyUriParam.getValue())
            .setBody(deleteV1ListsListKeyBody, overrides.getStreamingType());
    doRequest(
        config,
        connection,
        builder,
        overrides.getResponseTimeoutAsMillis(),
        streamingHelper,
        parameterBindings,
        callbackObjectAttributesAdapter(callback));
  }
}
