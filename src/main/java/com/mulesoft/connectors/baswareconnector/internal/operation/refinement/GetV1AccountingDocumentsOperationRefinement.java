package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.GetV1AccountingDocumentsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AccountingDocumentsOperationRefinement
    extends GetV1AccountingDocumentsOperationBase {
  public GetV1AccountingDocumentsOperationRefinement() {
    super();
  }

  public GetV1AccountingDocumentsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
