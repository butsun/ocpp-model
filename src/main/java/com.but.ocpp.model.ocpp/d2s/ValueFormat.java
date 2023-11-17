package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName ValueFormat
 * @Description TODO
 * @Date 2023/11/17 09:58
 * @Version 1.0
 */
public enum ValueFormat {

    RAW("Raw"),
    SIGNED_DATA("SignedData");
    private final String value;

    ValueFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueFormat fromValue(String v) {
        for (ValueFormat c: ValueFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
