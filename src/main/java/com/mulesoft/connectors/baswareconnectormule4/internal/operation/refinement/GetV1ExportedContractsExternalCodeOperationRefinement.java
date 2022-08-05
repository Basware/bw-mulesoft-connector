package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1ExportedContractsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedContractsExternalCodeOperationRefinement
    extends GetV1ExportedContractsExternalCodeOperationBase {
  public GetV1ExportedContractsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ExportedContractsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
