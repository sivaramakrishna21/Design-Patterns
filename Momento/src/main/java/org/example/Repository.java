package org.example;

public class Repository {



    public String commit(String message){
        return "1325325";
    }

    public void reset(String hash){
        System.out.println("reset done");
    }

    public void stageFile(String filename){
        System.out.println("staged");

    }

    public void unstageFile(String filename){
        System.out.println("unstaged");

    }

    static class Momento{

    }
}
