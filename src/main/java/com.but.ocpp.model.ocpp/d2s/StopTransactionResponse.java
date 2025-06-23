package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.ResponseType;

/**
 * @Author jun.sun
 * @ClassName StopTransactionResponse
 * @Description TODO
 * @Date 2023/11/17 10:24
 * @Version 1.0
 */
public class StopTransactionResponse implements ResponseType {

    protected IdTagInfo idTagInfo;

    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }


    public void setIdTagInfo(IdTagInfo value) {
        this.idTagInfo = value;
    }

    public boolean hasSetIdTagInfo() {
        return (this.idTagInfo!= null);
    }

    public StopTransactionResponse withIdTagInfo(IdTagInfo value) {
        setIdTagInfo(value);
        return this;
    }

}
