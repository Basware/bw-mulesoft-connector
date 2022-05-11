package com.mulesoft.connectors.baswareconnector.api.metadata;

public enum GetV1ExportedContractSpendsOperationProcessingStatusQueryParamEnum {
  WAITING_FOR_EXPORT("WaitingForExport"),

  EXPORTED("Exported");

  private String value;

  GetV1ExportedContractSpendsOperationProcessingStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
