package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PatchV1ContractsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1ContractsExternalCodeOperationRefinement
    extends PatchV1ContractsExternalCodeOperationBase {
  public PatchV1ContractsExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1ContractsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
