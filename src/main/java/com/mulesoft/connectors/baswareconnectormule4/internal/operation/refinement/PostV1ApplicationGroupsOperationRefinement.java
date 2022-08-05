package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.PostV1ApplicationGroupsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ApplicationGroupsOperationRefinement
    extends PostV1ApplicationGroupsOperationBase {
  public PostV1ApplicationGroupsOperationRefinement() {
    super();
  }

  public PostV1ApplicationGroupsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
