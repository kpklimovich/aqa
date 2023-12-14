package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class AppTest {

    @Test
    public void testGet() {
        RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .get("https://postman-echo.com/")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetWoop() {
        RestAssured
            .given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .log().all()
            .when()
                .contentType(ContentType.JSON)
                .get("https://postman-echo.com/")
            .then()
                .statusCode(200);
    }

    @Test
    public void testPostRawText() {
      RestAssured
            .given()
                .log().all()
            .when()
                .contentType(ContentType.JSON)
                .body("{\"test\": \"value\"}")
                .post("https://postman-echo.com/post")
            .then()
                .statusCode(200)
                .body("data", equalTo("{\"test\": \"value\"}"));
    }

    @Test
    public void testPostFormData() {
        RestAssured
            .given()
                .log().all()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
            .when()
                .contentType(ContentType.JSON)
                .post("https://postman-echo.com/post")
            .then()
                .statusCode(200);
    }

    @Test
    public void testPut() {
        RestAssured
            .given()
                .log().all()
            .when()
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .put("https://postman-echo.com/put")
            .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testPatch() {
        RestAssured
            .given()
                .log().all()
            .when()
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .patch("https://postman-echo.com/patch")
            .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testDelete() {
        RestAssured
            .given()
                .log().all()
            .when()
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .delete("https://postman-echo.com/delete")
            .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}
