package com.mulesoft.connectors.baswareconnector.internal.config.refinement;

import com.mulesoft.connectors.baswareconnector.internal.config.base.BaswareConfigurationBase;

/**
 * This refinement is the middle layer of the configuration generation gap pattern. It can be
 * overridden to add custom logic in the configuration.
 */
public abstract class BaswareConfigurationRefinement extends BaswareConfigurationBase {}
