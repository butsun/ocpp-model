package com.but.ocpp.model.ocpp.s2d;

import com.but.ocpp.model.ocpp.ResponseType;

/**
 * @Author jun.sun
 * @ClassName RemoteStartTransactionResponse
 * @Description TODO
 * @Date 2023/11/17 10:43
 * @Version 1.0
 */
public class RemoteStartTransactionResponse implements ResponseType {

    protected RemoteStartStopStatus status;


    public RemoteStartStopStatus getStatus() {
        return status;
    }


    public void setStatus(RemoteStartStopStatus value) {
        this.status = value;
    }

    public boolean hasSetStatus() {
        return (this.status!= null);
    }

    public RemoteStartTransactionResponse withStatus(RemoteStartStopStatus value) {
        setStatus(value);
        return this;
    }

}
