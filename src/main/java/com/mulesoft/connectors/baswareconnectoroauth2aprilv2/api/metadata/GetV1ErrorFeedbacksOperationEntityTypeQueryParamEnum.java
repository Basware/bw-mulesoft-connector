package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata;

public enum GetV1ErrorFeedbacksOperationEntityTypeQueryParamEnum {
  ACCOUNT("Account"),

  CONTRACT("Contract"),

  COST_CENTER("CostCenter"),

  TAX_CODE("TaxCode"),

  EXCHANGE_RATE("ExchangeRate"),

  PAYMENT_TERM("PaymentTerm"),

  BUDGET("Budget"),

  USER("User"),

  PROJECT("Project"),

  MATCHING_ORDER("MatchingOrder"),

  MATCHING_ORDER_LINE("MatchingOrderLine"),

  ACCOUNTING_DOCUMENT("AccountingDocument"),

  GENERIC_LIST("GenericList"),

  MATCHING_GOODS_RECEIPT("MatchingGoodsReceipt"),

  ADVANCED_PERMISSION("AdvancedPermission"),

  TRANSFER_RESPONSE("TransferResponse"),

  PAYMENT_RESPONSE("PaymentResponse"),

  PREBOOK_RESPONSE("PrebookResponse"),

  VENDOR("Vendor"),

  ADVANCED_VALIDATION("AdvancedValidation"),

  PURCHASE_REQUISITION("PurchaseRequisition"),

  ERROR_FEEDBACK("ErrorFeedback"),

  REDISTRIBUTE_DATA("RedistributeData"),

  TASK_STATUS("TaskStatus"),

  COMPANY("Company"),

  COMPANY_GROUP("CompanyGroup"),

  COMPANY_VIEW("CompanyView"),

  EXPORTED_PURCHASE_ORDER("ExportedPurchaseOrder"),

  PURCHASE_ORDER("PurchaseOrder"),

  PURCHASE_GOODS_RECEIPT("PurchaseGoodsReceipt"),

  APPLICATION_GROUP("ApplicationGroup"),

  EXPORTED_PURCHASE_REQUISITION("ExportedPurchaseRequisition"),

  OPERATOR_USER("OperatorUser"),

  EXPORTED_CONTRACT("ExportedContract"),

  EXPORTED_CONTRACT_SPEND("ExportedContractSpend");

  private String value;

  GetV1ErrorFeedbacksOperationEntityTypeQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
