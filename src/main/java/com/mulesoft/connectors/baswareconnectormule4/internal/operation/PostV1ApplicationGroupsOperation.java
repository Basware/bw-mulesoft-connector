package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1ApplicationGroupsInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1ApplicationGroupsOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1ApplicationGroupsOperationRefinement;
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
public class PostV1ApplicationGroupsOperation extends PostV1ApplicationGroupsOperationRefinement {
  public PostV1ApplicationGroupsOperation() {
    super();
  }

  public PostV1ApplicationGroupsOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Application groups give access to a specific set of applications for users imported through
   * 'users' API. Each user needs to be assigned to one or more application group(s) by specifying
   * 'applicationGroupCode' values in users API. Notes: 1. User 'loginType' (set on users API) needs
   * to be '4' (user authentication through Basware Access) when the user is imported to any system
   * besides (or in addition to) P2P. 2. Support for updating and removing user access to Network
   * applications is currently not available (planned to be released after Q1/2021). 3. POSTing to
   * applicationGroups API returns a link to 'redistribute users' task status. This is because
   * changes to applicationGroups will trigger changes to users assigned to those groups. When there
   * are many users, the changes to users may take a while to complete. Accessing the link requires
   * providing API credentials.
   *
   * <p>Please see section "[Usage scenario 4: Import
   * users](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay API
   * manual for details on managing users with Basware API. Check out also the [example JSONs using
   * a minimal feasible set of fields](https://developer.basware.com/api/p2p/templates) from the
   * developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/applicationGroups endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1ApplicationGroupsBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create application groups")
  @Summary(
      "Application groups give access to a specific set of applications for users imported through 'users' API. Each user needs to be assigned to one or more application group(s) by specifying 'applicationGroupCode' values in users API. \r\n"
          + "Notes: \r\n"
          + "1.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1ApplicationGroupsOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1ApplicationGroups(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1ApplicationGroupsInputMetadataResolver.class)
          TypedValue<InputStream> postV1ApplicationGroupsBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1ApplicationGroups(
        config,
        connection,
        contentTypeHeader,
        postV1ApplicationGroupsBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
