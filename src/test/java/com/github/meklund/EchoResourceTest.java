package com.github.meklund;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EchoResourceTest {

    private static final String POST_ECHO_BODY = "Posting echo";
    private static final String GET_ECHO_RESPONSE = "echo";
    private static final String ECHO_ENDPOINT = "/echo";

    @Test
    public void testGetEchoEndpoint() {
        given()
          .when().get(ECHO_ENDPOINT)
          .then()
             .statusCode(200)
             .body(is(GET_ECHO_RESPONSE));
    }

    @Test
    public void testPostEndpoint() {
        given()
            .when().body(POST_ECHO_BODY).post(ECHO_ENDPOINT)
                .then()
                .statusCode(200)
                .body(is(POST_ECHO_BODY));
    }

}