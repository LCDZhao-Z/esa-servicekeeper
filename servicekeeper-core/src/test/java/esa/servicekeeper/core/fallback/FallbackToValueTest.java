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
package esa.servicekeeper.core.fallback;

import esa.servicekeeper.core.executionchain.Context;
import org.junit.jupiter.api.Test;

import static esa.servicekeeper.core.fallback.FallbackHandler.FallbackType.FALLBACK_TO_VALUE;
import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.Mockito.mock;

class FallbackToValueTest {

    private static final String FALLBACK_VALUE = "fallback";

    private final FallbackToValue fallback = new FallbackToValue(FALLBACK_VALUE);

    @Test
    void testHandle() {
        final Context context = mock(Context.class);
        then(fallback.handle(context)).isEqualTo(FALLBACK_VALUE);
    }

    @Test
    void testGetType() {
        then(fallback.getType()).isEqualTo(FALLBACK_TO_VALUE);
    }

}
