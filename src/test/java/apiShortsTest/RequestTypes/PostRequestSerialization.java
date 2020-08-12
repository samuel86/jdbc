package apiShortsTest.RequestTypes;

import apiShortsTest.DeSerialiation_Serialization.Spartan_Pojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PostRequestSerialization {

    @BeforeClass
    public void setup(){
        baseURI = "http://35.174.13.153:8000";


    }
   @Test
    public void postWithPojo() {
       //create Spartan object and used as a body for post request
       Spartan_Pojo spartan_pojo = new Spartan_Pojo();
       spartan_pojo.setName("SamPoJp");
       spartan_pojo.setGender("Male");
       spartan_pojo.setPhone(34727522100L);

       Response response = given().accept(ContentType.JSON)
               .and().contentType(ContentType.JSON)
               .and().auth().basic("admin", "admin")
               .body(spartan_pojo)
               .when().post("/api/spartans");
       assertEquals(response.statusCode(), 201);
       assertEquals(response.contentType(), "application/json");
       response.prettyPrint();

       /**RESULT:
        * {
        *     "success": "A Spartan is Born!",
        *     "data": {
        *         "id": 113,
        *         "name": "SamPoJp",
        *         "gender": "Male",
        *         "phone": 34727522100
        *     }
        * }
        */
   }
     //============================= GET REQUEST ======================
       @Test
       public void test1() {

           Response response1 = given().accept(ContentType.JSON)
                   .and().auth().basic("admin", "admin")
                   .pathParam("id", 113)
                   .when().get("/api/spartans/{id}");

           Spartan_Pojo spartanPojoResponse = response1.body().as(Spartan_Pojo.class);
           System.out.println(spartanPojoResponse.toString());

   }
}
