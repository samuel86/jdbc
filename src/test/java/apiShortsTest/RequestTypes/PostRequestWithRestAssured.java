package apiShortsTest.RequestTypes;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PostRequestWithRestAssured {
    @BeforeClass
    public void setup() {
        baseURI = "http://35.174.13.153:8000";
    }
     //54.196.49.144
    /*
    Given accept type and Content type is JSON
    And request json body is:
     {
        "id": 111,
        "name": "Samios",
        "gender": "Male",
        "phone": 1790874917
    }
    When user sends POST request to '/spartans'
    Then status code 201
    And content type should ne application/json
    And json payload/response should contain:
    "A Spartan is Born!" message
    and same data what is posted
     */
    @Test
    public void postWithString() {
        //sending json body as String
        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .body(" {\n" +
                        "        \"id\": 111,\n" +
                        "        \"name\": \"Samios\",\n" +
                        "        \"gender\": \"Male\",\n" +
                        "        \"phone\": 1790874917\n" +
                        "    }")
                .when().post("/api/spartans");
        response.prettyPrint();

        //Validation
        //Verify status code is 201
        assertEquals(response.statusCode(),201);
        assertEquals(response.contentType(), "application/json");

        //verify success message
        assertEquals(response.path("success"), "A Spartan is Born!");

        //verify request body
        JsonPath json = response.jsonPath();
        assertEquals(json.getString("data.name"),"Samios");
        assertEquals(json.getString("data.gender"),"Male");
        assertEquals(json.getLong("data.phone"),1790874917L);

    }
    @Test
    public void postMethodWithMap(){
        //Create a map to be used as a body for post request
        Map<String, Object> requestMap = new HashMap<>();
               requestMap.put("name", "SamiosMap");
               requestMap.put("gender","Male");
               requestMap.put("phone", 1790874910L);

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .body(requestMap)
                .when().post("/api/spartans");
        assertEquals(response.statusCode(),201);
        response.prettyPrint();
    }
}