package com.mulesoft.connectors.baswareconnectormule4.api.metadata;

public enum GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum {
  WAITING_FOR_EXPORT("WaitingForExport"),

  EXPORTED("Exported");

  private String value;

  GetV1ExportedPurchaseOrdersOperationOrderStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
