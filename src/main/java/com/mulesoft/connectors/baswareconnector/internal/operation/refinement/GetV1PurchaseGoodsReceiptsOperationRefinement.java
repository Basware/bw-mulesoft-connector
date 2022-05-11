package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1PurchaseGoodsReceiptsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PurchaseGoodsReceiptsOperationRefinement
    extends GetV1PurchaseGoodsReceiptsOperationBase {
  public GetV1PurchaseGoodsReceiptsOperationRefinement() {
    super();
  }

  public GetV1PurchaseGoodsReceiptsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
