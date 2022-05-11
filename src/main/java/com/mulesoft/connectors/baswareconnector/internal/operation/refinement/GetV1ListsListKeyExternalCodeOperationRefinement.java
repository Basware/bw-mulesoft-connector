package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1ListsListKeyExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ListsListKeyExternalCodeOperationRefinement
    extends GetV1ListsListKeyExternalCodeOperationBase {
  public GetV1ListsListKeyExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ListsListKeyExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
