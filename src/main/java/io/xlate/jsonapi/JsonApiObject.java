package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiObject extends JsonObject {

    String getVersion();

    JsonObject getMeta();
}
