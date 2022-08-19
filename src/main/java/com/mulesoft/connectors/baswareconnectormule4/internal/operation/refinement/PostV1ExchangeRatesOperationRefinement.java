package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1ExchangeRatesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ExchangeRatesOperationRefinement extends PostV1ExchangeRatesOperationBase {
  public PostV1ExchangeRatesOperationRefinement() {
    super();
  }

  public PostV1ExchangeRatesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
