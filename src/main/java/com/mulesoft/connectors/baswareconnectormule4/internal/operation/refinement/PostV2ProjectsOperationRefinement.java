package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV2ProjectsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV2ProjectsOperationRefinement extends PostV2ProjectsOperationBase {
  public PostV2ProjectsOperationRefinement() {
    super();
  }

  public PostV2ProjectsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
