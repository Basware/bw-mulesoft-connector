package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1PurchaseOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1PurchaseOrdersOperationRefinement extends DeleteV1PurchaseOrdersOperationBase {
  public DeleteV1PurchaseOrdersOperationRefinement() {
    super();
  }

  public DeleteV1PurchaseOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
