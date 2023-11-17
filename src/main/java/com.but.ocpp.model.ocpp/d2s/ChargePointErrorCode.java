package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName ChargePointErrorCode
 * @Description TODO
 * @Date 2023/11/17 10:20
 * @Version 1.0
 */
public enum ChargePointErrorCode {
    CONNECTOR_LOCK_FAILURE("ConnectorLockFailure"),
    EV_COMMUNICATION_ERROR("EVCommunicationError"),
    GROUND_FAILURE("GroundFailure"),
    HIGH_TEMPERATURE("HighTemperature"),
    INTERNAL_ERROR("InternalError"),
    LOCAL_LIST_CONFLICT("LocalListConflict"),
    NO_ERROR("NoError"),
    OTHER_ERROR("OtherError"),
    OVER_CURRENT_FAILURE("OverCurrentFailure"),
    OVER_VOLTAGE("OverVoltage"),
    POWER_METER_FAILURE("PowerMeterFailure"),
    POWER_SWITCH_FAILURE("PowerSwitchFailure"),
    READER_FAILURE("ReaderFailure"),
    RESET_FAILURE("ResetFailure"),
    UNDER_VOLTAGE("UnderVoltage"),
    WEAK_SIGNAL("WeakSignal");
    private final String value;

    ChargePointErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargePointErrorCode fromValue(String v) {
        for (ChargePointErrorCode c: ChargePointErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
