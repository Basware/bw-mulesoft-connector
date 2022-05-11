package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1TaxCodesExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1TaxCodesExternalCodeOperationRefinement
    extends GetV1TaxCodesExternalCodeOperationBase {
  public GetV1TaxCodesExternalCodeOperationRefinement() {
    super();
  }

  public GetV1TaxCodesExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
