package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1ExchangeRatesInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PostV1ExchangeRatesOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PostV1ExchangeRatesOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PostV1ExchangeRatesOperation extends PostV1ExchangeRatesOperationRefinement {
  public PostV1ExchangeRatesOperation() {
    super();
  }

  public PostV1ExchangeRatesOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Please provide exchange rates to 1) the currency used by entire organization as well
   * as 2) to currencies used by individual companies. 2) Exchange rates are inherited in P2P from
   * top level organizations down if company-specific rates are not provided. 3) Multiplying 'from'
   * currency amount by rate needs to give amount in 'to' -currency.
   *
   * <p>This operation makes an HTTP POST request to the /v1/exchangeRates endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1ExchangeRatesBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create exchange rates")
  @Summary(
      "Notes:\r\n"
          + "1) Please provide exchange rates to 1) the currency used by entire organization as well as 2) to currencies used by individual companies. \r\n"
          + "2) Exchange rates are inherited in P2P from top level organizations down if company-specific rates are not provided.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1ExchangeRatesOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1ExchangeRates(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1ExchangeRatesInputMetadataResolver.class)
          TypedValue<InputStream> postV1ExchangeRatesBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1ExchangeRates(
        config,
        connection,
        contentTypeHeader,
        postV1ExchangeRatesBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
