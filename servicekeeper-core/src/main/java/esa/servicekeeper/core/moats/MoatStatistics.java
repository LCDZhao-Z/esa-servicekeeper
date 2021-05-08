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
package esa.servicekeeper.core.moats;

import esa.servicekeeper.core.common.ArgConfigKey;

public interface MoatStatistics {

    /**
     * Obtains the moat count of specified {@link ArgConfigKey}.
     *
     * @param key id
     * @return moat count
     */
    int countOf(ArgConfigKey key);

    /**
     * Obtains the moat count of specified {@link MoatType}.
     *
     * @param type type
     * @return moat count
     */
    int countOf(MoatType type);

    /**
     * Obtains the moat count of specified {@link MoatType}.
     *
     * @return moat count
     */
    int totalCount();

}
