package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1AdvancedPermissionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1AdvancedPermissionsOperationRefinement
    extends DeleteV1AdvancedPermissionsOperationBase {
  public DeleteV1AdvancedPermissionsOperationRefinement() {
    super();
  }

  public DeleteV1AdvancedPermissionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
