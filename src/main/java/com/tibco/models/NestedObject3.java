package com.tibco.models;

import lombok.Data;

@Data
public class NestedObject3 {
    private INestedObject data;
    private String string;

    public INestedObject getData() {
        return data;
    }
}
