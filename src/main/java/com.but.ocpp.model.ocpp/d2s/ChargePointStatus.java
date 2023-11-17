package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName ChargePointStatus
 * @Description TODO
 * @Date 2023/11/17 10:20
 * @Version 1.0
 */
public enum ChargePointStatus {


    AVAILABLE("Available"),
    PREPARING("Preparing"),
    CHARGING("Charging"),
    SUSPENDED_EV("SuspendedEV"),
    SUSPENDED_EVSE("SuspendedEVSE"),
    FINISHING("Finishing"),
    RESERVED("Reserved"),
    FAULTED("Faulted"),
    UNAVAILABLE("Unavailable");
    private final String value;

    ChargePointStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargePointStatus fromValue(String v) {
        for (ChargePointStatus c: ChargePointStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }


}
