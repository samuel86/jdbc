package apiShortsTest.DeSerialiation_Serialization;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class De_Serialization_POJO {

    /**
     * GSON --> json parser, object mapper
     * Map<String, Object> spartan1 = response.body().as(Map.class);
     * POJO --> Plain Old Java Object
     *
     * JSON RESPONSE --> java object(pojo) --> de-serialization
     * java object to JSON BODY --> serialization
     *
     * public class Spartan{
     *
     *     private int id;
     *     private String name;
     *     private String gender;
     *     private long phone;
     * }
     *
     */
    @BeforeClass
    public void setup() {
        baseURI = "http://35.174.13.153:8000";
    }

    @Test
    public void test1(){
        Response response = given().accept(ContentType.JSON)
                .and().auth().basic("admin", "admin")
                .pathParam("id", 14)
                .when().get("/api/spartans/{id}");
       // response.prettyPrint();


        //GSON Library --> de-serialization
        //How to convert json response to our spartan class
        Spartan_Pojo spartan = response.body().as(Spartan_Pojo.class);
        System.out.println(spartan.toString());
        //Spartan{id=14, name='Grenville', gender='Male', phone=1065669615}
        assertEquals(spartan.getName(), "Grenville");
        assertEquals(spartan.getId(),14);
        assertEquals(spartan.getGender(), "Male");
        assertEquals(spartan.getPhone(), 1065669615);

    }
    @Test
    public void test2(){

        Gson gson = new Gson();

        String myJsonBody = "{\n" +
                "    \"id\": 14,\n" +
                "    \"name\": \"Grenville\",\n" +
                "    \"gender\": \"Male\",\n" +
                "    \"phone\": 1065669615\n" +
                "}";

        //Using gson method to de-serialize our json body
        Spartan_Pojo spartanPojo = gson.fromJson(myJsonBody, Spartan_Pojo.class);
        System.out.println(spartanPojo.toString());

        //Serialization Java Objects --> JSON BODY
        Spartan_Pojo spartan_pojo = new Spartan_Pojo(111, "Samios", "Male", 1790874917);
        //Converting custom class to json (serialization)
        String jsonbody = gson.toJson(spartan_pojo);
        System.out.println(jsonbody);
    }
}
