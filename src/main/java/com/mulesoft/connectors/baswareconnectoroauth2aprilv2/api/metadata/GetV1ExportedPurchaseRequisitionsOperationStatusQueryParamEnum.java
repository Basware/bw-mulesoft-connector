package com.mulesoft.connectors.baswareconnectoroauth2aprilv2.api.metadata;

public enum GetV1ExportedPurchaseRequisitionsOperationStatusQueryParamEnum {
  WAITING_FOR_EXPORT("WaitingForExport"),

  EXPORTED("Exported");

  private String value;

  GetV1ExportedPurchaseRequisitionsOperationStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
