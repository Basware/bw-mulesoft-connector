package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1ExportedPurchaseOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedPurchaseOrdersOperationRefinement
    extends GetV1ExportedPurchaseOrdersOperationBase {
  public GetV1ExportedPurchaseOrdersOperationRefinement() {
    super();
  }

  public GetV1ExportedPurchaseOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
