package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.refinement;

import com.mulesoft.connectors.baswareconnectoroauth2aprilv2.internal.operation.base.GetV1CompaniesCompanyCodeOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetV1CompaniesCompanyCodeOperationRefinement
    extends GetV1CompaniesCompanyCodeOperationBase {
  public GetV1CompaniesCompanyCodeOperationRefinement() {
    super();
  }

  public GetV1CompaniesCompanyCodeOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
