package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PatchV1AdvancedPermissionsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1AdvancedPermissionsExternalCodeOperationRefinement
    extends PatchV1AdvancedPermissionsExternalCodeOperationBase {
  public PatchV1AdvancedPermissionsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1AdvancedPermissionsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
