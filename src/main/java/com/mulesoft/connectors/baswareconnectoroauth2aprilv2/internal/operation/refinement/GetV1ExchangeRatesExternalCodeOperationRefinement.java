package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ExchangeRatesExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExchangeRatesExternalCodeOperationRefinement
    extends GetV1ExchangeRatesExternalCodeOperationBase {
  public GetV1ExchangeRatesExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ExchangeRatesExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
