package com.designpatterns.command_decorator;

public class Editor {
    private Command command;

    public void setCommand(Command com){
        command = com;
    }

    public void doCommand (){
        command.execute();
    }
    public void undoCommand (){
        command.undo();
    }


}
