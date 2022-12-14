/*
CommentsIndentation
tokens = (default)SINGLE_LINE_COMMENT, BLOCK_COMMENT_BEGIN


*/

package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

public class InputCommentsIndentationCheckWithEmoji {

    public void myMethod() {
        String breaks = "J"
        // violation '.* incorrect .* level 8, expected is 16, .* same .* as line 15.'
                + "ð¥³"
                // it is OK ð
                + "ð¥³VASdð¥³"
                + "A" + "ð¥³"
                // it is OK ð
                ;
    }

    public void test() {
        String a = "ð¥³";
            // violation '.* incorrect .* level 12, expected is 8, .* same .* as line 24.'
    }
        // violation '.* incorrect .* level 8, expected is 4, .* same .* as line 29.'

    String s = String.format(java.util.Locale.ENGLISH, " ð¥³ ð¥³ ð¥³asdda   ð¥³"
                    + "ð" + "ð  ðð       ",
            " ");
    // OK ð¥³

    public void test2() {
        String a = "ð¥³";
        switch (a) {
            // ð¥³ comment
            case "1":
                break;
                // ð comment ð
            case "2":
                    // comment  ðð»
                // ðð» comment
            default: a = "ð".
                        toString();
                // violation '.* incorrect .* level 16, expected is 24, .* same .* as line 45.'
        }
    }

    private void test3() { // trailing ðð»
        if ("ð".equals("ð")) // trailing ðð» comment
        {
            // some comment  ð
        }
        if ("ð".equals("ðsad")) { // trailing comment ð¤

        }
        /** ð¤
         *           ð¤
         */
    }

    private void test4() {
        String a = "ð";
        a.toString()
                // comment ðð»
                .toLowerCase()
                // comment ðð»
                .charAt(0);
            // violation '.* incorrect .* level 12, expected is 8, .* same .* as line 72.'

        try {
            assert a.equals("ð") == true;
        // violation '.* incorrect .* level 8, expected is 12, .* same .* as line 73.'
        }
        catch (Exception ex) {

        } // ok ðð»
        finally {

        }
    }

    public void test5() {
            // comment
            // ... ð§
            // block
            // violation '.* incorrect .* level 12, expected is 8, .* same .* as line 90.'
        // comment
        String someStr = "ððð";
    }

    private void test6() {
        if (true) {
            /* some ðð» */
            String k = "ððð";
            // violation below '.* incorrect .* level 16, expected is 12,.* same .* as line 99.'
                /* hello there some comment with emoji ð */
            int b = Integer.parseInt("ððð");
                /* // violation '.* incorrect .* level 16, expected is 12, .* same .* as line 102.'
                * */
            double d; /* trailing comment */
                /* // violation '.* incorrect .* level 16, expected is 12, .* same .* as line 116.'
             *ð
                */

            /* my comment*/
            /*
             * ð¤ð»
             *
             *  some            ð§
             *  ð§ /
            /*
             * comment ð¤©
             */
            String x = "ðmkuhyg";
        }
    }
}

