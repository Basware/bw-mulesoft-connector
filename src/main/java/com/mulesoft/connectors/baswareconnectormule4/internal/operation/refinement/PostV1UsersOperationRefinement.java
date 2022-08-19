package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1UsersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1UsersOperationRefinement extends PostV1UsersOperationBase {
  public PostV1UsersOperationRefinement() {
    super();
  }

  public PostV1UsersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
