package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.api.metadata.GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperationEntityTypeUriParamEnum;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperationRefinement;
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
public class GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperation
    extends GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperationRefinement {
  public GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperation() {
    super();
  }

  public GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * If errors occur after Basware API has validated the data schema, these will be returned from
   * target systems asynchronously in this interface.
   *
   * <p>Please see section "[Usage scenario 5: Error handling and
   * monitoring](https://developer.basware.com/api/p2p/manual#usage5)" in Basware Purchase-to-Pay
   * API manual for details on implementing error handling with Basware API.
   *
   * <p>This operation makes an HTTP GET request to the
   * /v1/errorFeedbacks/{entityType}/{errorEntityExternalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param entityTypeUriParam The entityType of the entities to be fetched
   * @param errorEntityExternalCodeUriParam The ExternalCode of the entities to be fetched
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get error feedbacks by entity type error entity external code")
  @Summary(
      "If errors occur after Basware API has validated the data schema, these will be returned from target systems asynchronously in this interface.\r\n"
          + "\r\n"
          + "Please see section \"[Usage scenario 5: Error handling and monitoring](https://developer.basware.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV1ErrorFeedbacksEntityTypeErrorEntityExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("Entity Type") @Summary("The entityType of the entities to be fetched")
          GetV1ErrorFeedbacksEntityTypeErrorEntityExternalCodeOperationEntityTypeUriParamEnum
              entityTypeUriParam,
      @DisplayName("Error Entity External Code")
          @Summary("The ExternalCode of the entities to be fetched")
          String errorEntityExternalCodeUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV1ErrorFeedbacksEntityTypeErrorEntityExternalCode(
        config,
        connection,
        entityTypeUriParam,
        errorEntityExternalCodeUriParam,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
