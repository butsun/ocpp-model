package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;

/**
 * @Author jun.sun
 * @ClassName IdTagInfo
 * @Description TODO
 * @Date 2023/11/17 09:45
 * @Version 1.0
 */
public class IdTagInfo {

    protected AuthorizationStatus status;
    protected DateTime expiryDate;
    protected String parentIdTag;

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link AuthorizationStatus }
     *
     */
    public AuthorizationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link AuthorizationStatus }
     *
     */
    public void setStatus(AuthorizationStatus value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the expiryDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public DateTime getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpiryDate(DateTime value) {
        this.expiryDate = value;
    }

    public boolean isSetExpiryDate() {
        return (this.expiryDate!= null);
    }

    /**
     * Gets the value of the parentIdTag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentIdTag() {
        return parentIdTag;
    }

    /**
     * Sets the value of the parentIdTag property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentIdTag(String value) {
        this.parentIdTag = value;
    }

    public boolean isSetParentIdTag() {
        return (this.parentIdTag!= null);
    }

    public IdTagInfo withStatus(AuthorizationStatus value) {
        setStatus(value);
        return this;
    }

    public IdTagInfo withExpiryDate(DateTime value) {
        setExpiryDate(value);
        return this;
    }

    public IdTagInfo withParentIdTag(String value) {
        setParentIdTag(value);
        return this;
    }

}
