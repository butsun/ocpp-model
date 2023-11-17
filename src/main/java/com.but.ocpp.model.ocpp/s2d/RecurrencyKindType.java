package com.but.ocpp.model.ocpp.s2d;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName RecurrencyKindType
 * @Description TODO
 * @Date 2023/11/17 10:40
 * @Version 1.0
 */
public enum RecurrencyKindType {
    DAILY("Daily"),
    WEEKLY("Weekly");
    private final String value;

    RecurrencyKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrencyKindType fromValue(String v) {
        for (RecurrencyKindType c: RecurrencyKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
