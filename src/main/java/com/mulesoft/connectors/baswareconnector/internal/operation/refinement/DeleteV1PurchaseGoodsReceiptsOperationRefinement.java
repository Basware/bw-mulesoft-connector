package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.DeleteV1PurchaseGoodsReceiptsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1PurchaseGoodsReceiptsOperationRefinement
    extends DeleteV1PurchaseGoodsReceiptsOperationBase {
  public DeleteV1PurchaseGoodsReceiptsOperationRefinement() {
    super();
  }

  public DeleteV1PurchaseGoodsReceiptsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
