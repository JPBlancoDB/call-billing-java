package com.telecom.domain;

public class Call {
    private int minutes;
    private TariffTypes tariffType;

    public Call(int minutes, TariffTypes tariffType) {
        this.minutes = minutes;
        this.tariffType = tariffType;
    }

    public int getMinutes() {
        return minutes;
    }

    public TariffTypes getTariffType() {
        return tariffType;
    }
}
