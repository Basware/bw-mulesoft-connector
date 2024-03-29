package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV1ExchangeRatesExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1ExchangeRatesExternalCodeOperationRefinement
    extends PatchV1ExchangeRatesExternalCodeOperationBase {
  public PatchV1ExchangeRatesExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1ExchangeRatesExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
