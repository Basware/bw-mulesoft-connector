package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PatchV1TaxCodesExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1TaxCodesExternalCodeOperationRefinement
    extends PatchV1TaxCodesExternalCodeOperationBase {
  public PatchV1TaxCodesExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1TaxCodesExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
