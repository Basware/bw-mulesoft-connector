package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1PaymentTermsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1PaymentTermsOperationRefinement extends PostV1PaymentTermsOperationBase {
  public PostV1PaymentTermsOperationRefinement() {
    super();
  }

  public PostV1PaymentTermsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
