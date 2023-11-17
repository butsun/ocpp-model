package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName Location
 * @Description TODO
 * @Date 2023/11/17 10:00
 * @Version 1.0
 */
public enum Location {

    BODY("Body"),
    CABLE("Cable"),
    EV("EV"),
    INLET("Inlet"),
    OUTLET("Outlet");
    private final String value;

    Location(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Location fromValue(String v) {
        for (Location c: Location.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
