package apiShortsTest;

public class Note {
    /**
     *What is an API testing?
     * API testing requires an application to interact with API. In order words to test an API,
     * we will need to: Checking the Business Logic layer of the application
     * Using software to send calls to an API, get output, and not down the system's responds.
     * 1. Use testing tool to drive the API
     * 2. Write your own code to test the API
     * Clint vs Service
     * Sent Request And get Responds and verify if the results matches with
     * the expected and the API is behaving or working
     * as expected
     *
     *
     * 2. How to send a request?
     * --When we send request, we need to know the API method/Endpoints that are available:
     * 1. read documentation about api methods
     * 2. Swagger tool, that has API methods and description
     *
     * TYPES OF HTTP REQUESTS
     * -GET --Retrieves the data from a specific source
     * -POST -- Sends new data to a
     * -PUT -- Update into for a
     * -DELETE- Removes data fron a
     *
     * POSTMAN : For man testing API
     * --Two actor
     *    -Client -US/Postman
     *    -Server
     *
     *    HTTP STATUS CODE
     *    200 -> Ok
     *    400 -> Client Error
     *    500 -> Server/API's Error
     *
     *    FIRST TEST CASE
     *    . When I send a GET request to
     *    . http://54.204.200.8000/api/spartans
     *    . Then Response STATUS CODE must be 200
     *    . And I should see all Spartans data in JSON format
     *    Remember: It follows a Gherkin Language
     * ---Go to Swagger
     * --But before, Must first get your IP address
     * --copy IP-address from AWS EC2 instance and paste the IP-address into google search and add 8000 to
     *      get the spartans Api swagger screen
     * --Then we take the base Url from Spartans app and put it into the POSTMAN
     *
     *           HEADERS
     *   --Additional information about request and responds
     *   --It works like a MAP(Key/Value structure)
     *   When we seed with the header?
     *     -Content types (application/json, application/xml)
     *     -Credential, Authentication, (username, password, different types)
     *     Request Header
     *     Accept, application/json -> hey, API, please send me json respond.
     *     Accept, application/xml -> please send me xml responds
     *
     *    RESPONDS HEADER
     *    Content-type, application/json -> hey, client, I am sending you json body
     *    Conent-type, application/xml -> hey, client, I am sending you xml body
     *
     *    PARAMETERS
     *    Options you can pass with the endpoinds to influence the responds
     *       --Two Types
     *          -Query
     *          -Path
     *       --Always check the decumentation from the swagger before you do anything
     *  PATH PARAMETER:
     *   .It is part of the URL and followed by the END POINT of full resource url
     *   EX: 3.81.99.109:8000/api/spartans/{id}
     *
     *   QUERY PARAMETER:
     *   .It is not part of the URL and passed in KEY + VALUE format
     *   .? means end of URL
     *   Ex: http://www.amazon.com/s?k=api
     *   The question mark is the end of the URL
     *   the rest are just key and value structure
     *
     *   Remember the three Get's in the swagger application
     *   the last one is basically for query parameters
     * =========================================================
     * What are the parts of GET REQUEST?
     *   -BaseURL + EndPoint(API method)
     *   -Parameters
     *      --1.Path parameter /{id} -> it is part of the url
     *      --2.Query parameter (key and value) -> not part of the url
     *    -Headers
     *        -Accept,application/json(or xml) --> I want to get json responds body
     *        -Authentication, credentials,(username, passwrod)
     * What are the parts of GET RESPONSE
     *     -Status Code
     *         -2x --> successful
     *         -4x --> client(our) error
     *         -5x --> server error
     *      -Header
     *          Content-Type , application/json -->I sent to you json response body
     *      -Body
     *         -json
     *         -xml
     *         -html
     *         -text
     * ===============================================
     * INTERVIEW QUESTION:
     * How do you test rest API?
     *    -I verify if REST API endpoint is working as expected
     *    -I send POST, PUT, GET, DELETE type of request and
     *    -I verify response status code and response body, header.
     *   -I also do Positive and Negative testing of API
     *   -For Positive Testing:
     *      I send Valid request Parameters
     *      Valid headers, valid request json body and
     *      Verify that response status code is 200 successful
     *      And Json response body data is also matching the Expected.
     *   -For Negative Testing:
     *      I send inValid request Parameters or
     *      inValid headers, or invalid request json body and
     *      Verify that response status code is not 200
     *      And Json response body contains error message.
     *   ============
     *      DOCUMENTATION OF API: SWAGGER UI
     *      MANUAL TESTING OF API: POSTMAN, SOAP UI
     *      AUTOMATED TESTING OF API: REST-ASSURED LIBRARY IN JAVA
     *
     *  We manually test API with POSTMAN
     *  We use swagger documentation to understand API
     *  We use RestAssured library for automation
     *       --Need two(2) dependencies from mvnrepository
     *       1.Rest-assured
     *       2.TestNG

     */
}
