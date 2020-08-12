package apiShortsTest.Paths_Query;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class QueryParamTest {

    //Note: When we make RestAssured static, there is no need to use RestAssured in the test body
    @BeforeClass
    public void setup() {
        baseURI = "http://3.81.99.109:8000";
    }

    /**
     * Given accept type is Json
     * And query parameter values are :
     * gender | Male
     * nameContains | J
     * When user sends GET request to /api/spartans/search
     * Then response status code should be 200
     * And response content-type: application/json;charset=UTF-8
     * And "Female" should be in response payload/response body
     * And "Janette" should be in response payload
     */
    @Test
    public void QueryParam1() {
        Response response = given().accept(ContentType.JSON).
                and().auth().basic("admin", "admin").
                and().queryParam("gender", "Female").
                and().queryParam("nameContains", "J").
                when().get("/api/spartans/search");

        //verify status code
        assertEquals(response.statusCode(), 200);

        //verify content type
        assertEquals(response.contentType(), "application/json;charset=UTF-8");

        //verify Allen exist
        assertTrue(response.body().asString().contains("Female"));
        //verify Janette
        assertTrue(response.body().asString().contains("Janette"));

        //To make sure that Male does not exist
        assertFalse(response.body().asString().contains("Male"));
        //assertTrue(response.body().asString().contains("Male"));//This will fail the Test



        response.body().prettyPrint();


    }
    @Test
    public void QueryParam2() {
     //Creating MAP for Query Params
     //Because is key value format

        Map<String, Object>  paramsMap = new HashMap<>();
        paramsMap.put("gender","Female");
        paramsMap.put("nameContains", "J");
        //send request
        Response response = given().accept(ContentType.JSON).
                and().auth().basic("admin", "admin").
                and().queryParams(paramsMap).
                when().get("/api/spartans/search");



        //verify status code
        assertEquals(response.statusCode(), 200);

        //verify content type
        assertEquals(response.contentType(), "application/json;charset=UTF-8");

        //verify Allen exist
        assertTrue(response.body().asString().contains("Female"));
        //verify Janette
        assertTrue(response.body().asString().contains("Janette"));

        //To make sure that Male does not exist
        assertFalse(response.body().asString().contains("Male"));
        //assertFalse(response.body().asString().contains("Male"));//This will fail the Test



        response.body().prettyPrint();


    }














}