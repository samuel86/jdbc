package apiShortsTest.Paths_Query;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PathMethodTest_NavigationThroughArray {

    @BeforeClass
    public void setup(){
       baseURI = "http://3.81.99.109:8000";


    }

    //How to navigate through/inside the json response
    //One way to navigate through your json body is PATH
    /**
     * Given accept type is Json
     * And path param Id value is 10
     * When user sends GET request to /api/spartans/{id}
     * Then response status code should be 200
     * And response content-type: application/json
     * And  response payload/response body values match the following:
     *    id is 10
     *    name i "Lorenza"
     *    gender is "Female"
     *    phone is 3312820
     *
     *     "id": 30,
     *     "name": "Melania",
     *     "gender": "Female",
     *     "phone": 8916944276
     */

    @Test
    public void PathMethodTest1(){
        Response response = given().accept(ContentType.JSON).
                and().auth().basic("admin", "admin").
                and().pathParam("id", 30).
                when().get("/api/spartans/{id}");
        response.prettyPrint();
        //verify status code
        assertEquals(response.statusCode(),200);

        //verify content type
        assertEquals(response.contentType(), "application/json;charset=UTF-8");
        //printing values of json keys
        System.out.println("Id " +response.body().path("id").toString());
        System.out.println("name " +response.body().path("name").toString());
        System.out.println("gender " +response.path("gender").toString());
        System.out.println("phone " +response.path("phone").toString());

        ///////////OR/////////// Store them as variables
        int id = response.path("id");
        String name = response.body().path("name");
        String gender = response.body().path("gender");
        long phone = response.path("phone");

        System.out.println("phone = " + phone);
        System.out.println("gender = " + gender);
        System.out.println("name = " + name);
        System.out.println("id = " + id);

        assertEquals(id,  30 );
        assertEquals(name, "Melania");
        assertEquals(gender, "Female");
        assertEquals(phone,  8916944276l);

    }
    @Test
    public void PathMethodTest2(){
        //With out authentication
        /*
        Response response1 = get("/api/spartans");
        int firstId = response1.path("id[0]");
        System.out.println("firstId = " + firstId);
        //jpath synthax =id[0]
        //extract name
        String first1stName = response1.path("name[0]");
        System.out.println("first1stName = " + first1stName);

         */

        Response response = given().accept(ContentType.JSON).
        and().auth().basic("admin", "admin").
        when().get("/api/spartans");

        //extracting first id
        int firstId = response.path("id[0]");
        System.out.println("firstId = " + firstId);
        //jpath synthax =id[0]

        //extract first name
        String first1stName = response.path("name[0]");
        System.out.println("first1stName = " + first1stName);

        //get the last firstname
        String last1stName = response.path("name[-1]");
        System.out.println("last1stName = " + last1stName);

        //Extract all first names and print
        List<String> names = response.path("name");
        System.out.println(names);
        System.out.println("name = " + names.size());

        List<Object> phoneNumbers = response.path("phone");

        for (Object phoneNumber : phoneNumbers){
            System.out.println(phoneNumber);
        }

    }













}
