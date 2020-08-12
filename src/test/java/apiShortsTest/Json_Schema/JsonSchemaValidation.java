package apiShortsTest.Json_Schema;

public class JsonSchemaValidation {


    /** Manually
     * url: JSON Schema Tool
     * Ex:
     * {
     *     "id": 10,
     *     "name": "Lorenza",
     *     "gender": "Female",
     *     "phone": 3312820936
     * }
     * Then COPY PASTE THIS TEMPLATE into JSON Schema Validator to make sure that the DATA is okay:{
     *     "$schema": "http://json-schema.org/draft-07/schema",
     *     "$id": "http://example.com/example.json",
     *     "type": "object",
     *     "title": "The root schema",
     *     "description": "The root schema comprises the entire JSON document.",
     *     "default": {},
     *     "examples": [
     *         {
     *             "id": 10,
     *             "name": "Lorenza",
     *             "gender": "Female",
     *             "phone": 3312820936
     *         }
     *     ],
     *     "required": [
     *         "id",
     *         "name",
     *         "gender",
     *         "phone"
     *     ],
     *     "properties": {
     *         "id": {
     *             "$id": "#/properties/id",
     *             "type": "integer",
     *             "title": "The id schema",
     *             "description": "An explanation about the purpose of this instance.",
     *             "default": 0,
     *             "examples": [
     *                 10
     *             ]
     *         },
     *         "name": {
     *             "$id": "#/properties/name",
     *             "type": "string",
     *             "title": "The name schema",
     *             "description": "An explanation about the purpose of this instance.",
     *             "default": "",
     *             "examples": [
     *                 "Lorenza"
     *             ]
     *         },
     *         "gender": {
     *             "$id": "#/properties/gender",
     *             "type": "string",
     *             "title": "The gender schema",
     *             "description": "An explanation about the purpose of this instance.",
     *             "default": "",
     *             "examples": [
     *                 "Female"
     *             ]
     *         },
     *         "phone": {
     *             "$id": "#/properties/phone",
     *             "type": "integer",
     *             "title": "The phone schema",
     *             "description": "An explanation about the purpose of this instance.",
     *             "default": 0,
     *             "examples": [
     *                 3312820936
     *             ]
     *         }
     *     },
     *     "additionalProperties": true
     * }
     * url to check: JsonSchemaValidator
     *
     * Json Schema
     *   --description of json data
     *   Ex: Copy this data and it into JSONschema.net
     *   {
     *      *             "id": 10,
     *      *             "name": "Lorenza",
     *      *             "gender": "Female",
     *      *             "phone": 3312820936
     *      *         }
     *
     *
     *   id --> required, integer, up to 6 digits
     *   name --> required, String, up to 25 characters
     *   gender --> optional, 2 option Male, Female
     *   phone --> required, numbers, 10 digits
     */
}
