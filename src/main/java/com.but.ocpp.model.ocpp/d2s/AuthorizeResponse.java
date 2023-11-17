package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.ResponseType;

/**
 * @Author jun.sun
 * @ClassName AuthorizeResponse
 * @Description TODO
 * @Date 2023/11/17 09:45
 * @Version 1.0
 */
public class AuthorizeResponse implements ResponseType {

    protected IdTagInfo idTagInfo;


    public IdTagInfo getIdTagInfo() {
        return idTagInfo;
    }


    public void setIdTagInfo(IdTagInfo value) {
        this.idTagInfo = value;
    }

    public boolean isSetIdTagInfo() {
        return (this.idTagInfo!= null);
    }

    public AuthorizeResponse withIdTagInfo(IdTagInfo value) {
        setIdTagInfo(value);
        return this;
    }
}
