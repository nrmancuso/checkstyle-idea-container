package com.puppycrawl.tools.checkstyle.utils.blockcommentposition;


public class InputBlockCommentPositionOnConstructor {
    /**
     * I'm a javadoc
     */
    public InputBlockCommentPositionOnConstructor(){

    }

    /**
     * I'm a javadoc
     */
    InputBlockCommentPositionOnConstructor(int a){

    }

    /**
     * I'm a javadoc
     */
    @Deprecated
    public InputBlockCommentPositionOnConstructor(String s){

    }

    /**
     * I'm a javadoc
     */
    <T> InputBlockCommentPositionOnConstructor(boolean b){

    }

    /**
     * I'm a javadoc
     */
    private <T> InputBlockCommentPositionOnConstructor(T t){

    }

}
