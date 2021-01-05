package com.tibco.models;

import lombok.Data;

import java.util.Map;

@Data
public class NestedObject {
    private Map<String, Object> data;
    private String string;
}
