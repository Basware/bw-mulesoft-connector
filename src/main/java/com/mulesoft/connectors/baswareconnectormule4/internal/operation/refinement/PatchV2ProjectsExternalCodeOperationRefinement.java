package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV2ProjectsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV2ProjectsExternalCodeOperationRefinement
    extends PatchV2ProjectsExternalCodeOperationBase {
  public PatchV2ProjectsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV2ProjectsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
