package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1ApplicationGroupsApplicationGroupCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1ApplicationGroupsApplicationGroupCodeOperationRefinement
    extends GetV1ApplicationGroupsApplicationGroupCodeOperationBase {
  public GetV1ApplicationGroupsApplicationGroupCodeOperationRefinement() {
    super();
  }

  public GetV1ApplicationGroupsApplicationGroupCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
