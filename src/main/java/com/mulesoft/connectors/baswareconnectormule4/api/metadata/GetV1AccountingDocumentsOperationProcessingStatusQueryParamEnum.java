package com.mulesoft.connectors.baswareconnectormule4.api.metadata;

public enum GetV1AccountingDocumentsOperationProcessingStatusQueryParamEnum {
  WAITING_FOR_PREBOOK("WaitingForPrebook"),

  PREBOOK_IN_PROGRESS("PrebookInProgress"),

  PREBOOKED("Prebooked"),

  PREBOOK_FAILED("PrebookFailed"),

  WAITING_FOR_TRANSFER("WaitingForTransfer"),

  TRANSFER_IN_PROGRESS("TransferInProgress"),

  TRANSFERRED("Transferred"),

  TRANSFER_FAILED("TransferFailed"),

  WAITING_FOR_PREBOOK_CANCELATION("WaitingForPrebookCancelation"),

  PREBOOK_CANCELATION_IN_PROGRESS("PrebookCancelationInProgress"),

  PREBOOK_CANCELED("PrebookCanceled"),

  PREBOOK_CANCEL_FAILED("PrebookCancelFailed"),

  WAITING_TO_BE_REMOVED("WaitingToBeRemoved"),

  REMOVE_IN_PROGRESS("RemoveInProgress"),

  REMOVED("Removed"),

  REMOVE_FAILED("RemoveFailed"),

  WAITING_TO_BE_RETURNED("WaitingToBeReturned"),

  RETURN_IN_PROGRESS("ReturnInProgress"),

  RETURNED("Returned"),

  RETURN_FAILED("ReturnFailed"),

  WAITING_TO_BE_COMPLETED("WaitingToBeCompleted"),

  COMPLETION_IN_PROGRESS("CompletionInProgress"),

  COMPLETED("Completed"),

  COMPLETION_FAILED("CompletionFailed"),

  PAID("Paid"),

  NEW("New"),

  INTERNAL_STATUS_CHANGE("InternalStatusChange");

  private String value;

  GetV1AccountingDocumentsOperationProcessingStatusQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
