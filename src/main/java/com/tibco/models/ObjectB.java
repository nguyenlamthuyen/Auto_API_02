package com.tibco.models;

import lombok.Data;

@Data
public class ObjectB implements INestedObject{
    private String machine;
    private long created_time;

    public ObjectB() {
        this.machine = "lucas";
        this.created_time = 1231432435L;
    }
}
