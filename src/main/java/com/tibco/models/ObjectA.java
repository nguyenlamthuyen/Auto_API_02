package com.tibco.models;

import lombok.Data;

@Data
public class ObjectA implements INestedObject{
    private String name;
    private int age;
    private boolean is_admin;

    public ObjectA() {
        this.name = "lucas";
        this.age = 20;
        this.is_admin = true;
    }
}
