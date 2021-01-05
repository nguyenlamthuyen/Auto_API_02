package com.tibco.features;

import com.tibco.models.*;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Chapter3 {

    @Test
    void logic_in_logic() {
        DataObject2 dataObject2 = DataObject2.defaultAdmin();
        QueryLogicObject queryLogicObject = new QueryLogicObject(dataObject2);
        QueryObject queryObject = new QueryObject(queryLogicObject);

        TargetObject targetObject = new TargetObject(queryObject);

        given().log().all()
                .contentType(ContentType.JSON)
                .body(targetObject)
                .post("https://postman-echo.com/post");
    }
}