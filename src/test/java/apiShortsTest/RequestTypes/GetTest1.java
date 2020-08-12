package apiShortsTest.RequestTypes;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTest1 {

    String spartanBaseUrl = "http://3.81.99.109:8000";

    @Test
    public void viewSpartanTest1(){
        //With out authentication
        /*
        Response response1 = RestAssured.get(spartanBaseUrl + "/api/spartans");
        System.out.println(response1.statusCode());
        response1.body().prettyPrint();

         */

        //With basic authentication
        Response response = given().accept(ContentType.JSON).and()
                .auth().basic("admin","admin")
                .when().get(spartanBaseUrl + "/api/spartans");

        System.out.println(response.statusCode());
        response.body().prettyPrint();
    }
}
