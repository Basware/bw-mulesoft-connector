package com.mulesoft.connectors.baswareconnectormule4.internal.operation.base;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import com.mulesoft.connectors.baswareconnectormule4.api.metadata.PostV1ListsListKeyOperationListKeyUriParamEnum;
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
public abstract class PostV1ListsListKeyOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/lists/{listKey}";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public PostV1ListsListKeyOperationBase() {
    super();
  }

  public PostV1ListsListKeyOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void postV1ListsListKey(
      RestConfiguration config,
      RestConnection connection,
      PostV1ListsListKeyOperationListKeyUriParamEnum listKeyUriParam,
      String contentTypeHeader,
      TypedValue<InputStream> postV1ListsListKeyBodies,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      postV1ListsListKeyMain(
          config,
          connection,
          listKeyUriParam,
          contentTypeHeader,
          customParameterBindings,
          postV1ListsListKeyBodies,
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

  protected void postV1ListsListKeyMain(
      RestConfiguration config,
      RestConnection connection,
      PostV1ListsListKeyOperationListKeyUriParamEnum listKeyUriParam,
      String contentTypeHeader,
      Map<String, Object> customParameterBindings,
      TypedValue<InputStream> postV1ListsListKeyBodies,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    Map<String, Object> parameterBindings = new HashMap<>();
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), OPERATION_PATH, HttpConstants.Method.POST, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("content-type", "application/json")
            .addHeader("accept", "application/json")
            .addUriParam("listKey", listKeyUriParam.getValue())
            .addHeader("Content-Type", contentTypeHeader)
            .setBody(postV1ListsListKeyBodies, overrides.getStreamingType());
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
