package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @Author jun.sun
 * @ClassName ReadingContext
 * @Description TODO
 * @Date 2023/11/17 09:57
 * @Version 1.0
 */
public enum ReadingContext {

    INTERRUPTION_BEGIN("Interruption.Begin"),
    INTERRUPTION_END("Interruption.End"),
    OTHER("Other"),
    SAMPLE_CLOCK("Sample.Clock"),
    SAMPLE_PERIODIC("Sample.Periodic"),
    TRANSACTION_BEGIN("Transaction.Begin"),
    TRANSACTION_END("Transaction.End"),
    TRIGGER("Trigger");
    private final String value;

    ReadingContext(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadingContext fromValue(String v) {
        for (ReadingContext c: ReadingContext.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
