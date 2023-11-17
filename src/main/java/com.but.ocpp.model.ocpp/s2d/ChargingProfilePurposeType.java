package com.but.ocpp.model.ocpp.s2d;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName ChargingProfilePurposeType
 * @Description TODO
 * @Date 2023/11/17 10:39
 * @Version 1.0
 */
public enum ChargingProfilePurposeType {
    CHARGE_POINT_MAX_PROFILE("ChargePointMaxProfile"),
    TX_DEFAULT_PROFILE("TxDefaultProfile"),
    TX_PROFILE("TxProfile");
    private final String value;

    ChargingProfilePurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingProfilePurposeType fromValue(String v) {
        for (ChargingProfilePurposeType c: ChargingProfilePurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
