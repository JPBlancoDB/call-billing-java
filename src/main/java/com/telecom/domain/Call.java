package com.telecom.domain;

public class Call {
    private int minutes;
    private TariffTypes tariffType;
    private CallTypes callType;

    public Call(int minutes, TariffTypes tariffType, CallTypes callType) {
        this.minutes = minutes;
        this.tariffType = tariffType;
        this.callType = callType;
    }

    public int getMinutes() {

        return minutes;
    }

    public TariffTypes getTariffType() {

        return tariffType;
    }

    public CallTypes getCallType() {

        return callType;
    }
}
