package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author jun.sun
 * @ClassName MeterValue
 * @Description TODO
 * @Date 2023/11/17 09:56
 * @Version 1.0
 */
public class MeterValue {

    protected DateTime timestamp;
    protected List<SampledValue> sampledValue;


    public DateTime getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(DateTime value) {
        this.timestamp = value;
    }

    public boolean isSetTimestamp() {
        return (this.timestamp!= null);
    }


    public List<SampledValue> getSampledValue() {
        if (sampledValue == null) {
            sampledValue = new ArrayList<SampledValue>();
        }
        return this.sampledValue;
    }

    public boolean isSetSampledValue() {
        return ((this.sampledValue!= null)&&(!this.sampledValue.isEmpty()));
    }

    public void unsetSampledValue() {
        this.sampledValue = null;
    }

    public MeterValue withTimestamp(DateTime value) {
        setTimestamp(value);
        return this;
    }

    public MeterValue withSampledValue(SampledValue... values) {
        if (values!= null) {
            for (SampledValue value: values) {
                getSampledValue().add(value);
            }
        }
        return this;
    }

    public MeterValue withSampledValue(Collection<SampledValue> values) {
        if (values!= null) {
            getSampledValue().addAll(values);
        }
        return this;
    }

}
