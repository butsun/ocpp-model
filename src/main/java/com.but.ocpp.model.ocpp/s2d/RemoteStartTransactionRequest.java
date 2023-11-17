package com.but.ocpp.model.ocpp.s2d;

import com.but.ocpp.model.ocpp.RequestType;


/**
 * @Author jun.sun
 * @ClassName RemoteStartTransactionRequest
 * @Description TODO
 * @Date 2023/11/17 10:37
 * @Version 1.0
 */
public class RemoteStartTransactionRequest implements RequestType {

    protected Integer connectorId;
    protected String idTag;
    protected ChargingProfile chargingProfile;

    public Integer getConnectorId() {
        return connectorId;
    }


    public void setConnectorId(Integer value) {
        this.connectorId = value;
    }

    public boolean isSetConnectorId() {
        return (this.connectorId!= null);
    }


    public String getIdTag() {
        return idTag;
    }


    public void setIdTag(String value) {
        this.idTag = value;
    }

    public boolean isSetIdTag() {
        return (this.idTag!= null);
    }


    public ChargingProfile getChargingProfile() {
        return chargingProfile;
    }


    public void setChargingProfile(ChargingProfile value) {
        this.chargingProfile = value;
    }

    public boolean isSetChargingProfile() {
        return (this.chargingProfile!= null);
    }

    public RemoteStartTransactionRequest withConnectorId(Integer value) {
        setConnectorId(value);
        return this;
    }

    public RemoteStartTransactionRequest withIdTag(String value) {
        setIdTag(value);
        return this;
    }

    public RemoteStartTransactionRequest withChargingProfile(ChargingProfile value) {
        setChargingProfile(value);
        return this;
    }

}
