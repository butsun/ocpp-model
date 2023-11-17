package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName AuthorizationStatus
 * @Description TODO
 * @Date 2023/11/17 09:51
 * @Version 1.0
 */
public enum AuthorizationStatus {
    ACCEPTED("Accepted"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("ConcurrentTx")
    CONCURRENT_TX("ConcurrentTx");
    private final String value;

    AuthorizationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationStatus fromValue(String v) {
        for (AuthorizationStatus c: AuthorizationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
