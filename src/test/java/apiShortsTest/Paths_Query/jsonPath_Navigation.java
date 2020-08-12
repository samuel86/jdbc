package apiShortsTest.Paths_Query;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class jsonPath_Navigation {

    @BeforeClass
    public void setup() {
        baseURI = "http://3.81.99.109:8000";
    }
/**
 * Given accept type is Json
 * And path param Id value is 11
 * When user sends GET request to /api/spartans/{id}
 * Then response status code should be 200
 * And response content-type: application/json
 * And  response payload/response body values match the following:
 *   {
 *     "id": 11,
 *     "name": "Jamal",
 *     "gender": "Male",
 *     "phone": 1111112222
 * }
 *
 */


    @Test
    public void test1(){
        Response response = given().accept(ContentType.JSON)
                .pathParam("id", 200)
                .when().get("/api/spartans/{id}");
        assertEquals(response.statusCode(), 200);
        //how to read value with path() method
         int id = response.path("id");
        System.out.println("id = " + id);

        //How to read value with JsonPath
        JsonPath jsonData = response.jsonPath();

        int id1 = jsonData.getInt("id1");
        String name = jsonData.getString("name");
        String gender = jsonData.getString("gender");
        long phone = jsonData.getLong("phone");

        System.out.println("id1 = " + id1);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);

        assertEquals(id, 11);
        assertEquals(name,"Jamal");
        assertEquals(gender, "Male");
        assertEquals(phone, "1111112222");
















    }


}
