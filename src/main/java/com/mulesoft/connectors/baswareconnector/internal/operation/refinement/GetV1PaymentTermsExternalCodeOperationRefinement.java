package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1PaymentTermsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PaymentTermsExternalCodeOperationRefinement
    extends GetV1PaymentTermsExternalCodeOperationBase {
  public GetV1PaymentTermsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1PaymentTermsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
