package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1PurchaseRequisitionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PurchaseRequisitionsOperationRefinement
    extends GetV1PurchaseRequisitionsOperationBase {
  public GetV1PurchaseRequisitionsOperationRefinement() {
    super();
  }

  public GetV1PurchaseRequisitionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
