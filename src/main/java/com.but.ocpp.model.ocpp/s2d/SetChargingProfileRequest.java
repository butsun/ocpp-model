package com.but.ocpp.model.ocpp.s2d;

import com.but.ocpp.model.ocpp.RequestType;

public class SetChargingProfileRequest
    implements RequestType
{

    protected int connectorId;
    protected ChargingProfile csChargingProfiles;

    /**
     * Gets the value of the connectorId property.
     * 
     */
    public int getConnectorId() {
        return connectorId;
    }

    /**
     * Sets the value of the connectorId property.
     * 
     */
    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    public boolean hasSetConnectorId() {
        return true;
    }

    /**
     * Gets the value of the csChargingProfiles property.
     * 
     * @return
     *     possible object has
     *     {@link ChargingProfile }
     *     
     */
    public ChargingProfile getCsChargingProfiles() {
        return csChargingProfiles;
    }

    /**
     * Sets the value of the csChargingProfiles property.
     * 
     * @param value
     *     allowed object has
     *     {@link ChargingProfile }
     *     
     */
    public void setCsChargingProfiles(ChargingProfile value) {
        this.csChargingProfiles = value;
    }

    public boolean hasSetCsChargingProfiles() {
        return (this.csChargingProfiles!= null);
    }

    public SetChargingProfileRequest withConnectorId(int value) {
        setConnectorId(value);
        return this;
    }

    public SetChargingProfileRequest withCsChargingProfiles(ChargingProfile value) {
        setCsChargingProfiles(value);
        return this;
    }

}