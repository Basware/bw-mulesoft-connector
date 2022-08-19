package com.mulesoft.connectors.baswareconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectormule4.internal.operation.base.GetV1AccountingDocumentsInvoiceIdOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1AccountingDocumentsInvoiceIdOperationRefinement
    extends GetV1AccountingDocumentsInvoiceIdOperationBase {
  public GetV1AccountingDocumentsInvoiceIdOperationRefinement() {
    super();
  }

  public GetV1AccountingDocumentsInvoiceIdOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
