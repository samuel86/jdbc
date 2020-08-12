package apiShortsTest.RequestTypes;

public class PutRequestWithPostman {
    /**
     * Name	Description
     * id *
     * integer($int64)
     * (path)
     * Enter valid ID to retrieve Spartan object to edit
     * objSpartan *
     * (body)
     * New Json Object to represent A valid Spartan.
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
     * application/json
     *
     * { UPDATE:
     *     "id": 114,
     *     "name": "SamPoJp",
     *     "gender": "Male",
     *     "phone": 34727522100
     * }
     * {TO:
     *     "name": "Jackie",
     *     "gender": "Female",
     *     "phone": 34727522100
     * }
     * SUCCESS:
     * 204 No Content
     * 79 ms
     * 223 B
     */
}
