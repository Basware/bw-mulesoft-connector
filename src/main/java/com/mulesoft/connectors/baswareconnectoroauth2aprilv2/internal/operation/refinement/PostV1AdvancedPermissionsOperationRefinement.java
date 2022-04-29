package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1AdvancedPermissionsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1AdvancedPermissionsOperationRefinement
    extends PostV1AdvancedPermissionsOperationBase {
  public PostV1AdvancedPermissionsOperationRefinement() {
    super();
  }

  public PostV1AdvancedPermissionsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
