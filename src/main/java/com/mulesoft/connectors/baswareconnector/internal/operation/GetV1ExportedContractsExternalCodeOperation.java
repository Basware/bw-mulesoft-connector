package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV1ExportedContractsExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV1ExportedContractsExternalCodeOperationRefinement;
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
public class GetV1ExportedContractsExternalCodeOperation
    extends GetV1ExportedContractsExternalCodeOperationRefinement {
  public GetV1ExportedContractsExternalCodeOperation() {
    super();
  }

  public GetV1ExportedContractsExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Whether contract spends are collected is controlled by the fields 'invoiceSpend',
   * 'orderSpend' and 'spendPlanSpend'. Spend is not collected when these fields are set to 'false'.
   * 2) This API exports contracts imported through Basware API. Contracts imported through anyerp
   * are not exported.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP GET request to the /v1/exportedContracts/{externalCode}
   * endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The ExternalCode of the contract to be fetched.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get exported contracts by external code")
  @Summary(
      "Notes: \r\n"
          + "1) Whether contract spends are collected is controlled by the fields 'invoiceSpend', 'orderSpend' and 'spendPlanSpend'. Spend is not collected when these fields are set to 'false'.\r\n"
          + "2) This API exports contracts imported through Basware API.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ExportedContractsExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ExportedContractsExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code") @Summary("The ExternalCode of the contract to be fetched.")
          String externalCodeUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1ExportedContractsExternalCode(
        config, connection, externalCodeUriParam, parameters, overrides, streamingHelper, callback);
  }
}
