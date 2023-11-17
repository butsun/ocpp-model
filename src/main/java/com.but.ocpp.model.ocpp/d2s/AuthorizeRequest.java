package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.RequestType;

/**
 * @Author jun.sun
 * @ClassName AuthorizeRequest
 * @Description TODO
 * @Date 2023/11/17 09:44
 * @Version 1.0
 */
public class AuthorizeRequest implements RequestType {

    protected String idTag;

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String value) {
        this.idTag = value;
    }

    public boolean isSetIdTag() {
        return (this.idTag!= null);
    }

    public AuthorizeRequest withIdTag(String value) {
        setIdTag(value);
        return this;
    }
}
