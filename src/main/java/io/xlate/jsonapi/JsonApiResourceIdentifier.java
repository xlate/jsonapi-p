package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiResourceIdentifier extends JsonObject {

    String getId();

    String getType();

    JsonObject getMeta();

}
