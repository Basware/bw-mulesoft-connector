package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV1ProjectsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1ProjectsExternalCodeOperationRefinement
    extends PatchV1ProjectsExternalCodeOperationBase {
  public PatchV1ProjectsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1ProjectsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
