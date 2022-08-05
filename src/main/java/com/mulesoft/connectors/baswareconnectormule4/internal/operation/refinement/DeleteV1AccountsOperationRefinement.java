package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1AccountsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1AccountsOperationRefinement extends DeleteV1AccountsOperationBase {
  public DeleteV1AccountsOperationRefinement() {
    super();
  }

  public DeleteV1AccountsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
