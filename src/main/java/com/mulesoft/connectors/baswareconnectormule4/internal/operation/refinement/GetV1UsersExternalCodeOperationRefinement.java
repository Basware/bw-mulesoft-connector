package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1UsersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1UsersExternalCodeOperationRefinement extends GetV1UsersExternalCodeOperationBase {
  public GetV1UsersExternalCodeOperationRefinement() {
    super();
  }

  public GetV1UsersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
