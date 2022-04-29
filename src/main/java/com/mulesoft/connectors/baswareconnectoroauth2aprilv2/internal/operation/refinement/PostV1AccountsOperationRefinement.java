package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1AccountsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1AccountsOperationRefinement extends PostV1AccountsOperationBase {
  public PostV1AccountsOperationRefinement() {
    super();
  }

  public PostV1AccountsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
