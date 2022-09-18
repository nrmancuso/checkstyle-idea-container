/*
MutableException
format = ^.*Failure$
extendedClassNameFormat = ^.*ThreadDeath$


*/

package com.puppycrawl.tools.checkstyle.checks.design.mutableexception;

public class InputMutableException3 {
    public class FooException extends Exception {
        private final int finalErrorCode;
        private int errorCode = 1;

        public FooException() {
            finalErrorCode = 1;
        }

        public class FooExceptionThisIsNot extends RuntimeException {
            private final int finalErrorCode;
            private int errorCode = 1;
            /** constructor */
            public FooExceptionThisIsNot() {
                finalErrorCode = 1;
            }
        }
    }

    public class BarError extends Throwable {
        private int errorCode;
    }

    public class BazDoesNotExtendError {
        private int errorCode;
    }

    public class CustomProblem extends ThreadDeath {
        private int errorCode;

        public class CustomFailure extends ThreadDeath {
            private int errorCode; // violation
            public void someMethod() {
                if(true) {
                    final int i = 0;
                }
            }
        }
    }

    class CustomException extends Exception {}

    class CustomMutableException extends Exception {
        int errorCode;
    }

    class ExampleException extends Exception {
        public void test() {
            Throwable cause = super.getCause();
            if (!(cause instanceof java.io.IOException))
                throw new IllegalStateException("Test");
        }
    }
}
