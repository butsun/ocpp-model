package com.but.ocpp.model.ocpp.d2s;

import cn.hutool.core.date.DateTime;
import com.but.ocpp.model.ocpp.ResponseType;

/**
 * @Author jun.sun
 * @ClassName HeartbeatResponse
 * @Description TODO
 * @Date 2023/11/17 09:55
 * @Version 1.0
 */
public class HeartbeatResponse implements ResponseType {

    protected DateTime currentTime;

    public DateTime getCurrentTime() {
        return currentTime;
    }


    public void setCurrentTime(DateTime value) {
        this.currentTime = value;
    }

    public boolean hasSetCurrentTime() {
        return (this.currentTime!= null);
    }

    public HeartbeatResponse withCurrentTime(DateTime value) {
        setCurrentTime(value);
        return this;
    }
}
