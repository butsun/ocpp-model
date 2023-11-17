package com.but.ocpp.model.ocpp.d2s;


/**
 * @Author jun.sun
 * @ClassName Phase
 * @Description TODO
 * @Date 2023/11/17 09:59
 * @Version 1.0
 */
public enum Phase {

    L_1("L1"),
    L_2("L2"),
    L_3("L3"),
    N("N"),
    L_1_N("L1-N"),
    L_2_N("L2-N"),
    L_3_N("L3-N"),
    L_1_L_2("L1-L2"),
    L_2_L_3("L2-L3"),
    L_3_L_1("L3-L1");
    private final String value;

    Phase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Phase fromValue(String v) {
        for (Phase c: Phase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
