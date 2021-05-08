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
package esa.servicekeeper.core.common;

import java.lang.reflect.Method;

/**
 * @deprecated since 1.5.0
 * @see OriginalInvocation
 */
@Deprecated
public class OriginalInvocationInfo extends OriginalInvocation {

    public OriginalInvocationInfo(Class<?> returnType, Class<?>[] parameterTypes) {
        super(returnType, parameterTypes);
    }

    public OriginalInvocationInfo(Object target, Method method) {
        super(target, method);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
