package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1UsersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1UsersOperationRefinement extends GetV1UsersOperationBase {
  public GetV1UsersOperationRefinement() {
    super();
  }

  public GetV1UsersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
