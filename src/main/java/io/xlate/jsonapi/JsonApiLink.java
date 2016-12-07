package io.xlate.jsonapi;

import java.net.URL;

import javax.json.JsonValue;

public interface JsonApiLink extends JsonValue {

    URL getUrl();

    boolean isLinkObject();

}
