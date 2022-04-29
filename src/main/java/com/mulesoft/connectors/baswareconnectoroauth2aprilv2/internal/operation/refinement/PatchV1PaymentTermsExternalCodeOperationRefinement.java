package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PatchV1PaymentTermsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1PaymentTermsExternalCodeOperationRefinement
    extends PatchV1PaymentTermsExternalCodeOperationBase {
  public PatchV1PaymentTermsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1PaymentTermsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
