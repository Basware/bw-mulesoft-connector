package com.mulesoft.connectors.baswareconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PatchV1UsersExternalCodeInputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.metadata.PatchV1UsersExternalCodeOutputMetadataResolver;
import com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement.PatchV1UsersExternalCodeOperationRefinement;
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
public class PatchV1UsersExternalCodeOperation extends PatchV1UsersExternalCodeOperationRefinement {
  public PatchV1UsersExternalCodeOperation() {
    super();
  }

  public PatchV1UsersExternalCodeOperation(ExpressionLanguage arg0) {
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
   * Portal, which uses loginAccount as unique identifier. 10. Basware API considers 'null' value in
   * field(s) equivalent to the field(s) not being sent. For this reason patch method does not
   * support setting field values to 'null'.
   *
   * <p>Please see section "[Usage scenario 4: Import
   * users](https://developer.basware.com/api/p2p/manual#usage3)" of Basware Purchase-to-Pay API
   * manual for details on managing users with Basware API. Check out also the [example JSONs using
   * a minimal feasible set of fields](https://developer.basware.com/api/p2p/templates) from the
   * developer site.
   *
   * <p>This operation makes an HTTP PATCH request to the /v1/users/{externalCode} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param externalCodeUriParam The ExternalCode of the User to be updated
   * @param patchV1UsersExternalCodeBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param streamingHelper the {@link StreamingHelper}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Patch users")
  @Summary(
      "Basware applications accessible to a user are controlled through 'users' and 'applicationGroups' APIs. Applications in a group are defined through 'applicationGroups' API. Application groups are assigned to users through the 'applicationGroups' -block in users API.\r\n"
          + "\r\n"
          + "Notes: \r\n"
          + "1.")
  @MediaType("application/json")
  @OutputResolver(
      output = PatchV1UsersExternalCodeOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void patchV1UsersExternalCode(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("External Code") @Summary("The ExternalCode of the User to be updated")
          String externalCodeUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PatchV1UsersExternalCodeInputMetadataResolver.class)
          TypedValue<InputStream> patchV1UsersExternalCodeBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      StreamingHelper streamingHelper,
      CompletionCallback<InputStream, Object> callback) {
    super.patchV1UsersExternalCode(
        config,
        connection,
        externalCodeUriParam,
        patchV1UsersExternalCodeBody,
        parameters,
        overrides,
        streamingHelper,
        callback);
  }
}
