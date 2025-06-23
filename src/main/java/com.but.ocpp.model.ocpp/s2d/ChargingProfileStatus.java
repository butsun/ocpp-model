package com.but.ocpp.model.ocpp.s2d;

public enum ChargingProfileStatus {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    NOT_SUPPORTED("NotSupported");
    private final String value;

    ChargingProfileStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingProfileStatus fromValue(String v) {
        for (ChargingProfileStatus c: ChargingProfileStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}