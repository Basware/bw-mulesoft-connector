package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1VendorsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1VendorsOperationRefinement extends GetV1VendorsOperationBase {
  public GetV1VendorsOperationRefinement() {
    super();
  }

  public GetV1VendorsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
