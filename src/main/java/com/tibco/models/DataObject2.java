package com.tibco.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataObject2 {
    private DataLogicObject logic;
    private String name;
    private int age;
    @JsonProperty("is_Admin")
    private boolean isAdmin;

    public DataObject2(DataLogicObject logic, String name, int age, boolean isAdmin) {
        this.logic = logic;
        this.name = name;
        this.age = age;
        this.isAdmin = isAdmin;
    }

    public  static DataObject2 defaultAdmin(){
        DataLogicObject logic = DataLogicObject.left();
        String name = "thuyen";
        int age = 29;
        boolean isAdmin = true;
        return new DataObject2(logic, name, age, isAdmin);
    }

    public  static DataObject2 defaultUser(){
        DataLogicObject logic = DataLogicObject.right();
        String name = "lucas";
        int age = 59;
        boolean isAdmin = false;
        return new DataObject2(logic, name, age, isAdmin);
    }
}
