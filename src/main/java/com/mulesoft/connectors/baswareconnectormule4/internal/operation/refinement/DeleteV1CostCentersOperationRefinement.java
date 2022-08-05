package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1CostCentersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1CostCentersOperationRefinement extends DeleteV1CostCentersOperationBase {
  public DeleteV1CostCentersOperationRefinement() {
    super();
  }

  public DeleteV1CostCentersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
