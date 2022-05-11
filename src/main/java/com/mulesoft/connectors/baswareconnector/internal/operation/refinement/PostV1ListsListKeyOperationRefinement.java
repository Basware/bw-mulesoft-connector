package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1ListsListKeyOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ListsListKeyOperationRefinement extends PostV1ListsListKeyOperationBase {
  public PostV1ListsListKeyOperationRefinement() {
    super();
  }

  public PostV1ListsListKeyOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
