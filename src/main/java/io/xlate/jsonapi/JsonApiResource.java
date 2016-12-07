package io.xlate.jsonapi;

import javax.json.JsonObject;

public interface JsonApiResource extends JsonApiResourceIdentifier {

    JsonObject getAttributes();

    JsonApiRelationships getRelationships();

    JsonApiLinks getLinks();

}
