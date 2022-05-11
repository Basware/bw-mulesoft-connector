package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1PurchaseOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1PurchaseOrdersOperationRefinement extends PostV1PurchaseOrdersOperationBase {
  public PostV1PurchaseOrdersOperationRefinement() {
    super();
  }

  public PostV1PurchaseOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
