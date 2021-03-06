package apiClient;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestGet implements  IRequest {
    @Override
    public Response send(String url) {

        Response response = given()
                .when()
                .get(url);
        return response;
    }
}
