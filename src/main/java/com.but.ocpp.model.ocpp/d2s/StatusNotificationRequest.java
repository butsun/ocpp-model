package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;
import com.but.ocpp.model.ocpp.RequestType;

/**
 * @Author jun.sun
 * @ClassName StatusNotificationRequest
 * @Description TODO
 * @Date 2023/11/17 10:12
 * @Version 1.0
 */
public class StatusNotificationRequest implements RequestType {

    protected int connectorId;

    protected ChargePointStatus status;

    protected ChargePointErrorCode errorCode;
    protected String info;

    protected DateTime timestamp;
    protected String vendorId;
    protected String vendorErrorCode;

    public int getConnectorId() {
        return connectorId;
    }


    public void setConnectorId(int value) {
        this.connectorId = value;
    }

    public boolean hasSetConnectorId() {
        return true;
    }

    public ChargePointStatus getStatus() {
        return status;
    }


    public void setStatus(ChargePointStatus value) {
        this.status = value;
    }

    public boolean hasSetStatus() {
        return (this.status!= null);
    }

    public ChargePointErrorCode getErrorCode() {
        return errorCode;
    }


    public void setErrorCode(ChargePointErrorCode value) {
        this.errorCode = value;
    }

    public boolean hasSetErrorCode() {
        return (this.errorCode!= null);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String value) {
        this.info = value;
    }

    public boolean hasSetInfo() {
        return (this.info!= null);
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime value) {
        this.timestamp = value;
    }

    public boolean hasSetTimestamp() {
        return (this.timestamp!= null);
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String value) {
        this.vendorId = value;
    }

    public boolean hasSetVendorId() {
        return (this.vendorId!= null);
    }

    public String getVendorErrorCode() {
        return vendorErrorCode;
    }

    public void setVendorErrorCode(String value) {
        this.vendorErrorCode = value;
    }

    public boolean hasSetVendorErrorCode() {
        return (this.vendorErrorCode!= null);
    }

    public StatusNotificationRequest withConnectorId(int value) {
        setConnectorId(value);
        return this;
    }

    public StatusNotificationRequest withStatus(ChargePointStatus value) {
        setStatus(value);
        return this;
    }

    public StatusNotificationRequest withErrorCode(ChargePointErrorCode value) {
        setErrorCode(value);
        return this;
    }

    public StatusNotificationRequest withInfo(String value) {
        setInfo(value);
        return this;
    }

    public StatusNotificationRequest withTimestamp(DateTime value) {
        setTimestamp(value);
        return this;
    }

    public StatusNotificationRequest withVendorId(String value) {
        setVendorId(value);
        return this;
    }

    public StatusNotificationRequest withVendorErrorCode(String value) {
        setVendorErrorCode(value);
        return this;
    }

}
