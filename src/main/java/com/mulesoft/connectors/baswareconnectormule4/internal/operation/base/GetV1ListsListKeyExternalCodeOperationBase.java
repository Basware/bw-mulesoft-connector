package com.mulesoft.connectors.baswareconnectormule4.internal.operation.base;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import com.mulesoft.connectors.baswareconnectormule4.api.metadata.GetV1ListsListKeyExternalCodeOperationListKeyUriParamEnum;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.exception.ModuleException;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;
import org.mule.runtime.http.api.HttpConstants;

/** Higher part of the Operation. It has the implementation of the operation. */
public abstract class GetV1ListsListKeyExternalCodeOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/lists/{listKey}/{externalCode}";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public GetV1ListsListKeyExternalCodeOperationBase() {
    super();
  }

  public GetV1ListsListKeyExternalCodeOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void getV1ListsListKeyExternalCode(
      RestConfiguration config,
      RestConnection connection,
      GetV1ListsListKeyExternalCodeOperationListKeyUriParamEnum listKeyUriParam,
      String externalCodeUriParam,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      getV1ListsListKeyExternalCodeMain(
          config,
          connection,
          listKeyUriParam,
          externalCodeUriParam,
          customParameterBindings,
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

  protected void getV1ListsListKeyExternalCodeMain(
      RestConfiguration config,
      RestConnection connection,
      GetV1ListsListKeyExternalCodeOperationListKeyUriParamEnum listKeyUriParam,
      String externalCodeUriParam,
      Map<String, Object> customParameterBindings,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    Map<String, Object> parameterBindings = new HashMap<>();
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), OPERATION_PATH, HttpConstants.Method.GET, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("accept", "application/json")
            .addUriParam("listKey", listKeyUriParam.getValue())
            .addUriParam("externalCode", externalCodeUriParam);
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
