package tests.restAssured;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Put {
    @Test
    public void petPutTest() {
        String requestBody = "\"id\": 111,\n" +
                "    \"category\": {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"GRMNG\"\n" +
                "    },\n" +
                "    \"name\": \"GRMNG\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"GRMNG\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"GRMNG\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"sold\"";
        Response response1 =
                        given()
                        .log().all()
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                        .when()
                        .put("https://petstore.swagger.io/v2/pet")
                        .then()
                        .log().all()
                        .extract().response();
        response1.getBody().print();

    }
}
