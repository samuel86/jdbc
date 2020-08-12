package apiShortsTest.RequestTypes;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PutRequestWithRestassuredIntelliJ {
    @BeforeClass
    public void setup() {
        baseURI = "http://35.174.13.153:8000";
    }


    @Test
    public void PUTRequest() {
        //Different way to send json body
        //-string
        //-Using collection(Map)
        //-POJO
        //Using Map
        /**
         * {
         *     "id": 115,
         *     "name": "SamPut",
         *     "gender": "Male",
         *     "phone": 34727522100
         * }
         */
        Map<String, Object> putMap = new HashMap<>();
        putMap.put("name", "SamPut");
        putMap.put("gender", "Male");
        putMap.put("phone", 34727522100L);
       // Response response =
        //We gonna send request body with update value, and content type header
                given().contentType(ContentType.JSON)
                //.and().contentType(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .and().pathParam("id", 115)
                .body(putMap)
                .when().put("/api/spartans/{id}")
                .then().assertThat().statusCode(204);

    }
}