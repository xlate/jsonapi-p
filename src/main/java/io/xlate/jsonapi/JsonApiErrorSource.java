package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiErrorSource extends JsonObject {

    String getPointer();

    String getParameter();

}
