package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1AdvancedValidationsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AdvancedValidationsExternalCodeOperationRefinement
    extends GetV1AdvancedValidationsExternalCodeOperationBase {
  public GetV1AdvancedValidationsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1AdvancedValidationsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}