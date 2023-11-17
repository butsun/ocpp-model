package com.but.ocpp.model.ocpp.s2d;

/**
 * @Author jun.sun
 * @ClassName RemoteStartStopStatus
 * @Description TODO
 * @Date 2023/11/17 10:43
 * @Version 1.0
 */
public enum RemoteStartStopStatus {

    ACCEPTED("Accepted"),
    REJECTED("Rejected");
    private final String value;

    RemoteStartStopStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemoteStartStopStatus fromValue(String v) {
        for (RemoteStartStopStatus c: RemoteStartStopStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
