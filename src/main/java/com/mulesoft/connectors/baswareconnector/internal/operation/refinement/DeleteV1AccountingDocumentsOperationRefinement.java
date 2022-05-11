package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.DeleteV1AccountingDocumentsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class DeleteV1AccountingDocumentsOperationRefinement
    extends DeleteV1AccountingDocumentsOperationBase {
  public DeleteV1AccountingDocumentsOperationRefinement() {
    super();
  }

  public DeleteV1AccountingDocumentsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
