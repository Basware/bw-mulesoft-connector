package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1MatchingOrdersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1MatchingOrdersOperationRefinement extends PostV1MatchingOrdersOperationBase {
  public PostV1MatchingOrdersOperationRefinement() {
    super();
  }

  public PostV1MatchingOrdersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
