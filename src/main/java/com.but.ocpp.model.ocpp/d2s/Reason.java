package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName Reason
 * @Description TODO
 * @Date 2023/11/17 10:23
 * @Version 1.0
 */
public enum Reason {

    EMERGENCY_STOP("EmergencyStop"),
    EV_DISCONNECTED("EVDisconnected"),
    HARD_RESET("HardReset"),
    LOCAL("Local"),
    OTHER("Other"),
    POWER_LOSS("PowerLoss"),
    REBOOT("Reboot"),
    REMOTE("Remote"),
    SOFT_RESET("SoftReset"),
    UNLOCK_COMMAND("UnlockCommand"),
    DE_AUTHORIZED("DeAuthorized");
    private final String value;

    Reason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Reason fromValue(String v) {
        for (Reason c: Reason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
