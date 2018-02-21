/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bval.extras.constraints.checkdigit;

import javax.validation.ConstraintValidator;
import java.lang.annotation.Annotation;

/**
 * Luhn Check Digit Test.
 */
public class LuhnCheckDigitTest extends AbstractCheckDigitTest {

    private static final String VALID_VISA       = "4417123456789113";

    private static final String VALID_SHORT_VISA = "4222222222222";

    private static final String VALID_AMEX       = "378282246310005";

    private static final String VALID_MASTERCARD = "5105105105105100";

    private static final String VALID_DISCOVER   = "6011000990139424";

    private static final String VALID_DINERS     = "30569309025904";

    @Override
    protected ConstraintValidator<? extends Annotation, ? super String> getConstraint() {
        return new LuhnValidator();
    }

    @Override
    protected String[] getValid() {
        return new String[] {
            VALID_VISA,
            VALID_SHORT_VISA,
            VALID_AMEX,
            VALID_MASTERCARD,
            VALID_DISCOVER,
            VALID_DINERS
        };
    }

}
