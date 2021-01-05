package com.tibco.models;

import lombok.Data;

@Data
public class DataLogicObject {
    private String operation;

    private DataLogicObject(String operation){
        this.operation = "<";
    }

    public static DataLogicObject left(){
        return new DataLogicObject("<");
    }

    public static DataLogicObject right(){
        return new DataLogicObject("<");
    }
}
