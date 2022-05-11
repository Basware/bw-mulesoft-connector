package com.mulesoft.connectors.baswareconnector.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnector.internal.operation.base.PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationRefinement
    extends PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationBase {
  public PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationRefinement() {
    super();
  }

  public PostV1AccountingDocumentsInvoiceIdAcknowledgeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
