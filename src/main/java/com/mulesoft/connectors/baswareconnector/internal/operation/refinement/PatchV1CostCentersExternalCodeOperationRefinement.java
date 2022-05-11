package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PatchV1CostCentersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1CostCentersExternalCodeOperationRefinement
    extends PatchV1CostCentersExternalCodeOperationBase {
  public PatchV1CostCentersExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1CostCentersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
