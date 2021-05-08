/*
 * Copyright 2021 OPPO ESA Stack Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package esa.servicekeeper.adapter.restlight.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(RestlightAutoSupportConfig.RESTLIGHT_SUPPORT_AOP_PREFIX)
public class RestlightAutoSupportConfig {

    public static final String RESTLIGHT_SUPPORT_AOP_PREFIX = "esa.servicekeeper.adapter.aop.restlight.support";

    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

}
