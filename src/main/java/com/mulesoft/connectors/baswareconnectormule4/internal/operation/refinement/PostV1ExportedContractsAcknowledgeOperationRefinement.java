package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1ExportedContractsAcknowledgeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ExportedContractsAcknowledgeOperationRefinement
    extends PostV1ExportedContractsAcknowledgeOperationBase {
  public PostV1ExportedContractsAcknowledgeOperationRefinement() {
    super();
  }

  public PostV1ExportedContractsAcknowledgeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
