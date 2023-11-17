package com.but.ocpp.model.ocpp.d2s;

import javax.xml.bind.annotation.XmlSchemaType;

/**
 * @Author jun.sun
 * @ClassName SampledValue
 * @Description TODO
 * @Date 2023/11/17 09:57
 * @Version 1.0
 */
public class SampledValue {

    protected String value;
    protected ReadingContext context;
    protected ValueFormat format;
    protected Measurand measurand;
    protected Phase phase;
    protected Location location;
    protected UnitOfMeasure unit;

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }


    public ReadingContext getContext() {
        return context;
    }


    public void setContext(ReadingContext value) {
        this.context = value;
    }

    public boolean isSetContext() {
        return (this.context!= null);
    }


    public ValueFormat getFormat() {
        return format;
    }


    public void setFormat(ValueFormat value) {
        this.format = value;
    }

    public boolean isSetFormat() {
        return (this.format!= null);
    }


    public Measurand getMeasurand() {
        return measurand;
    }


    public void setMeasurand(Measurand value) {
        this.measurand = value;
    }

    public boolean isSetMeasurand() {
        return (this.measurand!= null);
    }


    public Phase getPhase() {
        return phase;
    }


    public void setPhase(Phase value) {
        this.phase = value;
    }

    public boolean isSetPhase() {
        return (this.phase!= null);
    }


    public Location getLocation() {
        return location;
    }


    public void setLocation(Location value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }


    public UnitOfMeasure getUnit() {
        return unit;
    }


    public void setUnit(UnitOfMeasure value) {
        this.unit = value;
    }

    public boolean isSetUnit() {
        return (this.unit!= null);
    }

    public SampledValue withValue(String value) {
        setValue(value);
        return this;
    }

    public SampledValue withContext(ReadingContext value) {
        setContext(value);
        return this;
    }

    public SampledValue withFormat(ValueFormat value) {
        setFormat(value);
        return this;
    }

    public SampledValue withMeasurand(Measurand value) {
        setMeasurand(value);
        return this;
    }

    public SampledValue withPhase(Phase value) {
        setPhase(value);
        return this;
    }

    public SampledValue withLocation(Location value) {
        setLocation(value);
        return this;
    }

    public SampledValue withUnit(UnitOfMeasure value) {
        setUnit(value);
        return this;
    }

}
