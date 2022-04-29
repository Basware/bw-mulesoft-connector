package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ErrorFeedbacksOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ErrorFeedbacksOperationRefinement extends GetV1ErrorFeedbacksOperationBase {
  public GetV1ErrorFeedbacksOperationRefinement() {
    super();
  }

  public GetV1ErrorFeedbacksOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
