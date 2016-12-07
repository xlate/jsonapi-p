package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiRelationships extends JsonObject {

    JsonApiRelationship getRelationship(String name);

}
