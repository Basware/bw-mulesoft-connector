package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1MatchingOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1MatchingOrdersOperationRefinement extends DeleteV1MatchingOrdersOperationBase {
  public DeleteV1MatchingOrdersOperationRefinement() {
    super();
  }

  public DeleteV1MatchingOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
