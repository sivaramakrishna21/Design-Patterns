package org.example;

import java.util.Stack;

public class GitCLI {

    private static class CommandEntry {
        GitCommand command;
        Repository.Memento memento;

        CommandEntry(GitCommand command, Repository.Memento memento){
            this.command = command;
            this.memento = memento;
        }
    }

    private Stack<CommandEntry> history = new Stack<>();

    private Repository repository;

    public GitCLI(Repository repository) {
        this.repository = repository;
    }

    public void executeCommand(GitCommand command){
        // Save the snapshot BEFORE running command
        Repository.Memento memento = repository.createMemento();

        command.execute();
        history.push(new CommandEntry(command, memento));
    }

    public void undo(){
        if(!history.isEmpty()){
            CommandEntry entry = history.pop();

            // restore snapshot
            repository.restore(entry.memento);

            // optional - still call command.undo()
            entry.command.undo();
        }
    }
}
