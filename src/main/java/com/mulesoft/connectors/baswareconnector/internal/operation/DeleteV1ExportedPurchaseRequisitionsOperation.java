package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.DeleteV1ExportedPurchaseRequisitionsInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.DeleteV1ExportedPurchaseRequisitionsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.DeleteV1ExportedPurchaseRequisitionsOperationRefinement;
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
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;
import org.mule.runtime.extension.api.runtime.streaming.StreamingHelper;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class DeleteV1ExportedPurchaseRequisitionsOperation
    extends DeleteV1ExportedPurchaseRequisitionsOperationRefinement {
  public DeleteV1ExportedPurchaseRequisitionsOperation() {
    super();
  }

  public DeleteV1ExportedPurchaseRequisitionsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Delete exported purchase requisitions
   *
   * <p>This operation makes an HTTP DELETE request to the /v1/exportedPurchaseRequisitions endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param deleteV1ExportedPurchaseRequisitionsBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Delete exported purchase requisitions")
  @MediaType("application/json")
  @OutputResolver(
      output = DeleteV1ExportedPurchaseRequisitionsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void deleteV1ExportedPurchaseRequisitions(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(DeleteV1ExportedPurchaseRequisitionsInputMetadataResolver.class)
          TypedValue<InputStream> deleteV1ExportedPurchaseRequisitionsBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.deleteV1ExportedPurchaseRequisitions(
        config,
        connection,
        deleteV1ExportedPurchaseRequisitionsBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
