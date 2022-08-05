package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1AdvancedValidationsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1AdvancedValidationsOperationRefinement
    extends DeleteV1AdvancedValidationsOperationBase {
  public DeleteV1AdvancedValidationsOperationRefinement() {
    super();
  }

  public DeleteV1AdvancedValidationsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
