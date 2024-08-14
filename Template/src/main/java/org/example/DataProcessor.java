package org.example;

public abstract class DataProcessor {
    public void execute(){
        readData();
        processData();
        writeData();
    }

    protected abstract void readData();
    protected abstract void processData();
    protected void writeData(){
        System.out.println("This is common step for all types");
    }
}
