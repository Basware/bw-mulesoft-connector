package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1CostCentersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1CostCentersOperationRefinement extends GetV1CostCentersOperationBase {
  public GetV1CostCentersOperationRefinement() {
    super();
  }

  public GetV1CostCentersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
