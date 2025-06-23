package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;
import com.but.ocpp.model.ocpp.RequestType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author jun.sun
 * @ClassName StopTransactionRequest
 * @Description TODO
 * @Date 2023/11/17 10:22
 * @Version 1.0
 */
public class StopTransactionRequest implements RequestType {

    protected int transactionId;
    protected String idTag;

    protected DateTime timestamp;
    protected int meterStop;
    protected Reason reason;
    protected List<MeterValue> transactionData;


    public int getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    public boolean hasSetTransactionId() {
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


    public int getMeterStop() {
        return meterStop;
    }


    public void setMeterStop(int value) {
        this.meterStop = value;
    }

    public boolean hasSetMeterStop() {
        return true;
    }


    public Reason getReason() {
        return reason;
    }


    public void setReason(Reason value) {
        this.reason = value;
    }

    public boolean hasSetReason() {
        return (this.reason!= null);
    }

    public List<MeterValue> getTransactionData() {
        if (transactionData == null) {
            transactionData = new ArrayList<MeterValue>();
        }
        return this.transactionData;
    }

    public boolean hasSetTransactionData() {
        return ((this.transactionData!= null)&&(!this.transactionData.isEmpty()));
    }

    public void unsetTransactionData() {
        this.transactionData = null;
    }

    public StopTransactionRequest withTransactionId(int value) {
        setTransactionId(value);
        return this;
    }

    public StopTransactionRequest withIdTag(String value) {
        setIdTag(value);
        return this;
    }

    public StopTransactionRequest withTimestamp(DateTime value) {
        setTimestamp(value);
        return this;
    }

    public StopTransactionRequest withMeterStop(int value) {
        setMeterStop(value);
        return this;
    }

    public StopTransactionRequest withReason(Reason value) {
        setReason(value);
        return this;
    }

    public StopTransactionRequest withTransactionData(MeterValue... values) {
        if (values!= null) {
            for (MeterValue value: values) {
                getTransactionData().add(value);
            }
        }
        return this;
    }

    public StopTransactionRequest withTransactionData(Collection<MeterValue> values) {
        if (values!= null) {
            getTransactionData().addAll(values);
        }
        return this;
    }


}
