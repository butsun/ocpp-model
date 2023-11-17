package com.but.ocpp.model.ocpp.s2d;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 * @Author jun.sun
 * @ClassName ChargingSchedulePeriod
 * @Description TODO
 * @Date 2023/11/17 10:42
 * @Version 1.0
 */
public class ChargingSchedulePeriod {
    protected int startPeriod;
    protected BigDecimal limit;
    protected Integer numberPhases;


    public int getStartPeriod() {
        return startPeriod;
    }


    public void setStartPeriod(int value) {
        this.startPeriod = value;
    }

    public boolean isSetStartPeriod() {
        return true;
    }


    public BigDecimal getLimit() {
        return limit;
    }


    public void setLimit(BigDecimal value) {
        this.limit = value;
    }

    public boolean isSetLimit() {
        return (this.limit!= null);
    }


    public Integer getNumberPhases() {
        return numberPhases;
    }


    public void setNumberPhases(Integer value) {
        this.numberPhases = value;
    }

    public boolean isSetNumberPhases() {
        return (this.numberPhases!= null);
    }

    public ChargingSchedulePeriod withStartPeriod(int value) {
        setStartPeriod(value);
        return this;
    }

    public ChargingSchedulePeriod withLimit(BigDecimal value) {
        setLimit(value);
        return this;
    }

    public ChargingSchedulePeriod withNumberPhases(Integer value) {
        setNumberPhases(value);
        return this;
    }

}
