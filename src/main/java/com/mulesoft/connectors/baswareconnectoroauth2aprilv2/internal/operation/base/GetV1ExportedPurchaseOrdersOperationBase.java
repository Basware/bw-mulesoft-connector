package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectivity.rest.commons.api.operation.BaseRestOperation;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectivity.rest.commons.internal.util.RestRequestBuilder;
import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata.GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.exception.ModuleException;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;
import org.mule.runtime.http.api.HttpConstants;

/** Higher part of the Operation. It has the implementation of the operation. */
public abstract class GetV1ExportedPurchaseOrdersOperationBase extends BaseRestOperation {
  protected static final String OPERATION_PATH = "/v1/exportedPurchaseOrders";

  protected static final RestRequestBuilder.ParameterArrayFormat QUERY_PARAM_FORMAT =
      RestRequestBuilder.ParameterArrayFormat.MULTIMAP;

  public GetV1ExportedPurchaseOrdersOperationBase() {
    super();
  }

  public GetV1ExportedPurchaseOrdersOperationBase(ExpressionLanguage arg0) {
    super(arg0);
  }

  protected void getV1ExportedPurchaseOrders(
      RestConfiguration config,
      RestConnection connection,
      GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum orderStatusQueryParam,
      Integer pageSizeQueryParam,
      String companyCodeQueryParam,
      String lastUpdatedQueryParam,
      String xAmzMetaContinuationtokenHeader,
      RequestParameters parameters,
      ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    try {
      Map<String, Object> customParameterBindings = new HashMap<>();
      getV1ExportedPurchaseOrdersMain(
          config,
          connection,
          orderStatusQueryParam,
          pageSizeQueryParam,
          companyCodeQueryParam,
          lastUpdatedQueryParam,
          xAmzMetaContinuationtokenHeader,
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

  protected void getV1ExportedPurchaseOrdersMain(
      RestConfiguration config,
      RestConnection connection,
      GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum orderStatusQueryParam,
      Integer pageSizeQueryParam,
      String companyCodeQueryParam,
      String lastUpdatedQueryParam,
      String xAmzMetaContinuationtokenHeader,
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
            .addQueryParam(
                "orderStatus",
                orderStatusQueryParam != null ? orderStatusQueryParam.getValue() : null)
            .addQueryParam("pageSize", pageSizeQueryParam != null ? pageSizeQueryParam : null)
            .addQueryParam("companyCode", companyCodeQueryParam)
            .addQueryParam(
                "lastUpdated", lastUpdatedQueryParam != null ? lastUpdatedQueryParam : null)
            .addHeader("x-amz-meta-continuationtoken", xAmzMetaContinuationtokenHeader);
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
