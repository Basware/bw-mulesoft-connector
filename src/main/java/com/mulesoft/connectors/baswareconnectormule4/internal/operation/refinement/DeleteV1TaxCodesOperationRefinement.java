package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1TaxCodesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1TaxCodesOperationRefinement extends DeleteV1TaxCodesOperationBase {
  public DeleteV1TaxCodesOperationRefinement() {
    super();
  }

  public DeleteV1TaxCodesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
