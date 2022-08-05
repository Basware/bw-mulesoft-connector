package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.GetV1PurchaseOrdersExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.GetV1PurchaseOrdersExternalCodeOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetV1PurchaseOrdersExternalCodeOperation
    extends GetV1PurchaseOrdersExternalCodeOperationRefinement {
  public GetV1PurchaseOrdersExternalCodeOperation() {
    super();
  }

  public GetV1PurchaseOrdersExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Note: This GET operation returns a HTTP redirect, which the API client needs to follow. *
   * 'Authorization' header must not be included in the redirected request (the second request after
   * receiving a redirect). * 'Host' header needs to be included.
   *
   * <p>This operation makes an HTTP GET request to the /v1/purchaseOrders/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The externalCode of the purchaseOrder to be fetched
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get purchase orders by external code")
  @Summary(
      "Note: This GET operation returns a HTTP redirect, which the API client needs to follow. \r\n"
          + "* 'Authorization' header must not be included in the redirected request (the second request after receiving a redirect). \r\n"
          + "* 'Host' header needs to be included.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1PurchaseOrdersExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1PurchaseOrdersExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code") @Summary("The externalCode of the purchaseOrder to be fetched")
          String externalCodeUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1PurchaseOrdersExternalCode(
        config, connection, externalCodeUriParam, parameters, overrides, streamingHelper, callback);
  }
}
