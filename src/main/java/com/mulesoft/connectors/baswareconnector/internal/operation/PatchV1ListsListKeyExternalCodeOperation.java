package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.api.metadata.PatchV1ListsListKeyExternalCodeOperationListKeyUriParamEnum;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1ListsListKeyExternalCodeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.PatchV1ListsListKeyExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.PatchV1ListsListKeyExternalCodeOperationRefinement;
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
public class PatchV1ListsListKeyExternalCodeOperation
    extends PatchV1ListsListKeyExternalCodeOperationRefinement {
  public PatchV1ListsListKeyExternalCodeOperation() {
    super();
  }

  public PatchV1ListsListKeyExternalCodeOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * In Basware P2P, the following lists are available. Please note the list-specific differences in
   * available columns and column lengths. 1) ACC_LIST_1 - ACC_LIST_10: Text1 - Text5 (250 chars),
   * Num1 - Num3 2) ACC_LIST_11 - ACC_LIST_20: Text1 - Text5 (50 chars), Num1 - Num3 3) ACC_LIST_21
   * - ACC_LIST_30: Text1 - Text10 (250 chars), Num1 - Num5, Date1 - Date5 4) ACC_LIST_31 -
   * ACC_LIST_35: Text1 - Text25 (250 chars), Num1 - Num10, Date1 - Date10 5) INV_LIST_1 -
   * INV_LIST_10: Text1 - Text5 (250 chars) 6) INV_LIST_11 - INV_LIST_20: Text1 - Text10 (250
   * chars), Num1 - Num5, Date1 - Date5 7) CUST_RESOLVER_1 - CUST_RESOLVER_5: Text1 - Text15 (250
   * chars), Num1 - Num15, Date1 - Date15
   *
   * <p>Note: Basware API considers 'null' value in field(s) equivalent to the field(s) not being
   * sent. For this reason patch method does not support setting field values to 'null'.
   *
   * <p>This operation makes an HTTP PATCH request to the /v1/lists/{listKey}/{externalCode}
   * endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param listKeyUriParam ListKey defines the target table in Alusta. e.g. List with listKey
   *     'ACC_LIST_5' will be mapped to EXT_ACC_LIST_5.
   * @param externalCodeUriParam The ExternalCode of the genericList to be updated
   * @param patchV1ListsListKeyExternalCodeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Patch lists by list key")
  @Summary(
      "In Basware P2P, the following lists are available. Please note the list-specific differences in available columns and column lengths.")
  @MediaType("application/json")
  @OutputResolver(
      output = PatchV1ListsListKeyExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void patchV1ListsListKeyExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("List Key")
          @Summary(
              "ListKey defines the target table in Alusta. e.g. List with listKey 'ACC_LIST_5' will be mapped to EXT_ACC_LIST_5.")
          PatchV1ListsListKeyExternalCodeOperationListKeyUriParamEnum listKeyUriParam,
      @DisplayName("External Code") @Summary("The ExternalCode of the genericList to be updated")
          String externalCodeUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PatchV1ListsListKeyExternalCodeInputMetadataResolver.class)
          TypedValue<InputStream> patchV1ListsListKeyExternalCodeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.patchV1ListsListKeyExternalCode(
        config,
        connection,
        listKeyUriParam,
        externalCodeUriParam,
        patchV1ListsListKeyExternalCodeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
