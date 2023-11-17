package com.but.ocpp.model.ocpp.s2d;

/**
 * @Author jun.sun
 * @ClassName ChargingRateUnitType
 * @Description TODO
 * @Date 2023/11/17 10:41
 * @Version 1.0
 */
public enum ChargingRateUnitType {
    W,
    A;

    public String value() {
        return name();
    }

    public static ChargingRateUnitType fromValue(String v) {
        return valueOf(v);
    }

}
