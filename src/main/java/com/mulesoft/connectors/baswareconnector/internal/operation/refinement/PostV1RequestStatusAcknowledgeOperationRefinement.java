package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1RequestStatusAcknowledgeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1RequestStatusAcknowledgeOperationRefinement
    extends PostV1RequestStatusAcknowledgeOperationBase {
  public PostV1RequestStatusAcknowledgeOperationRefinement() {
    super();
  }

  public PostV1RequestStatusAcknowledgeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
