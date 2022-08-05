package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.DeleteV1VendorsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1VendorsOperationRefinement extends DeleteV1VendorsOperationBase {
  public DeleteV1VendorsOperationRefinement() {
    super();
  }

  public DeleteV1VendorsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
