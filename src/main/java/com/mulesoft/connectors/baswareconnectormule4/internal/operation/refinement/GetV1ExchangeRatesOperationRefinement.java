package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1ExchangeRatesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExchangeRatesOperationRefinement extends GetV1ExchangeRatesOperationBase {
  public GetV1ExchangeRatesOperationRefinement() {
    super();
  }

  public GetV1ExchangeRatesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
