package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1AdvancedValidationsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1AdvancedValidationsOperationRefinement
    extends PostV1AdvancedValidationsOperationBase {
  public PostV1AdvancedValidationsOperationRefinement() {
    super();
  }

  public PostV1AdvancedValidationsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
