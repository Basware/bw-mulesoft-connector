package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV1AdvancedValidationsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1AdvancedValidationsExternalCodeOperationRefinement
    extends PatchV1AdvancedValidationsExternalCodeOperationBase {
  public PatchV1AdvancedValidationsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1AdvancedValidationsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
