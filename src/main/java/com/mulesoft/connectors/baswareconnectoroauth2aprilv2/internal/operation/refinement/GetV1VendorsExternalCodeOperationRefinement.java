package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1VendorsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1VendorsExternalCodeOperationRefinement
    extends GetV1VendorsExternalCodeOperationBase {
  public GetV1VendorsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1VendorsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
