import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GameTest {
    @Test
    public void functionalTests(){
        Response response = given().accept(ContentType.JSON).
                and().queryParam("", "").
                and().queryParam("", "").
                when().get("");


    }
//
//    @Test
//    @DisplayName("No params test")
//    public void noParams(){
//        Response response = when().get().prettyPeek();
//​
//        response.then().
//                assertThat().
//                statusCode(200).
//                and().
//                contentType("application/json; charset=utf-8");
//    }
//    //Game Name test
//    //1. Create a request by providing query parameter: name
//    //2. Verify status code 200, content type application/json; charset=utf-8
//    //3. Verify that value of text field contains game name
//    @Test
//    @DisplayName("Game Name test")
//    public void gameNameTest() {
//        String gameName = "Chess";
//        Response response =
//                given().
//                        queryParams("name",gameName).
//                        when().
//                        get().prettyPeek();
//​
//        response.then().
//                assertThat().
//                statusCode(200).
//                and().
//                contentType("application/json; charset=utf-8").
//                and().
//                body("text",is("Playing " + gameName + " is fun!")).
//        and().
//                body("id", notNullValue()).
//                body("text",notNullValue());
//​
    }
    /*
    import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
​
        ​
        import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
​
    public class SimpleGame {
        @BeforeAll
        public static void beforeAll(){
            baseURI = "http://localhost:8080/game?name=Chess";
        }
//    TEST CASES
//    No params test
//1. Send a get request without providing any parameters
//2. Verify status code 200, content type application/json; charset=utf-8
//3. Verify that id, text fields have value
​
        @Test
        @DisplayName("No params test")
        public void noParams(){
            Response response = when().get().prettyPeek();
​
            response.then().
                    assertThat().
                    statusCode(200).
                    and().
                    contentType("application/json; charset=utf-8");
        }
    }

     */




