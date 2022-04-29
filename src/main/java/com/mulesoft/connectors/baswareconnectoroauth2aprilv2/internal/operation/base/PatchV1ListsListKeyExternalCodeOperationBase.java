package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata.PatchV1ListsListKeyExternalCodeOperationListKeyUriParamEnum;
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
public abstract class PatchV1ListsListKeyExternalCodeOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/lists/{listKey}/{externalCode}";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public PatchV1ListsListKeyExternalCodeOperationBase() {
    super();
  }

  public PatchV1ListsListKeyExternalCodeOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void patchV1ListsListKeyExternalCode(
      RestConfiguration config,
      RestConnection connection,
      PatchV1ListsListKeyExternalCodeOperationListKeyUriParamEnum listKeyUriParam,
      String externalCodeUriParam,
      TypedValue<InputStream> patchV1ListsListKeyExternalCodeBody,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      patchV1ListsListKeyExternalCodeMain(
          config,
          connection,
          listKeyUriParam,
          externalCodeUriParam,
          customParameterBindings,
          patchV1ListsListKeyExternalCodeBody,
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

  protected void patchV1ListsListKeyExternalCodeMain(
      RestConfiguration config,
      RestConnection connection,
      PatchV1ListsListKeyExternalCodeOperationListKeyUriParamEnum listKeyUriParam,
      String externalCodeUriParam,
      Map<String, Object> customParameterBindings,
      TypedValue<InputStream> patchV1ListsListKeyExternalCodeBody,
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
            .addUriParam("listKey", listKeyUriParam.getValue())
            .addUriParam("externalCode", externalCodeUriParam)
            .setBody(patchV1ListsListKeyExternalCodeBody, overrides.getStreamingType());
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
