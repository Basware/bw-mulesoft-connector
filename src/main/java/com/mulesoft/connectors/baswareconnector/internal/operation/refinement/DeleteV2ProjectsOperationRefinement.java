package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.DeleteV2ProjectsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV2ProjectsOperationRefinement extends DeleteV2ProjectsOperationBase {
  public DeleteV2ProjectsOperationRefinement() {
    super();
  }

  public DeleteV2ProjectsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
