package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1ExportedContractSpendsAcknowledgeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ExportedContractSpendsAcknowledgeOperationRefinement
    extends PostV1ExportedContractSpendsAcknowledgeOperationBase {
  public PostV1ExportedContractSpendsAcknowledgeOperationRefinement() {
    super();
  }

  public PostV1ExportedContractSpendsAcknowledgeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
