package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1ExportedContractSpendsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedContractSpendsExternalCodeOperationRefinement
    extends GetV1ExportedContractSpendsExternalCodeOperationBase {
  public GetV1ExportedContractSpendsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ExportedContractSpendsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
