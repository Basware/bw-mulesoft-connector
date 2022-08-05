package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1RedistributeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1RedistributeOperationRefinement extends PostV1RedistributeOperationBase {
  public PostV1RedistributeOperationRefinement() {
    super();
  }

  public PostV1RedistributeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
