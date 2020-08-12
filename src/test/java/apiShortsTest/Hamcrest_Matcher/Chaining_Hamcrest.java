package apiShortsTest.Hamcrest_Matcher;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Chaining_Hamcrest {
    @BeforeClass
    public void setup() {
        baseURI = "http://3.81.99.109:8000";
    }
/**
 * Given accept type is Json
 * And path param Id value is 14
 * When user sends GET request to /api/spartans/{id}
 * Then response status code should be 200
 * And response content-type: application/json
 * And  response payload/response body values match the following:
 *   {
 *     "id": 14,
 *     "name": "Jamal",
 *     "gender": "Male",
 *     "phone": 1065669615
 * }
 *
 */

      @Test
    public void test1(){
          given().accept(ContentType.JSON)
                  .and().auth().basic("admin", "admin")
                  .pathParam("id", 14)
                  .when().get("/api/spartans/{id}")
                  .then().statusCode(200).and()
                  .assertThat().contentType("application/json;charset=UTF-8");



      }
      //Note After THEN everything that follows is the response part
    //Navigating inside the json body with Chaining
    @Test
    public void test2(){
          //Request Part
        given().accept(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .pathParam("id", 14)
                .when().get("/api/spartans/{id}")

                //Response Part
                .then().statusCode(200).and()
                .assertThat().contentType("application/json;charset=UTF-8")

                .and().assertThat().body("id", Matchers.equalTo(14),
                "name",Matchers.equalTo("Jamal"), "gender", Matchers.equalTo("Male"),
                "phone", Matchers.equalTo(1065669615));

        //Note: We can to static import of Matcher so that we dont keep repeating Matchers over and over again

      }
}
