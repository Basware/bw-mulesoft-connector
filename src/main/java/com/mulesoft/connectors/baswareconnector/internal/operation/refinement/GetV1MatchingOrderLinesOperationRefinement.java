package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1MatchingOrderLinesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1MatchingOrderLinesOperationRefinement
    extends GetV1MatchingOrderLinesOperationBase {
  public GetV1MatchingOrderLinesOperationRefinement() {
    super();
  }

  public GetV1MatchingOrderLinesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
