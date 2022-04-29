package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1MatchingOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1MatchingOrdersOperationRefinement extends GetV1MatchingOrdersOperationBase {
  public GetV1MatchingOrdersOperationRefinement() {
    super();
  }

  public GetV1MatchingOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
