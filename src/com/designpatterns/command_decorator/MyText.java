package com.designpatterns.command_decorator;

import java.util.Stack;

/**
 * Created by Filip on 03.05.2017.
 */
public class MyText {
    public Stack<String> commandStack;

    MyText (){
        commandStack = new Stack<String>();
    }


}
