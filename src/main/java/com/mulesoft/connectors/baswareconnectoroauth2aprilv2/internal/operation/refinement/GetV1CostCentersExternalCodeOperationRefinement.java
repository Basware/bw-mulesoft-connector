package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1CostCentersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1CostCentersExternalCodeOperationRefinement
    extends GetV1CostCentersExternalCodeOperationBase {
  public GetV1CostCentersExternalCodeOperationRefinement() {
    super();
  }

  public GetV1CostCentersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
