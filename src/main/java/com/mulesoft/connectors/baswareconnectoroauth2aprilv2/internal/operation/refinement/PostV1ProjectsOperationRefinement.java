package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1ProjectsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ProjectsOperationRefinement extends PostV1ProjectsOperationBase {
  public PostV1ProjectsOperationRefinement() {
    super();
  }

  public PostV1ProjectsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
