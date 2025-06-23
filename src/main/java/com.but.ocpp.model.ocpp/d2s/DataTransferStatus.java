package com.but.ocpp.model.ocpp.d2s;

public enum DataTransferStatus {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    UNKNOWN_MESSAGE_ID("UnknownMessageId"),
    UNKNOWN_VENDOR_ID("UnknownVendorId");
    private final String value;

    DataTransferStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTransferStatus fromValue(String v) {
        for (DataTransferStatus c: DataTransferStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}