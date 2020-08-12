package apiShortsTest.RequestTypes;

public class PostRequestWithPostman {
    /**
     * To get the Swagger Documentation you have to navigate your own IP-Address\
     * Ex: 35.174.13.153:8000
     * Then check the Swagger documentation
     * The authentication:
     * Username: admin
     * Password: admin
     * From Documentation:
     * objSpartan *
     * (body)
     * Json Object to represent A valid Spartan.
     * Gender can be Male or Female.
     * Name between 2-15 characters.
     * Phone number minimun 10 digit
     *
     * Example Value
     * Model
     * {
     *   "gender": "string",
     *   "name": "string",
     *   "phone": 0
     * }
     * Parameter content type
     *
     * application/json;charset=UTF-8
     *
     * SELECT POST on POSTMAN
     * Then Body --> raw --> then paste model
     *
     * Then click on HEADER
     * accept     application/json
     * Content-Type  application/json
     *
     * RESULT:
     * {
     *     "success": "A Spartan is Born!",
     *     "data": {
     *         "id": 111,
     *         "name": "Samios",
     *         "gender": "Male",
     *         "phone": 1790874917
     *     }
     * }
     * POST METHOD:
     *   -Request Part
     *       -BaseURL + Endpoints
     *       -Headers
     *          -Accept   application/json --> We are asking api to send json response body
     *          -Content-Type  application/json --> We are letting api know that we are sending JSON BODY
     *       -Body
     *         -JSON
     *         -XML
     *         -...
     *
     *    -Response Part
     *         -Status code
     *             -201 Created --> This will be the status code if you successfully send post request
     *         -Headers
     *         -Body
     *            -Most of the time you will have some message like success
     *            -and also whatever you send as a request body
     *
     *
     *
     *
     *
     *
     */
}
