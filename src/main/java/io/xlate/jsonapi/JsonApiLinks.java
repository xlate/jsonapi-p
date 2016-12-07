package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiLinks extends JsonObject {

    JsonApiLink getLink(String name);

}
