package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1MatchingOrdersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1MatchingOrdersExternalCodeOperationRefinement
    extends GetV1MatchingOrdersExternalCodeOperationBase {
  public GetV1MatchingOrdersExternalCodeOperationRefinement() {
    super();
  }

  public GetV1MatchingOrdersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
