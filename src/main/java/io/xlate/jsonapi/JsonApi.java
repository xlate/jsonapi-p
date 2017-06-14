/*******************************************************************************
 * Copyright 2016 xlate.io, http://www.xlate.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *******************************************************************************/
package io.xlate.jsonapi;

/**
 * Factory class for creating JSON API processing objects
 * (<a href="http://jsonapi.org">jsonapi.org</a>). This class provides the most
 * commonly used methods for creating these objects and their corresponding
 * factories. The factory classes provide all the various ways to create these
 * objects.
 *
 * <p>
 * All the methods in this class are safe for use by multiple concurrent
 * threads.
 *
 * @see <a href="http://jsonapi.org">http://jsonapi.org</a>
 *
 * @author Michael Edgar
 */
public class JsonApi {

    public static final String MEDIA_TYPE = "application/vnd.api+json";

    public enum Version {
        VERSION_1_0("1.0");

        private final String value;

        Version(String value) {
            this.value = value;
        }

        public String getvalue() {
            return value;
        }

        public static Version fromValue(String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            for (Version v : values()) {
                if (v.value.equals(value)) {
                    return v;
                }
            }
            throw new IllegalArgumentException("Unknown version: " + value);
        }
    }

    private JsonApi() {
    }

}
