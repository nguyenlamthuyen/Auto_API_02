package com.tibco.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryObject {
    @JsonProperty("logic")
    private QueryLogicObject logicObject;

    public QueryObject(QueryLogicObject logicObject) {
        this.logicObject = logicObject;
    }
}
