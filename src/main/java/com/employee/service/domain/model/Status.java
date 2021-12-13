package com.employee.service.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Status {

    ADDED("ADDED"), IN_CHECK("IN-CHECK"), APPROVED("APPROVED"), ACTIVE("ACTIVE");

    private Status(String value) {
        this.value = value;
    }

    private final String value;

    @JsonCreator
    public static Status fromValue(String text) {
        for (Status b : Status.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}
