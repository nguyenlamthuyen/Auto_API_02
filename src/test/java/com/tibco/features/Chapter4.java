package com.tibco.features;

import com.tibco.models.DataObject2;
import com.tibco.models.QueryLogicObject;
import com.tibco.models.QueryObject;
import com.tibco.models.TargetObject;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class Chapter4 {

    @Test
    void test_1() {
        given().contentType(ContentType.JSON)
                .body(new File("src/test/resources/lotto.json"))
                .post("https://postman-echo.com/post")
                .prettyPeek()
                .then()
  //              .rootPath("json")
 //               .body("lotto.lottoId", equalTo(5));
                .body("json.lotto.winners[0].winnerId", equalTo(23));
    }

    @Test
    void test_2() {
        given().contentType(ContentType.JSON)
                .body(new File("src/test/resources/lotto.json"))
                .post("https://postman-echo.com/post")
                .prettyPeek()
                .then()
                .body("json.lotto.winning-numbers", hasItems(1, 45, 34));
    }

    @Test
    void test_3() {
        String author = given().contentType(ContentType.JSON)
                .body(new File("src/test/resources/books.json"))
                .post("https://postman-echo.com/post")
                .path("json.store.book[0].author");

        System.out.println("author = " + author);
    }

    @Test
    void test_4() {
        List<String> authors = given().contentType(ContentType.JSON)
                .body(new File("src/test/resources/books.json"))
                .post("https://postman-echo.com/post")
                .path("json.store.book.author");

//        for(String author : authors){
//            System.out.println("author = " + author);
//        }

        authors.forEach(System.out::println);
    }

    @Test
    void test_5() {
        String res = given().contentType(ContentType.JSON)
                .body(new File("src/test/resources/books.json"))
                .post("https://postman-echo.com/post")
                .asString();

        List<String> authors = JsonPath.from(res)
                .getList("json.store.book.findAll {it}.author");
        authors.forEach(System.out::println);
    }
}