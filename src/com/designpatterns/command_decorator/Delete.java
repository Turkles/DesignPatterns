package com.designpatterns.command_decorator;

/**
 * Created by Filip on 03.05.2017.
 */
public class Delete implements Command {

    private MyText myTempText;
    private String tempWord = "";

    Delete(MyText text ){
        myTempText = text;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }


}
