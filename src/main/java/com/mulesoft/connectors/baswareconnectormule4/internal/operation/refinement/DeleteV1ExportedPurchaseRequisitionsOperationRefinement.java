package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1ExportedPurchaseRequisitionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ExportedPurchaseRequisitionsOperationRefinement
    extends DeleteV1ExportedPurchaseRequisitionsOperationBase {
  public DeleteV1ExportedPurchaseRequisitionsOperationRefinement() {
    super();
  }

  public DeleteV1ExportedPurchaseRequisitionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
