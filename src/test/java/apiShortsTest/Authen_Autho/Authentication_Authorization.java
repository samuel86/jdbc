package apiShortsTest.Authen_Autho;

public class Authentication_Authorization {
    /**
     * AUTHORIZATION IN REST API: Security of the API
     *
     * AUTHENTICATION: --> verifies if you are who you say you are.
     *                 --> checks for valid credentials
     * AUTHORIZATION:  --> verifies if you have access/permission to certain API/actions
     *                    Ex: Not everyone has access to delete Spartan
     *
     * BOOKIT API: https://cybertek-reservation-api-docs.herokuapp.com/#introduction
     *
     *
     * URL & ENDPOINT: https://cybertek-reservation-api-qa3.herokuapp.com/sign
     *                 https://cybertek-reservation-api-qa3.herokuapp.com
     * Email:   emaynell8f@google.es
     * Password: besslebond
     *
     *
     * PASS THIS AS A HEADER
     * TOKEN : {
     *     "accessToken": "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4NiIsImF1ZCI6InN0dWRlbnQtdGVhbS1sZWFkZXIifQ.lEfjcu6RpBfcZ4qWthzZU8uH8fX4FCJFfxBnPNgh4Mo",
     *     "refreshToken": "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4NiIsImF1ZCI6InN0dWRlbnQtdGVhbS1sZWFkZXIifQ.lEfjcu6RpBfcZ4qWthzZU8uH8fX4FCJFfxBnPNgh4Mo"
     * }
     * 2. Do it with the header
     *     Key            Value
     *  Authorization: Bearer your-token
     *  Ex: Same Result as the first one
     *  Key:
     *  Authorization
     *  Value:
     *  Bearer
     *  eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4NiIsImF1ZCI6InN0dWRlbnQtdGVhbS1sZWFkZXIifQ.lEfjcu6RpBfcZ4qWthzZU8uH8fX4FCJFfxBnPNgh4Mo
     *
     *  HTTP Request
     *  GET /api/sign
     *  2. Do it with the header
     *
     *
     * So when we send a GET request
     *
     * Endpoint: https://cybertek-reservation-api-qa3.herokuapp.com/api/campuses
     * Status Code: 422 Unprocessable Entity
     * Body: empty or invalid sign.
     * THEN: Copy the Token and paste it
     *  Click Authorization\
     *  Select Bearer Token
     *  Paste: "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4NiIsImF1ZCI6InN0dWRlbnQtdGVhbS1sZWFkZXIifQ.lEfjcu6RpBfcZ4qWthzZU8uH8fX4FCJFfxBnPNgh4Mo"
     *  And send a request
     *
     *  RESULTS:
     *  [
     *     {
     *         "id": 1,
     *         "location": "VA",
     *         "clusters": [
     *             {
     *                 "id": 3,
     *                 "name": "light-side",
     *                 "rooms": [
     *                     {
     *                         "id": 111,
     *                         "name": "mit",
     *                         "description": "mens et manus",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 112,
     *                         "name": "harvard",
     *                         "description": "veritas",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": false
     *                     },
     *                     {
     *                         "id": 113,
     *                         "name": "yale",
     *                         "description": "lux et veritas",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": false
     *                     },
     *                     {
     *                         "id": 114,
     *                         "name": "princeton",
     *                         "description": "dei sub numine viget",
     *                         "capacity": 4,
     *                         "withTV": true,
     *                         "withWhiteBoard": false
     *                     },
     *                     {
     *                         "id": 115,
     *                         "name": "stanford",
     *                         "description": "die luft der freiheit weht",
     *                         "capacity": 6,
     *                         "withTV": false,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 116,
     *                         "name": "duke",
     *                         "description": "eruditio et religio",
     *                         "capacity": 4,
     *                         "withTV": true,
     *                         "withWhiteBoard": false
     *                     },
     *                     {
     *                         "id": 117,
     *                         "name": "berkeley",
     *                         "description": "fiat lux",
     *                         "capacity": 4,
     *                         "withTV": true,
     *                         "withWhiteBoard": false
     *                     }
     *                 ]
     *             },
     *             {
     *                 "id": 4,
     *                 "name": "dark-side",
     *                 "rooms": [
     *                     {
     *                         "id": 121,
     *                         "name": "kilimanjaro",
     *                         "description": "it isn't the mountains ahead to climb that wear you out, it's the pebble in your shoe",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 122,
     *                         "name": "half dome",
     *                         "description": "faith moves mountains",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 123,
     *                         "name": "denali",
     *                         "description": "you can't move mountains by whispering at them",
     *                         "capacity": 4,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 124,
     *                         "name": "meru",
     *                         "description": "every mountain top is within reach if you just keep climbing",
     *                         "capacity": 4,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     }
     *                 ]
     *             }
     *         ]
     *     },
     *     {
     *         "id": 2,
     *         "location": "IL",
     *         "clusters": [
     *             {
     *                 "id": 5,
     *                 "name": "il",
     *                 "rooms": [
     *                     {
     *                         "id": 211,
     *                         "name": "google",
     *                         "description": "don't be evil",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 212,
     *                         "name": "apple",
     *                         "description": "think different",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 213,
     *                         "name": "microsoft",
     *                         "description": "be what's next",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 214,
     *                         "name": "bay_area",
     *                         "description": "make future",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 215,
     *                         "name": "amazon",
     *                         "description": "work hard. have fun. make history",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 216,
     *                         "name": "tesla",
     *                         "description": "just do it",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *                     },
     *                     {
     *                         "id": 217,
     *                         "name": "facebook",
     *                         "description": "move fast and break things",
     *                         "capacity": 6,
     *                         "withTV": true,
     *                         "withWhiteBoard": true
     *
     */
}
