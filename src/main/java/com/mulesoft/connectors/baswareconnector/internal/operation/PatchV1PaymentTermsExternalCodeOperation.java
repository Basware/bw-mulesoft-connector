package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1PaymentTermsExternalCodeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1PaymentTermsExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PatchV1PaymentTermsExternalCodeOperationRefinement;
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
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PatchV1PaymentTermsExternalCodeOperation
    extends PatchV1PaymentTermsExternalCodeOperationRefinement {
  public PatchV1PaymentTermsExternalCodeOperation() {
    super();
  }

  public PatchV1PaymentTermsExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Patch payment terms
   *
   * <p>This operation makes an HTTP PATCH request to the /v1/paymentTerms/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The ExternalCode of the payment term to be updated. To do a partial
   *     update consumer needs to provide changed properties.
   * @param patchV1PaymentTermsExternalCodeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Patch payment terms")
  @MediaType("application/json")
  @OutputResolver(
      output = PatchV1PaymentTermsExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void patchV1PaymentTermsExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code")
          @Summary(
              "The ExternalCode of the payment term to be updated. To do a partial update consumer needs to provide changed properties.")
          String externalCodeUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PatchV1PaymentTermsExternalCodeInputMetadataResolver.class)
          TypedValue<InputStream> patchV1PaymentTermsExternalCodeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.patchV1PaymentTermsExternalCode(
        config,
        connection,
        externalCodeUriParam,
        patchV1PaymentTermsExternalCodeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
