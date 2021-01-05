package com.tibco.models;

import lombok.Data;

@Data
public class ObjectC implements INestedObject{
    private String name;
    private long data;
    private String country;

    public ObjectC() {
        this.name = "type A";
        this.data = 12313131444L;
        this.country = "Vietnam";
    }
}
