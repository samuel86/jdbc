package apiShortsTest.Json_Schema;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidatorWithRestAssured {

    @BeforeClass
    public void setup() {
        baseURI = "http://35.174.13.153:8000";
    }
    //NOTE: we need jsonschemavalidator dependency from mvnrepository into our pom.xml file
    //Then copy schema and create a resource folder and file and paste the schema
    @Test
    public void test1(){
        //Send request to see if the response is matching with the schema
                given().accept(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .pathParam("id", 10)
                .when().get("/api/spartans/{id}")
                .then().assertThat().statusCode(200)
                .and().assertThat().body(matchesJsonSchemaInClasspath("SingleSpartanSchema.json"));

    }
}
