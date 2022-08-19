package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1VendorsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1VendorsOperationRefinement extends PostV1VendorsOperationBase {
  public PostV1VendorsOperationRefinement() {
    super();
  }

  public PostV1VendorsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
