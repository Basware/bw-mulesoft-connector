package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PatchV1VendorsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1VendorsExternalCodeOperationRefinement
    extends PatchV1VendorsExternalCodeOperationBase {
  public PatchV1VendorsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1VendorsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
