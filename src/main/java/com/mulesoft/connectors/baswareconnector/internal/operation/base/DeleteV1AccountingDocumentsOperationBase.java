package com.mulesoft.connectors.baswareconnector.internal.operation.base;

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
public abstract class DeleteV1AccountingDocumentsOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/accountingDocuments";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public DeleteV1AccountingDocumentsOperationBase() {
    super();
  }

  public DeleteV1AccountingDocumentsOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void deleteV1AccountingDocuments(
      RestConfiguration config,
      RestConnection connection,
      TypedValue<InputStream> deleteV1AccountingDocumentsBody,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      deleteV1AccountingDocumentsMain(
          config,
          connection,
          customParameterBindings,
          deleteV1AccountingDocumentsBody,
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

  protected void deleteV1AccountingDocumentsMain(
      RestConfiguration config,
      RestConnection connection,
      Map<String, Object> customParameterBindings,
      TypedValue<InputStream> deleteV1AccountingDocumentsBody,
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
            .setBody(deleteV1AccountingDocumentsBody, overrides.getStreamingType());
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
