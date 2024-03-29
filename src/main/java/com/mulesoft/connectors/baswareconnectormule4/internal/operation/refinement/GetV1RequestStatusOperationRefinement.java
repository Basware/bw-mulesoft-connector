package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1RequestStatusOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1RequestStatusOperationRefinement extends GetV1RequestStatusOperationBase {
  public GetV1RequestStatusOperationRefinement() {
    super();
  }

  public GetV1RequestStatusOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
