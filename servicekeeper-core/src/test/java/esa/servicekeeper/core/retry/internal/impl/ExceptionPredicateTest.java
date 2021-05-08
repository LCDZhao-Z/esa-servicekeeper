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
package esa.servicekeeper.core.retry.internal.impl;

import esa.servicekeeper.core.retry.RetryContext;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExceptionPredicateTest {

    @Test
    void testDefaultMaxAttempts() {
        final ExceptionPredicate predicate = new ExceptionPredicate(0);
        final RetryContext context = mock(RetryContext.class);
        when(context.getLastThrowable()).thenReturn(new RuntimeException());
        when(context.getRetriedCount()).thenReturn(2).thenReturn(3);

        then(predicate.canRetry(context)).isTrue();
        then(predicate.canRetry(context)).isFalse();
    }

    @Test
    void testCanRetry() {
        final ExceptionPredicate predicate = new ExceptionPredicate(4);
        final RetryContext context = mock(RetryContext.class);

        when(context.getLastThrowable()).thenReturn(null);
        then(predicate.canRetry(context)).isFalse();

        when(context.getLastThrowable()).thenReturn(new IllegalArgumentException());
        when(context.getRetriedCount()).thenReturn(3).thenReturn(4);
        then(predicate.canRetry(context)).isTrue();
        then(predicate.canRetry(context)).isFalse();
    }
}
