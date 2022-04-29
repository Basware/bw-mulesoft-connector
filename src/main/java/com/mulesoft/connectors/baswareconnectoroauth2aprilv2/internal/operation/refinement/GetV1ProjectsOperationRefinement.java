package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ProjectsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ProjectsOperationRefinement extends GetV1ProjectsOperationBase {
  public GetV1ProjectsOperationRefinement() {
    super();
  }

  public GetV1ProjectsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
