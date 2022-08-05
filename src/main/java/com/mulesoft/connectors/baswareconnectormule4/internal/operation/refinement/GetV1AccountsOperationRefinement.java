package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1AccountsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AccountsOperationRefinement extends GetV1AccountsOperationBase {
  public GetV1AccountsOperationRefinement() {
    super();
  }

  public GetV1AccountsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
