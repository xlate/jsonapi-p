package io.xlate.jsonapi;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonStructure;

public interface JsonApiDocument extends JsonObject {

    JsonStructure getData();

    JsonApiErrors getErrors();

    JsonObject getMeta();

    JsonApiObject getJsonApi();

    JsonApiLinks getLinks();

    JsonArray getIncluded();

}
