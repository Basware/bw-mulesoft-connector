package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.DeleteV1ErrorFeedbacksOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ErrorFeedbacksOperationRefinement extends DeleteV1ErrorFeedbacksOperationBase {
  public DeleteV1ErrorFeedbacksOperationRefinement() {
    super();
  }

  public DeleteV1ErrorFeedbacksOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
