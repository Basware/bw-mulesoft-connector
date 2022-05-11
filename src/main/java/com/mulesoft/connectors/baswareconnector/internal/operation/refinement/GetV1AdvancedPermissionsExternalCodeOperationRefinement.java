package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1AdvancedPermissionsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AdvancedPermissionsExternalCodeOperationRefinement
    extends GetV1AdvancedPermissionsExternalCodeOperationBase {
  public GetV1AdvancedPermissionsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1AdvancedPermissionsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
