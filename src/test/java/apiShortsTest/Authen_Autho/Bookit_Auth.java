package apiShortsTest.Authen_Autho;

import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class Bookit_Auth {

    String accessToken = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4NiIsImF1ZCI6InN0dWRlbnQtdGVhbS1sZWFkZXIifQ.lEfjcu6RpBfcZ4qWthzZU8uH8fX4FCJFfxBnPNgh4Mo";

    @BeforeClass
    public void setup() {
        baseURI = "https://cybertek-reservation-api-qa3.herokuapp.com";
    }

    @Test
    public void test1(){
       Response response = given().header("Authorization", accessToken)
                .when().get("/api/campuses");
        assertEquals(response.statusCode(), 200);
        response.prettyPrint();

    }
}
