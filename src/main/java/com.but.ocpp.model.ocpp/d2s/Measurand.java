package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName Measurand
 * @Description TODO
 * @Date 2023/11/17 09:58
 * @Version 1.0
 */
public enum Measurand {

    CURRENT_EXPORT("Current.Export"),
    CURRENT_IMPORT("Current.Import"),
    CURRENT_OFFERED("Current.Offered"),
    ENERGY_ACTIVE_EXPORT_REGISTER("Energy.Active.Export.Register"),
    ENERGY_ACTIVE_IMPORT_REGISTER("Energy.Active.Import.Register"),
    ENERGY_REACTIVE_EXPORT_REGISTER("Energy.Reactive.Export.Register"),
    ENERGY_REACTIVE_IMPORT_REGISTER("Energy.Reactive.Import.Register"),
    ENERGY_ACTIVE_EXPORT_INTERVAL("Energy.Active.Export.Interval"),
    ENERGY_ACTIVE_IMPORT_INTERVAL("Energy.Active.Import.Interval"),
    ENERGY_REACTIVE_EXPORT_INTERVAL("Energy.Reactive.Export.Interval"),
    ENERGY_REACTIVE_IMPORT_INTERVAL("Energy.Reactive.Import.Interval"),
    FREQUENCY("Frequency"),
    POWER_ACTIVE_EXPORT("Power.Active.Export"),
    POWER_ACTIVE_IMPORT("Power.Active.Import"),
    POWER_FACTOR("Power.Factor"),
    POWER_OFFERED("Power.Offered"),
    POWER_REACTIVE_EXPORT("Power.Reactive.Export"),
    POWER_REACTIVE_IMPORT("Power.Reactive.Import"),
    RPM("RPM"),
    SO_C("SoC"),
    TEMPERATURE("Temperature"),
    VOLTAGE("Voltage");
    private final String value;

    Measurand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Measurand fromValue(String v) {
        for (Measurand c: Measurand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
