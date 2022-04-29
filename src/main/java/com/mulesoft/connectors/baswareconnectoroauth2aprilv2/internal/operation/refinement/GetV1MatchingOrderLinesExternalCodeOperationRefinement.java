package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1MatchingOrderLinesExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1MatchingOrderLinesExternalCodeOperationRefinement
    extends GetV1MatchingOrderLinesExternalCodeOperationBase {
  public GetV1MatchingOrderLinesExternalCodeOperationRefinement() {
    super();
  }

  public GetV1MatchingOrderLinesExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
