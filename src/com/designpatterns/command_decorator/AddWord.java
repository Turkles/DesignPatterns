package com.designpatterns.command_decorator;

/**
 * Created by Filip on 03.05.2017.
 */
public class AddWord implements Command{

    private MyText myTempText;
    private boolean added = false;
    private String wordToAdd = "";
    private String tempWord ="";

    AddWord( MyText text ){
        myTempText = text;
    }

    public void setWordToAdd(String s){
        wordToAdd = s;
    }
    @Override
    public void execute() {
        if( !wordToAdd.equals("")){

            myTempText.commandStack.add(wordToAdd);
            added = true;
        }
    }

    @Override
    public void undo() {
        if( added ){
            tempWord = myTempText.commandStack.pop();
        } else {
            System.out.println("No word added");
        }

    }


}
