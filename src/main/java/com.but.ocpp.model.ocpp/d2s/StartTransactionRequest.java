package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;
import com.but.ocpp.model.ocpp.RequestType;

/**
 * @Author jun.sun
 * @ClassName StartTransactionRequest
 * @Description TODO
 * @Date 2023/11/17 10:11
 * @Version 1.0
 */
public class StartTransactionRequest implements RequestType {

    protected int connectorId;
    protected String idTag;

    protected DateTime timestamp;
    protected int meterStart;
    protected Integer reservationId;


    public int getConnectorId() {
        return connectorId;
    }


    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    public boolean hasSetConnectorId() {
        return true;
    }


    public String getIdTag() {
        return idTag;
    }


    public void setIdTag(String value) {
        this.idTag = value;
    }

    public boolean hasSetIdTag() {
        return (this.idTag!= null);
    }


    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime value) {
        this.timestamp = value;
    }

    public boolean hasSetTimestamp() {
        return (this.timestamp!= null);
    }


    public int getMeterStart() {
        return meterStart;
    }


    public void setMeterStart(int value) {
        this.meterStart = value;
    }

    public boolean hasSetMeterStart() {
        return true;
    }


    public Integer getReservationId() {
        return reservationId;
    }


    public void setReservationId(Integer value) {
        this.reservationId = value;
    }

    public boolean hasSetReservationId() {
        return (this.reservationId!= null);
    }

    public StartTransactionRequest withConnectorId(int value) {
        setConnectorId(value);
        return this;
    }

    public StartTransactionRequest withIdTag(String value) {
        setIdTag(value);
        return this;
    }

    public StartTransactionRequest withTimestamp(DateTime value) {
        setTimestamp(value);
        return this;
    }

    public StartTransactionRequest withMeterStart(int value) {
        setMeterStart(value);
        return this;
    }

    public StartTransactionRequest withReservationId(Integer value) {
        setReservationId(value);
        return this;
    }

}
