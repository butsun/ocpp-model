package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.ResponseType;

public class DataTransferResponse
        implements ResponseType {


    protected DataTransferStatus status;
    protected String data;

    /**
     * Gets the value of the status property.
     *
     * @return possible object has
     * {@link DataTransferStatus }
     */
    public DataTransferStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object has
     *              {@link DataTransferStatus }
     */
    public void setStatus(DataTransferStatus value) {
        this.status = value;
    }

    public boolean hasSetStatus() {
        return (this.status != null);
    }

    /**
     * Gets the value of the data property.
     *
     * @return possible object has
     * {@link String }
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value allowed object has
     *              {@link String }
     */
    public void setData(String value) {
        this.data = value;
    }

    public boolean hasSetData() {
        return (this.data != null);
    }

    public DataTransferResponse withStatus(DataTransferStatus value) {
        setStatus(value);
        return this;
    }

    public DataTransferResponse withData(String value) {
        setData(value);
        return this;
    }

}