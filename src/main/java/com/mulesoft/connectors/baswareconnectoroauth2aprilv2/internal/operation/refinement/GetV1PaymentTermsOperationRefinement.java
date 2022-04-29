package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1PaymentTermsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1PaymentTermsOperationRefinement extends GetV1PaymentTermsOperationBase {
  public GetV1PaymentTermsOperationRefinement() {
    super();
  }

  public GetV1PaymentTermsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
