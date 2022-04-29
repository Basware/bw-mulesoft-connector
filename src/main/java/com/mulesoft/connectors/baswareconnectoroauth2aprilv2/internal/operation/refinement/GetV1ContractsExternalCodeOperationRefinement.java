package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ContractsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ContractsExternalCodeOperationRefinement
    extends GetV1ContractsExternalCodeOperationBase {
  public GetV1ContractsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ContractsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
