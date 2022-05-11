package com.mulesoft.connectors.baswareconnector.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnector.internal.metadata.GetV2ProjectsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnector.internal.operation.refinement.GetV2ProjectsOperationRefinement;
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
public class GetV2ProjectsOperation extends GetV2ProjectsOperationRefinement {
  public GetV2ProjectsOperation() {
    super();
  }

  public GetV2ProjectsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Get projects
   *
   * <p>This operation makes an HTTP GET request to the /v2/projects endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param pageSizeQueryParam A limit for the number of items to be returned for one request. Limit
   *     can range between 1 and 500 items.
   * @param companyCodeQueryParam Company filter. Returns items for specific company.
   * @param lastUpdatedQueryParam Date Filter. Returns items that have been updated after specified
   *     date.
   * @param xAmzMetaContinuationtokenHeader Used to get next page of results when item count
   *     indicated by 'pageSize' is exceeded. A token is returned in header (not body) parameter
   *     'X-amz-meta-continuationToken' of the response whenever there are more records to fetch.
   *     Post the received value here in a new HEADER parameter on the next GET request to receive
   *     the next page of results. When getting the next page of results, you must include the same
   *     query parameters that were used when getting the first page.
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Get projects")
  @MediaType("application/json")
  @OutputResolver(
      output = GetV2ProjectsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getV2Projects(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional(defaultValue = "500")
          @DisplayName("Page Size")
          @Summary(
              "A limit for the number of items to be returned for one request. Limit can range between 1 and 500 items.")
          Integer pageSizeQueryParam,
      @Optional
          @DisplayName("Company Code")
          @Summary("Company filter. Returns items for specific company.")
          String companyCodeQueryParam,
      @Optional
          @DisplayName("Last Updated")
          @Summary("Date Filter. Returns items that have been updated after specified date.")
          String lastUpdatedQueryParam,
      @Optional
          @DisplayName("X amz meta continuationtoken")
          @Summary(
              "Used to get next page of results when item count indicated by 'pageSize' is exceeded. A token is returned in header (not body) parameter 'X-amz-meta-continuationToken' of the response whenever there are more records to fetch.")
          String xAmzMetaContinuationtokenHeader,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.getV2Projects(
        config,
        connection,
        pageSizeQueryParam,
        companyCodeQueryParam,
        lastUpdatedQueryParam,
        xAmzMetaContinuationtokenHeader,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
