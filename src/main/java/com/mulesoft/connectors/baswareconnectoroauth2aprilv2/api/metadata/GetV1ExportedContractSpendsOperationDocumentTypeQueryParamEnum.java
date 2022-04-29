package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata;

public enum GetV1ExportedContractSpendsOperationDocumentTypeQueryParamEnum {
  ACCOUNTING_DOCUMENT("AccountingDocument"),

  PURCHASE_ORDER("PurchaseOrder"),

  SPEND_PLAN("SpendPlan");

  private String value;

  GetV1ExportedContractSpendsOperationDocumentTypeQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
