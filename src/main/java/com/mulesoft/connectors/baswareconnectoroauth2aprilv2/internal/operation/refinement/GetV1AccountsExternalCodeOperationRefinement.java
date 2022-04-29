package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1AccountsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AccountsExternalCodeOperationRefinement
    extends GetV1AccountsExternalCodeOperationBase {
  public GetV1AccountsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1AccountsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
