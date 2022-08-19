package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1ExportedContractSpendsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ExportedContractSpendsOperationRefinement
    extends DeleteV1ExportedContractSpendsOperationBase {
  public DeleteV1ExportedContractSpendsOperationRefinement() {
    super();
  }

  public DeleteV1ExportedContractSpendsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
