package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1AdvancedPermissionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AdvancedPermissionsOperationRefinement
    extends GetV1AdvancedPermissionsOperationBase {
  public GetV1AdvancedPermissionsOperationRefinement() {
    super();
  }

  public GetV1AdvancedPermissionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
