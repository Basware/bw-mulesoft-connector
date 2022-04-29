package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ApplicationGroupsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ApplicationGroupsOperationRefinement extends GetV1ApplicationGroupsOperationBase {
  public GetV1ApplicationGroupsOperationRefinement() {
    super();
  }

  public GetV1ApplicationGroupsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
