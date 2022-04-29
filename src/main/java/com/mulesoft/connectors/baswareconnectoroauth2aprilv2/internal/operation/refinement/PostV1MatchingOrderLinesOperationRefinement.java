package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1MatchingOrderLinesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1MatchingOrderLinesOperationRefinement
    extends PostV1MatchingOrderLinesOperationBase {
  public PostV1MatchingOrderLinesOperationRefinement() {
    super();
  }

  public PostV1MatchingOrderLinesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
