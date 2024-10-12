package utlis;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils {
    public static Response performPost(String baseUri, String requestBody, Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(baseUri)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post()
                .then().log().all().extract().response();

    }
}
