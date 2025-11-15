package org.example;

import java.util.Stack;

public class GitCLI {
    private Stack<GitCommand> history=new Stack<>();

    public void executeCommand(GitCommand command){
        command.execute();
        history.push(command);
    }

    public void undo(){
        if(!history.isEmpty()){
            GitCommand command=history.pop();
            command.undo();
        }
    }
}
