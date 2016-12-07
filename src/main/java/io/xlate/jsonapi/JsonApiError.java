package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiError extends JsonObject {

    String getId();

    JsonApiLinks getLinks();

    String getStatus();

    String getCode();

    String getTitle();

    String getDetail();

    JsonObject getMeta();

}
