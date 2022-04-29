package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.DeleteV1ProjectsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ProjectsOperationRefinement extends DeleteV1ProjectsOperationBase {
  public DeleteV1ProjectsOperationRefinement() {
    super();
  }

  public DeleteV1ProjectsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
