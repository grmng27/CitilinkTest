package tests.restAssured;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class Get {
    @Test
    public void petGetTest() {
        Response response2 =
                given()
                        .log().all()
                        .when()
                        .get("https://petstore.swagger.io/v2/pet/111")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .body("name", is("grmng"))
                        .extract().response();
        response2.getBody().print();
    }
}
