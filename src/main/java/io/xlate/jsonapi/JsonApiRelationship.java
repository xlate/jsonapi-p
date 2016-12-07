package io.xlate.jsonapi;

import javax.json.JsonObject;
import javax.json.JsonStructure;

public interface JsonApiRelationship extends JsonObject {

    JsonApiLinks getLinks();

    JsonStructure getData();

    JsonObject getMeta();

}
