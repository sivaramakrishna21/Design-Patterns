package org.example;

public class CommitCommand implements GitCommand{

    private Repository repository;
    private String message;
    private String commitHash;

    public CommitCommand(Repository repository, String message) {
        this.repository = repository;
        this.message = message;
    }

    @Override
    public void undo() {
        repository.reset(commitHash);
        System.out.println("reverted");
    }

    @Override
    public void execute() {
        System.out.printf("commit entry");
        commitHash=repository.commit(message);
        System.out.println("commit successful");
    }
}
