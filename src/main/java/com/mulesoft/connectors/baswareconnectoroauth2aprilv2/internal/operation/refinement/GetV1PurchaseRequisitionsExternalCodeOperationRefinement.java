package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1PurchaseRequisitionsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PurchaseRequisitionsExternalCodeOperationRefinement
    extends GetV1PurchaseRequisitionsExternalCodeOperationBase {
  public GetV1PurchaseRequisitionsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1PurchaseRequisitionsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
