package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1ProjectsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ProjectsExternalCodeOperationRefinement
    extends GetV1ProjectsExternalCodeOperationBase {
  public GetV1ProjectsExternalCodeOperationRefinement() {
    super();
  }

  public GetV1ProjectsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
