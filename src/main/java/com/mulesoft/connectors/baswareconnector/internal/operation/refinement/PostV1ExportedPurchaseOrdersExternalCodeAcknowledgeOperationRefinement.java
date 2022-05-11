package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationRefinement
    extends PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationBase {
  public PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationRefinement() {
    super();
  }

  public PostV1ExportedPurchaseOrdersExternalCodeAcknowledgeOperationRefinement(
      ExpressionLanguage arg0) {
    super(arg0);
  }
}
