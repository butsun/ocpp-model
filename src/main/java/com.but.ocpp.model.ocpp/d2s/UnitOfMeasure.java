package com.but.ocpp.model.ocpp.d2s;

/**
 * @Author jun.sun
 * @ClassName UnitOfMeasure
 * @Description TODO
 * @Date 2023/11/17 10:00
 * @Version 1.0
 */
public enum UnitOfMeasure {

    CELSIUS("Celsius"),
    FAHRENHEIT("Fahrenheit"),
    WH("Wh"),
    K_WH("kWh"),
    VARH("varh"),
    KVARH("kvarh"),
    W("W"),
    K_W("kW"),
    VA("VA"),
    K_VA("kVA"),
    VAR("var"),
    KVAR("kvar"),
    A("A"),
    V("V"),
    K("K"),
    PERCENT("Percent");
    private final String value;

    UnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfMeasure fromValue(String v) {
        for (UnitOfMeasure c: UnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
