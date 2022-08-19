package com.mulesoft.connectors.baswareconnectormule4.internal.operation.base;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
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
public abstract class PatchV2ProjectsExternalCodeOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v2/projects/{externalCode}";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public PatchV2ProjectsExternalCodeOperationBase() {
    super();
  }

  public PatchV2ProjectsExternalCodeOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void patchV2ProjectsExternalCode(
      RestConfiguration config,
      RestConnection connection,
      String externalCodeUriParam,
      TypedValue<InputStream> patchV2ProjectsExternalCodeBody,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      patchV2ProjectsExternalCodeMain(
          config,
          connection,
          externalCodeUriParam,
          customParameterBindings,
          patchV2ProjectsExternalCodeBody,
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

  protected void patchV2ProjectsExternalCodeMain(
      RestConfiguration config,
      RestConnection connection,
      String externalCodeUriParam,
      Map<String, Object> customParameterBindings,
      TypedValue<InputStream> patchV2ProjectsExternalCodeBody,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    Map<String, Object> parameterBindings = new HashMap<>();
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), OPERATION_PATH, HttpConstants.Method.PATCH, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("content-type", "application/json")
            .addHeader("accept", "application/json")
            .addUriParam("externalCode", externalCodeUriParam)
            .setBody(patchV2ProjectsExternalCodeBody, overrides.getStreamingType());
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
