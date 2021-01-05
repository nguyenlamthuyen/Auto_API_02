package com.tibco.models;

import lombok.Data;

@Data
public class TargetObject {
    private QueryObject query;
    private String string;

    public TargetObject(QueryObject queryObject) {
        this.query = queryObject;
        this.string = "HI";
    }
}
