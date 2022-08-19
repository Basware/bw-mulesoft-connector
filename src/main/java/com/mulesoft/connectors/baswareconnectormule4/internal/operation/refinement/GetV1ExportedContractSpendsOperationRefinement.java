package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1ExportedContractSpendsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedContractSpendsOperationRefinement
    extends GetV1ExportedContractSpendsOperationBase {
  public GetV1ExportedContractSpendsOperationRefinement() {
    super();
  }

  public GetV1ExportedContractSpendsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
