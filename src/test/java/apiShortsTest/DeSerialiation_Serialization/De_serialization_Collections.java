package apiShortsTest.DeSerialiation_Serialization;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class De_serialization_Collections {

    @BeforeClass
    public void setup() {
        baseURI = "http://3.81.99.109:8000";
    }
    //JSON DATA TO JAVA COLLECTION
    /**
     * READING JSON BODY/PAYLOAD
     * --String contains("value") -->boolean verification
     * --path()
     * --JsonPath
     * --Hamcrest Matchers (chaining)
     *
     * --JSON response --> Java Datastructures/Collections
     * {
     *     "id": 14,
     *     "name": "Jamal",
     *     "gender": "Male",
     *     "phone": 1065669615
     * }
     *   Map<String, Object>
     *  JSON --> JAVA Collections
     *   De-Serialization
     *    -Json Parser, Object Mappers
     *    -GSON ==2.8.6 version
     *    -Jackson 1.x
     *    -Jackson 2.x
     *
     *    GSON --> json parser, object mapper
     *    Map<String, Object> spartan1 = response.body().as(Map.class);
     */

    @Test
    public void test1(){
        Response response = given().accept(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .pathParam("id", 14)
                .when().get("/api/spartans/{id}");

        //convect Json response to Java Collections(Map)
        Map<String,Object> spartanMap = response.body().as(Map.class);
        System.out.println(spartanMap.get("name"));
        System.out.println(spartanMap.get("id"));
        //one example verification one side map/expected value
        assertEquals(spartanMap.get("name"), "Jamal");
    }
  //List of Map
    @Test
    public void test2(){
        Response response = given().accept(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                //.pathParam("id", 14)
                .when().get("/api/spartans");

        //
        // response.prettyPrint();

        //Convert full json body to list of map
        List<Map<String, Object>> listOfSpartans = response.body().as(List.class);
        //How to get the values as list of map
        System.out.println(listOfSpartans.get(0));
        Map<String, Object> firstSpartan = listOfSpartans.get(0);
        System.out.println(firstSpartan.get("name"));

        //For one-by-one
        int counter= 1;
        for (Map<String, Object> map : listOfSpartans){
            System.out.println(counter + " - spartan"  + map);
            counter++;
        }


    }

}
