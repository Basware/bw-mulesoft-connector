package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1CompaniesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1CompaniesOperationRefinement extends PostV1CompaniesOperationBase {
  public PostV1CompaniesOperationRefinement() {
    super();
  }

  public PostV1CompaniesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
