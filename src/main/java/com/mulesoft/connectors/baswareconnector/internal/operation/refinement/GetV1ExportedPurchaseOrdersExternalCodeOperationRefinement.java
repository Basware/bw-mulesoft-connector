package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1ExportedPurchaseOrdersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedPurchaseOrdersExternalCodeOperationRefinement
    extends GetV1ExportedPurchaseOrdersExternalCodeOperationBase {
  public GetV1ExportedPurchaseOrdersExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ExportedPurchaseOrdersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
