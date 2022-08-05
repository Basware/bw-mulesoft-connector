package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1UsersInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PostV1UsersOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PostV1UsersOperationRefinement;
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
public class PostV1UsersOperation extends PostV1UsersOperationRefinement {
  public PostV1UsersOperation() {
    super();
  }

  public PostV1UsersOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Basware applications accessible to a user are controlled through 'users' and
   * 'applicationGroups' APIs. Applications in a group are defined through 'applicationGroups' API.
   * Application groups are assigned to users through the 'applicationGroups' -block in users API.
   *
   * <p>Notes: 1. You need to have at least one applicationGroup for posting users to Basware API.
   * The applicationGroups are available in applicationGroups API. 2. Application groups are
   * assigned to users through the 'applicationGroups' -block in users API. 3. It is possible to
   * assign users to default application group(s). Users with no applicationGroups are automatically
   * assigned to application groups where 'default' = true. When using this approach, you will need
   * to have an applicationGroup with default = true. 4. The company to which a user is imported
   * needs to be set up as an administrative site in P2P. 5. User 'loginType' needs to be 4 (user
   * authentication through Basware Access) when the user is imported to any system besides (or in
   * addition to) P2P. 6. When loginType = 4 (Basware Access) the email is used as userâ€™s login
   * account and must be unique within a tenant. 7. User groups are overwritten in P2P only when P2P
   * admin parameter to overwrite existing user groups them is enabled. (Note: user groups are
   * different from application groups) 8. User recipient identifiers in P2P are overridden with
   * values received through API. When no values are specified in API, the corresponding fields are
   * emptied in P2P. 9. User's externalCode is used as unique identifier in P2P and in Basware
   * Access. Change to external code means a new user. The externalCode is ignored by Network
   * Portal, which uses loginAccount as unique identifier. 10. If costCenterCode is empty, you may
   * get error "No Cost Center information found for user" from P2P but user will still be imported
   * to P2P. That message can be regarded as a warning. 11. Fields containing data on existing user
   * records cannot be cleared in P2P through users API. It is only possible to send new values and
   * not possible to set fields already having values to null. This API works differently than rest
   * of the APIs in that regard.
   *
   * <p>Please see section "[Usage scenario 7 Import
   * users](https://developer.basware.com/api/p2p/manual#usage7)" of Basware Purchase-to-Pay API
   * manual for details on managing users with Basware API. Check out also the [example JSONs using
   * a minimal feasible set of fields](https://developer.basware.com/api/p2p/templates) from the
   * developer site.
   *
   * <p>This operation makes an HTTP POST request to the /v1/users endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param contentTypeHeader Specifies the media type of the resource. Value application/json is
   *     supported.
   * @param postV1UsersBodies the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Create users")
  @Summary(
      "Basware applications accessible to a user are controlled through 'users' and 'applicationGroups' APIs. Applications in a group are defined through 'applicationGroups' API. Application groups are assigned to users through the 'applicationGroups' -block in users API.\r\n"
          + "\r\n"
          + "Notes: \r\n"
          + "1.")
  @MediaType("application/json")
  @OutputResolver(
      output = PostV1UsersOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postV1Users(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional
          @DisplayName("Content Type")
          @Summary("Specifies the media type of the resource. Value application/json is supported.")
          String contentTypeHeader,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostV1UsersInputMetadataResolver.class)
          TypedValue<InputStream> postV1UsersBodies,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.postV1Users(
        config,
        connection,
        contentTypeHeader,
        postV1UsersBodies,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
