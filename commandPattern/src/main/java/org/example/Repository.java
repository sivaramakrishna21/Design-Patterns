package org.example;

import java.util.HashSet;
import java.util.Set;

// Originator
public class Repository {

    private Set<String> stagedFiles = new HashSet<>();
    private String lastCommitHash;

    // --- Real actions ---

    public String commit(String message){
        lastCommitHash = "hash-" + System.nanoTime();
        System.out.println("Committed: " + message);
        stagedFiles.clear();
        return lastCommitHash;
    }

    public void reset(String hash){
        System.out.println("reset to " + hash);
        lastCommitHash = hash;
    }

    public void stageFile(String filename){
        stagedFiles.add(filename);
        System.out.println("staged " + filename);
    }

    public void unstageFile(String filename){
        stagedFiles.remove(filename);
        System.out.println("unstaged " + filename);
    }

    // --- Memento Pattern ---

    public static class Memento {
        private final Set<String> stagedSnapshot;
        private final String commitSnapshot;

        private Memento(Set<String> stagedSnapshot, String commitSnapshot) {
            this.stagedSnapshot = stagedSnapshot;
            this.commitSnapshot = commitSnapshot;
        }
    }

    // Create snapshot
    public Memento createMemento() {
        return new Memento(new HashSet<>(stagedFiles), lastCommitHash);
    }

    // Restore snapshot
    public void restore(Memento memento) {
        stagedFiles = new HashSet<>(memento.stagedSnapshot);
        lastCommitHash = memento.commitSnapshot;
        System.out.println("Repository restored to previous snapshot.");
    }
}
