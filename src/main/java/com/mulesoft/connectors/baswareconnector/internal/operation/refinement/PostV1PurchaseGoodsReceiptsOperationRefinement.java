package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1PurchaseGoodsReceiptsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1PurchaseGoodsReceiptsOperationRefinement
    extends PostV1PurchaseGoodsReceiptsOperationBase {
  public PostV1PurchaseGoodsReceiptsOperationRefinement() {
    super();
  }

  public PostV1PurchaseGoodsReceiptsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
