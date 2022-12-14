/*
CommentsIndentation
tokens = (default)SINGLE_LINE_COMMENT, BLOCK_COMMENT_BEGIN


*/

package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

public class InputCommentsIndentationInSwitchBlock {

    private static void fooSwitch() {
        switch("") {
            case "0": //some comment
            case "1":
                // my comment
                foo1();
                break;
            case "2":
                // my comment
                //comment
                foo1();
                // comment
                break;
            case "3":
                // violation below '.* incorrect .* level 12, expected is 16,.* same.* as line 28.'
            /* violation */
                foo1();
                /* com */
                break;
            case "5":
                foo1();
                   // violation '.* incorrect .* level 19, expected is 16, 12, .* as line 32, 34.'
            case "6":
                int k = 7;
                // fall through
            case "7":
                if (true) {}
                   // violation '.* incorrect .* level 19, expected is 16, 12, .* as line 38, 40.'
            case "8":
                break;
            case "9":
                foo1();
                // fall through
            case "10": {
                if (true) {}
                // fall through
            }
            case "11": {
            // fall through
            }
            case "28": {
                // fall through
            }
            case "12": {
      // violation '.* incorrect .* level 6, expected is 16, .* same .* as line 57.'
                int i;
            }
            case "13": {
                       // some comment in empty case block
            }
            case "14": {
        // violation '.* incorrect .* level 8, expected is 12, .* same .* as line 64.'
            }
            case "15": {
                foo1();
                      // violation '.* incorrect .* level 22, expected is 16,.* same.* as line 66.'
            }
            case "16": {
                int a;
            }
            // fall through
            case "17": {
                int a;
            }
              // violation '.* incorrect .* level 14, expected is 12, 16,.* same.* as line 73, 77.'
                case "18": { System.lineSeparator();
                }   // trailing comment
            case "19":
                // comment
            case "20":
            // comment
            case "21":
            default:
                // comment
                break;
        }
    }

    private static void foo1() {
        if (true) {
            switch(1) {
                case 0:

                case 1:
                        // violation '.* incorrect .* level 24, expected is 20,.*same.* as line 97.'
                    int b = 10;
                default:
                 // comment
            }

        }
    }

    public void fooDotInCaseBlock() {
        int i = 0;
        String s = "";

        switch (i) {
            case -2:
                // what
                i++;
                // no break here
            case 0:
                // what
                s.indexOf("ignore");
                // no break here
            case -1:
                 // what
                 s.indexOf("no way");
               // violation '.* incorrect.*level 15, expected is 17, 12,.*same.* as line 120, 122.'
            case 1:
            case 2:
                i--;
                // no break here
            case 3: { }
            // fall through


        }

        String breaks = ""
        // violation '.* incorrect .* level 8, expected is 12, .* same .* as line 134.'
            + "</table>"
            // middle
            + ""
        // end
        ;
    }

    public void foo2() {
        int a = 1;
        switch (a) {
            case 1:
            default:
    // violation '.* incorrect .* level 4, expected is 8, .* same .* as line 147.'
        }
    }

    public void foo3() {
        int a = 1;
        switch (a) {
            case 1:
            default:

                // comment
        }
    }

    public void foo4() {
        int a = 1;
        switch (a) {
            case 1:
                int b;
                  // violation '.* incorrect .* level 18, expected is 16, 12, .* as line 164, 166.'
            default:
        }
    }

    public void foo5() {
        int a = 1;
        switch (a) {
            case 1:
                int b;
            // comment
            default:
        }
    }

    public void foo6() {
        int a = 1;
        switch (a) {
            case 1:
                int b;
                // comment
            default:
        }
    }

    public void foo7() {
        int a = 2;
        String s = "";
        switch (a) {
            // comment
            // comment
            // comment
            case 1:
            case 2:
                // comment
                // comment
                foo1();
                // comment
            case 3:
                // comment
                // comment
                // comment
            case 4:
    // violation '.* incorrect .* level 4, expected is 12, 12, .* same .* as line 207, 209.'
            case 5:
                s.toString().toString().toString();
                      // violation '.*incorrect.* level 22, expected is 16, 12,.*as line 210, 214.'
                    // violation '.* incorrect .* level 20, expected is 16, 12,.*as line 210, 214.'
                 // violation '.* incorrect .* level 17, expected is 16, 12, .* as line 210, 214.'
            default:
        }
    }

    public void foo8() {
        int a = 2;
        String s = "";
        switch (a) {
            // comment
            // comment
            // comment
            case 1:
            case 2:
                // comment
                // comment
                foo1();
                // comment
            case 3:
                // comment
                // comment
                s.toString().toString().toString();
                // comment
            case 4:
      // violation '.* incorrect .* level 6, expected is 12, 12, .* same .* as line 236, 238.'
            default:
        }
    }

    public void foo9() {
        int a = 5;
        switch (a) {
            case 1:
            case 2:
                // comment
        }
    }

    public void foo10() {
        int a = 5;
        switch (a) {
            case 1:
            default:
                // comment
        }
    }

    public void foo11() {
        int a = 5;
        switch (a) {
            case 1:
            case 2:
                // comment
        }
    }

    public void foo12() {
        int a = 5;
        switch (a) {
            // comment
            case 1:
        }
    }

    public void foo13() {
        int a = 5;
        switch (a) {
            case 1:
                /* comment */
            case 2:
                hashCode();
           /* // violation '.* incorrect .* level 11, expected is 16, 12, .* as line 283, 287.'
            violation
            */
            case 3: // comment
                hashCode();
           // violation '.* incorrect .* level 11, expected is 16, 12,.* same .* as line 288, 290.'
            case 4: // comment
                if (true) {

                }
                else {

                }
                // comment
            case 5:
                String s = ""
                    + 1
                    + "123";
                break;
                // comment
            case 6:
                String q = ""
                    + 1
                    + "123";
                // comment
            case 7:
                break;
        }
    }

    public void foo14() {
        int a = 1;
        switch (a) {
            case 1:
            default:
// violation '.* incorrect .* level 0, expected is 8, .* same .* as line 320.'
        }
    }

    public void foo15() {
        int a = 1;
        switch (a) {
            case 1:
            default:
        // comment
        }
    }
}
