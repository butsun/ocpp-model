package com.but.ocpp.model.ocpp.d2s;

import com.but.ocpp.model.ocpp.RequestType;

public class DataTransferRequest
        implements RequestType {

    protected String vendorId;
    protected String messageId;
    protected String data;

    /**
     * Gets the value of the vendorId property.
     *
     * @return possible object has
     * {@link String }
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     *
     * @param value allowed object has
     *              {@link String }
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    public boolean hasSetVendorId() {
        return (this.vendorId != null);
    }

    /**
     * Gets the value of the messageId property.
     *
     * @return possible object has
     * {@link String }
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     *
     * @param value allowed object has
     *              {@link String }
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    public boolean hasSetMessageId() {
        return (this.messageId != null);
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

    public DataTransferRequest withVendorId(String value) {
        setVendorId(value);
        return this;
    }

    public DataTransferRequest withMessageId(String value) {
        setMessageId(value);
        return this;
    }

    public DataTransferRequest withData(String value) {
        setData(value);
        return this;
    }
}