package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PatchV1PurchaseOrdersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1PurchaseOrdersExternalCodeOperationRefinement
    extends PatchV1PurchaseOrdersExternalCodeOperationBase {
  public PatchV1PurchaseOrdersExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1PurchaseOrdersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
