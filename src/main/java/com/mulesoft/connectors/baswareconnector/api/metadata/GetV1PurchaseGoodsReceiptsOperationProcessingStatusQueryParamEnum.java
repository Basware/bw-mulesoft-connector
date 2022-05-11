package com.mulesoft.connectors.baswareconnector.api.metadata;

public enum GetV1PurchaseGoodsReceiptsOperationProcessingStatusQueryParamEnum {
  IMPORT_IN_PROGRESS("ImportInProgress"),

  IMPORTED("Imported"),

  IMPORT_FAILED("ImportFailed");

  private String value;

  GetV1PurchaseGoodsReceiptsOperationProcessingStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
