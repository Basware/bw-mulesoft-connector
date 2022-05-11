package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.DeleteV1ContractsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ContractsOperationRefinement extends DeleteV1ContractsOperationBase {
  public DeleteV1ContractsOperationRefinement() {
    super();
  }

  public DeleteV1ContractsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}