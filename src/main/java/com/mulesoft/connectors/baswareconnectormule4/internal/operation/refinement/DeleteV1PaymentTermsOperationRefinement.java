package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1PaymentTermsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1PaymentTermsOperationRefinement extends DeleteV1PaymentTermsOperationBase {
  public DeleteV1PaymentTermsOperationRefinement() {
    super();
  }

  public DeleteV1PaymentTermsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
