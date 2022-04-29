package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.PostV1ContractsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1ContractsOperationRefinement extends PostV1ContractsOperationBase {
  public PostV1ContractsOperationRefinement() {
    super();
  }

  public PostV1ContractsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
