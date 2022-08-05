package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1ExportedContractSpendsAcknowledgeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1ExportedContractSpendsAcknowledgeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1ExportedContractSpendsAcknowledgeOperationRefinement;
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
public class PostV1ExportedContractSpendsAcknowledgeOperation
    extends PostV1ExportedContractSpendsAcknowledgeOperationRefinement {
  public PostV1ExportedContractSpendsAcknowledgeOperation() {
    super();
  }

  public PostV1ExportedContractSpendsAcknowledgeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Notes: 1) Updates 'processingStatus' -field on the document to allow filtering out already
   * acknowledged documents on the next GET operation. 2) For a document which is already
   * acknowledged (processingStatus: 'Exported'), API will return 405 'Method not allowed' if
   * acknowledge is attempted again on the document.
   *
   * <p>Please see section "[Usage scenario 4: Import and export procurement
   * data](https://developer.basware.com/api/p2p/manual#usage4)" for details on implementing this
   * API. Check out also the [example JSONs using a minimal feasible set of
   * fields](https://developer.basware.com/api/p2p/templates) from the developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/exportedContractSpends/acknowledge
   * endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1ExportedContractSpendsAcknowledgeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Exported contracts spends acknowledge")
  @Summary(
      "Notes: \r\n"
          + "1) Updates 'processingStatus' -field on the document to allow filtering out already acknowledged documents on the next GET operation.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1ExportedContractSpendsAcknowledgeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1ExportedContractSpendsAcknowledge(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1ExportedContractSpendsAcknowledgeInputMetadataResolver.class)
          TypedValue<InputStream> postV1ExportedContractSpendsAcknowledgeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1ExportedContractSpendsAcknowledge(
        config,
        connection,
        contentTypeHeader,
        postV1ExportedContractSpendsAcknowledgeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
