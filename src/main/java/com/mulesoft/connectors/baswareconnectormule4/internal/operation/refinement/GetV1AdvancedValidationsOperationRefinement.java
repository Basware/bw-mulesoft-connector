package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1AdvancedValidationsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AdvancedValidationsOperationRefinement
    extends GetV1AdvancedValidationsOperationBase {
  public GetV1AdvancedValidationsOperationRefinement() {
    super();
  }

  public GetV1AdvancedValidationsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
