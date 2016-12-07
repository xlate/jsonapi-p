package io.xlate.jsonapi;

import javax.json.JsonArray;

public interface JsonApiErrors extends JsonArray {

    JsonApiError getJsonApiError(int index);

}
