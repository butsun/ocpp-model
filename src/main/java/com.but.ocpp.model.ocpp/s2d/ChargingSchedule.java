package com.but.ocpp.model.ocpp.s2d;

import cn.hutool.core.date.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author jun.sun
 * @ClassName ChargingSchedule
 * @Description TODO
 * @Date 2023/11/17 10:40
 * @Version 1.0
 */
public class ChargingSchedule {


    protected Integer duration;

    protected DateTime startSchedule;

    protected ChargingRateUnitType chargingRateUnit;
    protected List<ChargingSchedulePeriod> chargingSchedulePeriod;
    protected BigDecimal minChargingRate;


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }


    public DateTime getStartSchedule() {
        return startSchedule;
    }


    public void setStartSchedule(DateTime value) {
        this.startSchedule = value;
    }

    public boolean isSetStartSchedule() {
        return (this.startSchedule!= null);
    }


    public ChargingRateUnitType getChargingRateUnit() {
        return chargingRateUnit;
    }


    public void setChargingRateUnit(ChargingRateUnitType value) {
        this.chargingRateUnit = value;
    }

    public boolean isSetChargingRateUnit() {
        return (this.chargingRateUnit!= null);
    }


    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        if (chargingSchedulePeriod == null) {
            chargingSchedulePeriod = new ArrayList<ChargingSchedulePeriod>();
        }
        return this.chargingSchedulePeriod;
    }

    public boolean isSetChargingSchedulePeriod() {
        return ((this.chargingSchedulePeriod!= null)&&(!this.chargingSchedulePeriod.isEmpty()));
    }

    public void unsetChargingSchedulePeriod() {
        this.chargingSchedulePeriod = null;
    }


    public BigDecimal getMinChargingRate() {
        return minChargingRate;
    }


    public void setMinChargingRate(BigDecimal value) {
        this.minChargingRate = value;
    }

    public boolean isSetMinChargingRate() {
        return (this.minChargingRate!= null);
    }

    public ChargingSchedule withDuration(Integer value) {
        setDuration(value);
        return this;
    }

    public ChargingSchedule withStartSchedule(DateTime value) {
        setStartSchedule(value);
        return this;
    }

    public ChargingSchedule withChargingRateUnit(ChargingRateUnitType value) {
        setChargingRateUnit(value);
        return this;
    }

    public ChargingSchedule withChargingSchedulePeriod(ChargingSchedulePeriod... values) {
        if (values!= null) {
            for (ChargingSchedulePeriod value: values) {
                getChargingSchedulePeriod().add(value);
            }
        }
        return this;
    }

    public ChargingSchedule withChargingSchedulePeriod(Collection<ChargingSchedulePeriod> values) {
        if (values!= null) {
            getChargingSchedulePeriod().addAll(values);
        }
        return this;
    }

    public ChargingSchedule withMinChargingRate(BigDecimal value) {
        setMinChargingRate(value);
        return this;
    }

}
