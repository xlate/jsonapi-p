package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiComplexLink extends JsonObject, JsonApiLink {

    JsonObject getMeta();

}
