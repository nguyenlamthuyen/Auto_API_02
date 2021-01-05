package com.tibco.models;

import lombok.Data;

@Data
public class QueryLogicObject {
    private DataObject2 data;

    public QueryLogicObject(DataObject2 data) {
        this.data = data;
    }
}
