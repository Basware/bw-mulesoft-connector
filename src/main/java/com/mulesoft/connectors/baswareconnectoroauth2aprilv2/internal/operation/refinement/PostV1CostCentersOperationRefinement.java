package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1CostCentersOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1CostCentersOperationRefinement extends PostV1CostCentersOperationBase {
  public PostV1CostCentersOperationRefinement() {
    super();
  }

  public PostV1CostCentersOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
