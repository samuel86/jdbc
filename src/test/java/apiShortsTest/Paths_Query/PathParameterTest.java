package apiShortsTest.Paths_Query;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class PathParameterTest {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://3.81.99.109:8000";
    }

    /**
     * Given accept type is Json
     * And Id parameter value is 18
     * When user sends GET request to /api/spartans/{id}
     * Then response status code should be 200
     * And response content-type: application/json
     * And "Allen" should be in response payload/response body
     */

    @Test
    public void PathTest1(){
        Response response = RestAssured.given().accept(ContentType.JSON).
                and().auth().basic("admin", "admin").
                and().pathParam("id", 18).
                when().get("/api/spartans/{id}");
        response.prettyPrint();
        //verify status code
        assertEquals(response.statusCode(),200);

        //verify content type
        assertEquals(response.contentType(), "application/json;charset=UTF-8");

        //verify Allen exist
        assertTrue(response.body().asString().contains("Allen"));

       // response.body().prettyPrint(); same as above



    }

    /**
     * Given accept type is Json
     * And Id parameter value is 500
     * When user sends GET request to /api/spartans/{id}
     * Then response status code should be 404
     * And response content-type: application/json
     * And "Spartan Not Found" message should be in response payload/response body
     */

    @Test
    public void negativePathParamTest(){
        Response response = RestAssured.given().accept(ContentType.JSON).
                and().auth().basic("admin", "admin").
                and().pathParam("id", 500).
                when().get("/api/spartans/{id}");

        assertEquals(response.statusCode(),404);

        //verify content type
        assertEquals(response.contentType(), "application/json;charset=UTF-8");

        //verify Spartan Not Found exist
        assertTrue(response.body().asString().contains("Spartan Not Found"));
        response.prettyPrint();
    }

}
