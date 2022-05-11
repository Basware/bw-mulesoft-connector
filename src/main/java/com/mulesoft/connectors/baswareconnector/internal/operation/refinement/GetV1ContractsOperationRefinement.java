package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1ContractsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ContractsOperationRefinement extends GetV1ContractsOperationBase {
  public GetV1ContractsOperationRefinement() {
    super();
  }

  public GetV1ContractsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}