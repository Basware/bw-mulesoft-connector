package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ExportedPurchaseRequisitionsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedPurchaseRequisitionsExternalCodeOperationRefinement
    extends GetV1ExportedPurchaseRequisitionsExternalCodeOperationBase {
  public GetV1ExportedPurchaseRequisitionsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ExportedPurchaseRequisitionsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
