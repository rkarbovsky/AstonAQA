import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PostmanEchoTest {
    public static void main(String[] args) {

    }

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void getRequest() {
        Response response = given()
                .when()
                .get("/get?foo1=bar1&foo2=bar2");
        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getString("args.foo1"), "bar1");
        assertEquals(response.jsonPath().getString("args.foo2"), "bar2");
    }

    @Test
    public void postRawText() {
        Response response = given()
                .contentType(ContentType.TEXT).body("\"test\":\"value\"")
                .post("/post");
        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getString("data"), "\"test\":\"value\"");

    }

    @Test
    public void postFormData() {

        Response response = given()
                .contentType(ContentType.JSON).body("{\"foo1\":\"bar1\", \"foo2\":\"bar2\"}")
                .when().log().all()
                .post("/post");
        assertEquals(response.statusCode(), 200);
        System.out.println(response.getBody().asString());
        assertEquals(response.jsonPath().getString("data.foo1"), "bar1");
        assertEquals(response.jsonPath().getString("data.foo2"), "bar2");
    }

    @Test
    public void putRequest() {

        Response response = given()

                .when().log().all()
                .contentType(ContentType.TEXT).body("This is expected to be sent back as part of response body.")
                .put("/put");
        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getString("data"), "This is expected to be sent back as part of response body.");
    }

    @Test
    public void patchRequest() {

        Response response = given()

                .when().log().all()
                .contentType(ContentType.TEXT).body("This is expected to be sent back as part of response body.")
                .patch("/patch");
        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getString("data"), "This is expected to be sent back as part of response body.");
    }

    @Test
    public void deleteRequest() {

        Response response = given()

                .when().log().all()
                .contentType(ContentType.TEXT).body("This is expected to be sent back as part of response body.")
                .delete("/delete");
        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getString("data"), "This is expected to be sent back as part of response body.");
    }
}
