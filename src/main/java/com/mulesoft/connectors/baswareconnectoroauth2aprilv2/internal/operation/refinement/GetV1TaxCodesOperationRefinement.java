package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1TaxCodesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1TaxCodesOperationRefinement extends GetV1TaxCodesOperationBase {
  public GetV1TaxCodesOperationRefinement() {
    super();
  }

  public GetV1TaxCodesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
