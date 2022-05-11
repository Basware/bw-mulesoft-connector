package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1ExportedPurchaseRequisitionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedPurchaseRequisitionsOperationRefinement
    extends GetV1ExportedPurchaseRequisitionsOperationBase {
  public GetV1ExportedPurchaseRequisitionsOperationRefinement() {
    super();
  }

  public GetV1ExportedPurchaseRequisitionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
