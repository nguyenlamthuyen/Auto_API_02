package com.tibco.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Setter;

import java.util.Map;

@Data
public class OptionalObject {
    private Map<String, Object> data;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean is_Admin;

    public Map<String, Object> getData() {
        return data;
    }
}
