package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.ResponseType;

import javax.xml.bind.annotation.XmlElement;

/**
 * @Author jun.sun
 * @ClassName StartTransactionResponse
 * @Description TODO
 * @Date 2023/11/17 10:12
 * @Version 1.0
 */
public class StartTransactionResponse implements ResponseType {

    protected int transactionId;
    protected IdTagInfo idTagInfo;

    public int getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return true;
    }


    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }


    public void setIdTagInfo(IdTagInfo value) {
        this.idTagInfo = value;
    }

    public boolean isSetIdTagInfo() {
        return (this.idTagInfo!= null);
    }

    public StartTransactionResponse withTransactionId(int value) {
        setTransactionId(value);
        return this;
    }

    public StartTransactionResponse withIdTagInfo(IdTagInfo value) {
        setIdTagInfo(value);
        return this;
    }

}
