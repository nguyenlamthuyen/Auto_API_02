package com.tibco.features;

import com.tibco.models.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Chapter2 {

    @Test
    void object_in_object() {
        EmployeeObject employee = new EmployeeObject();
        employee.setAccount(new AccountObject());
        employee.setColors(Arrays.asList("red", "orange"));
        employee.setStar(4.5);

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(employee)
                .post("https://postman-echo.com/post")
                .prettyPrint();
    }

    @Test
    void object_in_object_using_map() {
        Map<String, Object> account = new HashMap<>();
        account.put("name", "lucas");
        account.put("age", 20);
        account.put("is_admin", true);

        EmployeeObject2 employee = new EmployeeObject2();
        employee.setAccount(account);
        employee.setColors(Arrays.asList("red", "orange"));
        employee.setStar(4.5);

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(employee)
                .post("https://postman-echo.com/post")
                .prettyPrint();
    }

    @Test
    void nested_object_changed_using_map() {
        Map<String, Object> account = new HashMap<>();
        account.put("name", "lucas");
        account.put("age", 20);
        account.put("is_admin", true);

        NestedObject nestedObject = new NestedObject();
        nestedObject.setData(account);
        nestedObject.setString("Hi");

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(nestedObject)
                .post("https://postman-echo.com/post");
    }

    @Test
    void nested_object_changed_using_map_2() {
        Map<String, Object> account = new HashMap<>();
        account.put("machine", "lucas");
        account.put("created_time", 12423423453453L);

        NestedObject nestedObject = new NestedObject();
        nestedObject.setData(account);
        nestedObject.setString("Hi");

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(nestedObject)
                .post("https://postman-echo.com/post");
    }

    @Test
    void nested_object_changed_using_object() {
        NestedObject2 nestedObject = new NestedObject2();
        nestedObject.setData(new ObjectB());
        nestedObject.setString("Hi");

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(nestedObject)
                .post("https://postman-echo.com/post");
    }

    @Test
    void nested_object_changed_using_object_2() {
        NestedObject3 nestedObject = new NestedObject3();
        nestedObject.setData(new ObjectC());
        nestedObject.setString("Hi");

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(nestedObject)
                .post("https://postman-echo.com/post");
    }

    @Test
    void optional_object() {
        Map<String, Object> data = new HashMap<>();
        data.put("machine", "honda");
        data.put("created_time", 2020);

        OptionalObject optionalObject = new OptionalObject();
        optionalObject.setData(data);
//        optionalObject.set_Admin(true);

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(optionalObject)
                .post("https://postman-echo.com/post");
    }

    @Test
    void empty_object() {

        EmptyObject emptyObject = new EmptyObject();
        emptyObject.setData(new DataObject());
        emptyObject.setString("hi");

        given().log().all()
                .contentType(ContentType.JSON)
                .header("access-token", "fgdfgd.tyhttyt.jytjtjt")
                .body(emptyObject)
                .post("https://postman-echo.com/post");
    }
}