package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PatchV1ListsListKeyExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PatchV1ListsListKeyExternalCodeOperationRefinement
    extends PatchV1ListsListKeyExternalCodeOperationBase {
  public PatchV1ListsListKeyExternalCodeOperationRefinement() {
    super();
  }

  public PatchV1ListsListKeyExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
