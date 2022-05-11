package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1PurchaseRequisitionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1PurchaseRequisitionsOperationRefinement
    extends PostV1PurchaseRequisitionsOperationBase {
  public PostV1PurchaseRequisitionsOperationRefinement() {
    super();
  }

  public PostV1PurchaseRequisitionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
