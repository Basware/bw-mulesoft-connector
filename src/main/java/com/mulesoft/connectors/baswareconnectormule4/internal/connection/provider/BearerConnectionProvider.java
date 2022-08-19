package com.mulesoft.connectors.baswareconnectormule4.internal.connection.provider;

import com.mulesoft.connectors.baswareconnectormule4.internal.connection.provider.refinement.BearerConnectionProviderRefinement;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This is the last layer of the connection provider generation gap pattern. It is what finally gets
 * exposed as the connection provider, including all customizations made in the refinement layer.
 */
@Alias("bearer")
@DisplayName("Bearer Connection Provider")
public class BearerConnectionProvider extends BearerConnectionProviderRefinement {}
