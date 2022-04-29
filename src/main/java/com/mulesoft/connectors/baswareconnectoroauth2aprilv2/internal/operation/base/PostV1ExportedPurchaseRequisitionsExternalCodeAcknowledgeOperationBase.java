package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base;

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
import org.mule.runtime.extension.api.exception.ModuleException;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;
import org.mule.runtime.http.api.HttpConstants;

/** Higher part of the Operation. It has the implementation of the operation. */
public abstract class PostV1ExportedPurchaseRequisitionsExternalCodeAcknowledgeOperationBase
    extends BaseRestOperation {
  protected static final String OPERATION_PATH =
      "/v1/exportedPurchaseRequisitions/{externalCode}/acknowledge";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public PostV1ExportedPurchaseRequisitionsExternalCodeAcknowledgeOperationBase() {
    super();
  }

  public PostV1ExportedPurchaseRequisitionsExternalCodeAcknowledgeOperationBase(
      ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void postV1ExportedPurchaseRequisitionsExternalCodeAcknowledge(
      RestConfiguration config,
      RestConnection connection,
      String externalCodeUriParam,
      String contentTypeHeader,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      postV1ExportedPurchaseRequisitionsExternalCodeAcknowledgeMain(
          config,
          connection,
          externalCodeUriParam,
          contentTypeHeader,
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

  protected void postV1ExportedPurchaseRequisitionsExternalCodeAcknowledgeMain(
      RestConfiguration config,
      RestConnection connection,
      String externalCodeUriParam,
      String contentTypeHeader,
      Map<String, Object> customParameterBindings,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    Map<String, Object> parameterBindings = new HashMap<>();
    RestRequestBuilder builder =
        new RestRequestBuilder(
                connection.getBaseUri(), OPERATION_PATH, HttpConstants.Method.POST, parameters)
            .setQueryParamFormat(QUERY_PARAM_FORMAT)
            .addHeader("accept", "application/json")
            .addUriParam("externalCode", externalCodeUriParam)
            .addHeader("Content-Type", contentTypeHeader);
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
