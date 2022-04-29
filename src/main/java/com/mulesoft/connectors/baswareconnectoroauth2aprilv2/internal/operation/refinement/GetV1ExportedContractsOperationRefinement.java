package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ExportedContractsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ExportedContractsOperationRefinement extends GetV1ExportedContractsOperationBase {
  public GetV1ExportedContractsOperationRefinement() {
    super();
  }

  public GetV1ExportedContractsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
