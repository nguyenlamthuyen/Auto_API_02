package com.tibco.features;

import com.tibco.models.Student;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Chapter1 {

    @Test
    void test_1() {
        //       RestAssured.get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
        given().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .print();
    }

    @Test
    void test_2() {
        RestAssured.get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .prettyPrint();
    }

    @Test
    void test_3() {
        RestAssured.get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .prettyPeek();
    }

    @Test
    void test_4() {
        given().log().all()
                .queryParam("fool1", "bar1")
                .queryParam("fool2", "bar2")
                .get("https://postman-echo.com/get")
                .prettyPrint();
    }

    @Test
    void test_5() {
        Map<String, Object> map = new HashMap<>();
        map.put("fool1", "bar1");
        map.put("fool2", "bar2");

        given().log().all()
                .queryParams(map)
                .get("https://postman-echo.com/get")
                .prettyPrint();
    }

    @Test
    void test_6() {
        given().log().all()
                .get("https://postman-echo.com/get/{id}/{number}", 321, 999);
    }

    @Test
    void test_7() {
        Map<String, Object> map = new HashMap<>();
        map.put("fool1", "bar1");
        map.put("fool2", "bar2");

        given().log().all()
                .queryParams(map)
                .get("https://postman-echo.com/get/{fool1}/{fool2}", map);
    }

    @Test
    void test_8() {
        String name = "lucas";
        int age = 29;
        String url = String.format("http://abc.com/%s/%d", name, age);
        System.out.println("url = " + url);
    }

    @Test
    void test_9() {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("lucas");
        student.setLastName("Doe");
        student.setCourses(Arrays.asList("Accounting", "Statistics"));
        given().log().all()
                .contentType(ContentType.JSON)
                .body(student)
                .post("https://postman-echo.com/post/");
    }
}