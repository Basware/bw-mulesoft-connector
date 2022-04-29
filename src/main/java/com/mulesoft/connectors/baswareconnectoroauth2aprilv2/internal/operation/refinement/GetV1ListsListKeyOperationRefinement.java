package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ListsListKeyOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ListsListKeyOperationRefinement extends GetV1ListsListKeyOperationBase {
  public GetV1ListsListKeyOperationRefinement() {
    super();
  }

  public GetV1ListsListKeyOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
