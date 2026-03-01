package org.example;

public class AddFileCommand implements GitCommand{

    private Repository repository;
    private String filename;

    public AddFileCommand(Repository repository, String filename) {
        this.repository = repository;
        this.filename = filename;
    }

    @Override
    public void execute() {
        repository.stageFile(filename);
    }

    @Override
    public void undo() {
        repository.unstageFile(filename);
        System.out.println("unstaged");
    }
}
