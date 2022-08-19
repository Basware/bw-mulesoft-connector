package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1PurchaseGoodsReceiptsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PurchaseGoodsReceiptsExternalCodeOperationRefinement
    extends GetV1PurchaseGoodsReceiptsExternalCodeOperationBase {
  public GetV1PurchaseGoodsReceiptsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1PurchaseGoodsReceiptsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
