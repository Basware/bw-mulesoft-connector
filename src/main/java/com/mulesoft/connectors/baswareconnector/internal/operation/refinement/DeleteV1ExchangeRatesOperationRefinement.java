package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.DeleteV1ExchangeRatesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ExchangeRatesOperationRefinement extends DeleteV1ExchangeRatesOperationBase {
  public DeleteV1ExchangeRatesOperationRefinement() {
    super();
  }

  public DeleteV1ExchangeRatesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
