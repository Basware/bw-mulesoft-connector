package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1ErrorFeedbacksRequestIdOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ErrorFeedbacksRequestIdOperationRefinement
    extends GetV1ErrorFeedbacksRequestIdOperationBase {
  public GetV1ErrorFeedbacksRequestIdOperationRefinement() {
    super();
  }

  public GetV1ErrorFeedbacksRequestIdOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
