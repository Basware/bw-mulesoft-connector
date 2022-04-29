package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PatchV1MatchingOrdersExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1MatchingOrdersExternalCodeOperationRefinement
    extends PatchV1MatchingOrdersExternalCodeOperationBase {
  public PatchV1MatchingOrdersExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1MatchingOrdersExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
