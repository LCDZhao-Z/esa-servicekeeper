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
package esa.servicekeeper.core.utils;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.assertj.core.api.BDDAssertions.then;

class BasicTest {

    @Test
    void testAppendNull() {
        then("name=" + null).isEqualTo("name=null");
    }

    @Test
    void testArraysIsNull() {
        then("names=" + Arrays.toString((Object[]) null)).isEqualTo("names=null");
    }

    @Test
    void testFallBackValueEquals() {
        then("FallBackValue").isEqualTo("FallBackValue");
    }

    @Test
    void testIgnoreExceptions() {
        then(new Class[0]).isEqualTo(new Class[0]);
    }

    @Test
    void testArrayEquals() {
        then(new Class[0]).isEqualTo(new Class[0]);
    }

    @Test
    void testDurationEquals() {
        then(Duration.ofSeconds(1L)).isEqualTo(Duration.ofSeconds(1L));
    }
}
