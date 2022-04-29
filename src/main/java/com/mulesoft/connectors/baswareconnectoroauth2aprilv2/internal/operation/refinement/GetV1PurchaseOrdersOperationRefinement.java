package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1PurchaseOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PurchaseOrdersOperationRefinement extends GetV1PurchaseOrdersOperationBase {
  public GetV1PurchaseOrdersOperationRefinement() {
    super();
  }

  public GetV1PurchaseOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
