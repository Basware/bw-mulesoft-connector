package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1MatchingOrderLinesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1MatchingOrderLinesOperationRefinement
    extends DeleteV1MatchingOrderLinesOperationBase {
  public DeleteV1MatchingOrderLinesOperationRefinement() {
    super();
  }

  public DeleteV1MatchingOrderLinesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
