package com.tibco.models;

import lombok.Data;

@Data
public class AccountObject {
    private String name;
    private int age;
    private boolean is_admin;

    public AccountObject() {
        this.name = "lucas";
        this.age = 20;
        this.is_admin = true;
    }
}
