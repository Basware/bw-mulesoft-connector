package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.DeleteV1ListsListKeyOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1ListsListKeyOperationRefinement extends DeleteV1ListsListKeyOperationBase {
  public DeleteV1ListsListKeyOperationRefinement() {
    super();
  }

  public DeleteV1ListsListKeyOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
