package com.lazarev.enums;

public enum Films {

    MONDAY("Scary movie 1"),
    TUESDAY("Scary movie 2"),
    FRIDAY("Scary movie 5");

    private final String weekDays;

    Films(String desc) {
        this.weekDays = desc;
    }

    public String getDay() {
        return weekDays;
    }
}
