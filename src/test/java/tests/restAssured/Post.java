package tests.restAssured;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Post {
    @Test
    public void petPostTest() {
        String requestBody = "\"id\": 111,\n" +
                "    \"category\": {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"grmng\"\n" +
                "    },\n" +
                "    \"name\": \"grmng\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"grmng\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"grmng\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"";
        Response response1 =
                        given()
                        .log().all()
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                        .when()
                        .post("https://petstore.swagger.io/v2/pet")
                        .then()
                        .log().all()
                        .extract().response();
        response1.getBody().print();

    }
}
