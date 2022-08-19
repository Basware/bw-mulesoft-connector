package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1ExportedPurchaseOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ExportedPurchaseOrdersOperationRefinement
    extends DeleteV1ExportedPurchaseOrdersOperationBase {
  public DeleteV1ExportedPurchaseOrdersOperationRefinement() {
    super();
  }

  public DeleteV1ExportedPurchaseOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
