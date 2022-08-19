package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV2ProjectsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV2ProjectsOperationRefinement extends GetV2ProjectsOperationBase {
  public GetV2ProjectsOperationRefinement() {
    super();
  }

  public GetV2ProjectsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
