package com.but.ocpp.model.ocpp.s2d;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName ChargingProfileKindType
 * @Description TODO
 * @Date 2023/11/17 10:39
 * @Version 1.0
 */
public enum ChargingProfileKindType {

    ABSOLUTE("Absolute"),
    RECURRING("Recurring"),
    RELATIVE("Relative");
    private final String value;

    ChargingProfileKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingProfileKindType fromValue(String v) {
        for (ChargingProfileKindType c: ChargingProfileKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
