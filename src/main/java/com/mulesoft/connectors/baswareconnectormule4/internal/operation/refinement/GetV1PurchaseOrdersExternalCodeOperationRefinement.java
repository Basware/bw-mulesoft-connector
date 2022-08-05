package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1PurchaseOrdersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PurchaseOrdersExternalCodeOperationRefinement
    extends GetV1PurchaseOrdersExternalCodeOperationBase {
  public GetV1PurchaseOrdersExternalCodeOperationRefinement() {
    super();
  }

  public GetV1PurchaseOrdersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
