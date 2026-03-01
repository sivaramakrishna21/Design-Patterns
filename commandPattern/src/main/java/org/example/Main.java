package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Repository repository=new Repository();
        GitCLI gitCLI=new GitCLI(repository);

        GitCommand command1=new AddFileCommand(repository,"test");
        GitCommand command2=new CommitCommand(repository,"te3st");
        gitCLI.executeCommand(command1);
        gitCLI.executeCommand(command2);

        gitCLI.undo();
        gitCLI.undo();

    }
}