package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1CompaniesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1CompaniesOperationRefinement extends GetV1CompaniesOperationBase {
  public GetV1CompaniesOperationRefinement() {
    super();
  }

  public GetV1CompaniesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
