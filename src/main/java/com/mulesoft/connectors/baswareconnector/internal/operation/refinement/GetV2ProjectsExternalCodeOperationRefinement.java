package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV2ProjectsExternalCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV2ProjectsExternalCodeOperationRefinement
    extends GetV2ProjectsExternalCodeOperationBase {
  public GetV2ProjectsExternalCodeOperationRefinement() {
    super();
  }

  public GetV2ProjectsExternalCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
