package apiShortsTest.RequestTypes;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PatchRequestWithRestAssured {
    @BeforeClass
    public void setup() {
        baseURI = "http://35.174.13.153:8000";
    }



    @Test
    public void PUTRequest(){
        Map<String, Object> patchMap = new HashMap<>();
        patchMap.put("name", "kumPATCH2");

        // Response response =
        //We gonna send request body with update value, and content type header
        given().contentType(ContentType.JSON)
                //.and().contentType(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .and().pathParam("id", 107)
                .body(patchMap)
                .when().patch("/api/spartans/{id}")
                .then().assertThat().statusCode(204);
    }
}
