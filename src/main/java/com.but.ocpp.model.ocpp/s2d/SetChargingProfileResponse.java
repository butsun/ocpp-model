package com.but.ocpp.model.ocpp.s2d;

import com.but.ocpp.model.ocpp.ResponseType;

public class SetChargingProfileResponse
    implements ResponseType
{

    protected ChargingProfileStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingProfileStatus }
     *     
     */
    public ChargingProfileStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingProfileStatus }
     *     
     */
    public void setStatus(ChargingProfileStatus value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    public SetChargingProfileResponse withStatus(ChargingProfileStatus value) {
        setStatus(value);
        return this;
    }

}