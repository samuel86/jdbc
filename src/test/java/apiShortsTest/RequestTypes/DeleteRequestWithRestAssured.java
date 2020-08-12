package apiShortsTest.RequestTypes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DeleteRequestWithRestAssured {

        @BeforeClass
        public void setup() {
            baseURI = "http://35.174.13.153:8000";
        }

    /**DELETE:
     * {
     *         "id": 101,
     *         "name": "Nursultan",
     *         "gender": "Male",
     *         "phone": 1234567899
     *     }
     */

    @Test
    public void deleteRequest() {

        given().pathParam("id", 101)
                .and().auth().basic("admin", "admin")
                .when().delete("/api/spartans/{id}")
                .then().assertThat().statusCode(204);


        /**
         * If I send get request again the result will be
         * {
         *     "timestamp": "2020-07-31T05:28:36.255+0000",
         *     "status": 404,
         *     "error": "Not Found",
         *     "message": "Spartan Not Found",
         *     "path": "/api/spartans/101"
         * }
         * because is not found in Spartan on POSTMAN
         */
    }
   @Test
   public void verifyDelete(){
        //Verify part --> to make sure that is not exist but if we run the first one again we will get error
        given().pathParam("id", 101)
                .and().auth().basic("admin", "admin")
                .when().delete("/api/spartans/{id}")
                .then().assertThat().statusCode(404);




    }
}
