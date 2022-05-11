package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV1RequestStatusRequestIdOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV1RequestStatusRequestIdOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetV1RequestStatusRequestIdOperation
    extends GetV1RequestStatusRequestIdOperationRefinement {
  public GetV1RequestStatusRequestIdOperation() {
    super();
  }

  public GetV1RequestStatusRequestIdOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Note: RequestStatus functionality is not yet available for 'users' API for following target
   * systems: 1. Network consumer (application codes 'SupplierPortal' and 'SupplierManagement') 2.
   * Basware Access
   *
   * <p>Please see section "[Usage scenario 5: Error handling and
   * monitoring](https://developer.basware.com/api/p2p/manual#usage5)" in Basware Purchase-to-Pay
   * API manual for details on implementing error handling with Basware API.
   *
   * <p>This operation makes an HTTP GET request to the /v1/requestStatus/{requestId} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param requestIdUriParam The request id used to post in the data. This is returned in request
   *     header parameter 'x-amzn-RequestId', in response of the original request.
   * @param systemQueryParam Allows limiting the responses to requests routed to a particular target
   *     system.
   * @param ignoreSuccessfulItemsQueryParam Allows filtering out succesful records within the
   *     response. Can be used to show only records with errors and records in progress.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get request status by request id")
  @Summary(
      "Note: RequestStatus functionality is not yet available for 'users' API for following target systems: \r\n"
          + "1. Network consumer (application codes 'SupplierPortal' and 'SupplierManagement') \r\n"
          + "2. Basware Access \r\n"
          + "\r\n"
          + "Please see section \"[Usage scenario 5: Error handling and monitoring](https://developer.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1RequestStatusRequestIdOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1RequestStatusRequestId(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Request Id")
          @Summary(
              "The request id used to post in the data. This is returned in request header parameter 'x-amzn-RequestId', in response of the original request.")
          String requestIdUriParam,
      @Optional
          @DisplayName("system")
          @Summary(
              "Allows limiting the responses to requests routed to a particular target system.")
          String systemQueryParam,
      @Optional
          @DisplayName("Ignore Successful Items")
          @Summary(
              "Allows filtering out succesful records within the response. Can be used to show only records with errors and records in progress.")
          boolean ignoreSuccessfulItemsQueryParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1RequestStatusRequestId(
        config,
        connection,
        requestIdUriParam,
        systemQueryParam,
        ignoreSuccessfulItemsQueryParam,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
