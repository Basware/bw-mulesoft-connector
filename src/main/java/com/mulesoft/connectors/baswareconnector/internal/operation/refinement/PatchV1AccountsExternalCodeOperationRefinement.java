package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PatchV1AccountsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1AccountsExternalCodeOperationRefinement
    extends PatchV1AccountsExternalCodeOperationBase {
  public PatchV1AccountsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1AccountsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
