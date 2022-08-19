package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1PurchaseRequisitionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1PurchaseRequisitionsOperationRefinement
    extends DeleteV1PurchaseRequisitionsOperationBase {
  public DeleteV1PurchaseRequisitionsOperationRefinement() {
    super();
  }

  public DeleteV1PurchaseRequisitionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
