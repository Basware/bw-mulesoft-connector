package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1TaxCodesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1TaxCodesOperationRefinement extends PostV1TaxCodesOperationBase {
  public PostV1TaxCodesOperationRefinement() {
    super();
  }

  public PostV1TaxCodesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
