package com.but.ocpp.model.ocpp.s2d;

import com.but.ocpp.model.ocpp.RequestType;

/**
 * @Author jun.sun
 * @ClassName RemoteStopTransactionRequest
 * @Description TODO
 * @Date 2023/11/17 10:44
 * @Version 1.0
 */
public class RemoteStopTransactionRequest implements RequestType {

    protected int transactionId;


    public int getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    public boolean hasSetTransactionId() {
        return true;
    }

    public RemoteStopTransactionRequest withTransactionId(int value) {
        setTransactionId(value);
        return this;
    }

}
