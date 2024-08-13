package org.example;

public class ErrorLogger extends Logger{

    public ErrorLogger(int level) {
        this.loglevel=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger "+message);
    }
}
