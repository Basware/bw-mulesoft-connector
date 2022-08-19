package com.mulesoft.connectors.baswareconnectormule4.api.metadata;

public enum GetV1RequestStatusOperationStatusQueryParamEnum {
  IN_PROGRESS("InProgress"),

  SUCCESS("Success"),

  ERROR("Error"),

  ACKNOWLEDGED_SUCCESS("AcknowledgedSuccess"),

  ACKNOWLEDGED_ERROR("AcknowledgedError");

  private String value;

  GetV1RequestStatusOperationStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
