package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;
import com.but.ocpp.model.ocpp.ResponseType;

/**
 * @Author jun.sun
 * @ClassName BootNotificationResponse
 * @Description TODO
 * @Date 2023/11/17 09:53
 * @Version 1.0
 */
public class BootNotificationResponse implements ResponseType {

    protected RegistrationStatus status;
    protected DateTime currentTime;
    protected int interval;


    public RegistrationStatus getStatus() {
        return status;
    }


    public void setStatus(RegistrationStatus value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }


    public DateTime getCurrentTime() {
        return currentTime;
    }


    public void setCurrentTime(DateTime value) {
        this.currentTime = value;
    }

    public boolean isSetCurrentTime() {
        return (this.currentTime!= null);
    }

    /**
     * Gets the value of the interval property.
     *
     */
    public int getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     *
     */
    public void setInterval(int value) {
        this.interval = value;
    }

    public boolean isSetInterval() {
        return true;
    }

    public BootNotificationResponse withStatus(RegistrationStatus value) {
        setStatus(value);
        return this;
    }

    public BootNotificationResponse withCurrentTime(DateTime value) {
        setCurrentTime(value);
        return this;
    }

    public BootNotificationResponse withInterval(int value) {
        setInterval(value);
        return this;
    }

}
