package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV1UsersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1UsersExternalCodeOperationRefinement
    extends PatchV1UsersExternalCodeOperationBase {
  public PatchV1UsersExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1UsersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
