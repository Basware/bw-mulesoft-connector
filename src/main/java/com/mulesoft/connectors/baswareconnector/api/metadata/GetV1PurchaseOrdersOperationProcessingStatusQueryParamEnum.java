package com.mulesoft.connectors.baswareconnector.api.metadata;

public enum GetV1PurchaseOrdersOperationProcessingStatusQueryParamEnum {
  UNCOMPLETED("Uncompleted"),

  READY_FOR_IMPORT("ReadyForImport"),

  IMPORT_IN_PROGRESS("ImportInProgress"),

  IMPORTED("Imported"),

  IMPORT_FAILED("ImportFailed");

  private String value;

  GetV1PurchaseOrdersOperationProcessingStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
