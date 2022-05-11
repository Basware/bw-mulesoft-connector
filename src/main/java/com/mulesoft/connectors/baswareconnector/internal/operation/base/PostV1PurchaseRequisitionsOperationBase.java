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
public abstract class PostV1PurchaseRequisitionsOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/purchaseRequisitions";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public PostV1PurchaseRequisitionsOperationBase() {
    super();
  }

  public PostV1PurchaseRequisitionsOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void postV1PurchaseRequisitions(
      RestConfiguration config,
      RestConnection connection,
      String contentTypeHeader,
      TypedValue<InputStream> postV1PurchaseRequisitionsBodies,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      postV1PurchaseRequisitionsMain(
          config,
          connection,
          contentTypeHeader,
          customParameterBindings,
          postV1PurchaseRequisitionsBodies,
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

  protected void postV1PurchaseRequisitionsMain(
      RestConfiguration config,
      RestConnection connection,
      String contentTypeHeader,
      Map<String, Object> customParameterBindings,
      TypedValue<InputStream> postV1PurchaseRequisitionsBodies,
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
            .addHeader("Content-Type", contentTypeHeader)
            .setBody(postV1PurchaseRequisitionsBodies, overrides.getStreamingType());
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
