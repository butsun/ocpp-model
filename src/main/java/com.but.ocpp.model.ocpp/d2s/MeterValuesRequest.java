package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.RequestType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author jun.sun
 * @ClassName MeterValuesRequest
 * @Description TODO
 * @Date 2023/11/17 09:56
 * @Version 1.0
 */
public class MeterValuesRequest implements RequestType {

    protected int connectorId;
    protected Integer transactionId;
    protected List<MeterValue> meterValue;


    public int getConnectorId() {
        return connectorId;
    }


    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    public boolean hasSetConnectorId() {
        return true;
    }


    public Integer getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(Integer value) {
        this.transactionId = value;
    }

    public boolean hasSetTransactionId() {
        return (this.transactionId!= null);
    }


    public List<MeterValue> getMeterValue() {
        if (meterValue == null) {
            meterValue = new ArrayList<MeterValue>();
        }
        return this.meterValue;
    }

    public boolean hasSetMeterValue() {
        return ((this.meterValue!= null)&&(!this.meterValue.isEmpty()));
    }

    public void unsetMeterValue() {
        this.meterValue = null;
    }

    public MeterValuesRequest withConnectorId(int value) {
        setConnectorId(value);
        return this;
    }

    public MeterValuesRequest withTransactionId(Integer value) {
        setTransactionId(value);
        return this;
    }

    public MeterValuesRequest withMeterValue(MeterValue... values) {
        if (values!= null) {
            for (MeterValue value: values) {
                getMeterValue().add(value);
            }
        }
        return this;
    }

    public MeterValuesRequest withMeterValue(Collection<MeterValue> values) {
        if (values!= null) {
            getMeterValue().addAll(values);
        }
        return this;
    }

}
