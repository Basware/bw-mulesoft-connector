package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1UsersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1UsersOperationRefinement extends DeleteV1UsersOperationBase {
  public DeleteV1UsersOperationRefinement() {
    super();
  }

  public DeleteV1UsersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
