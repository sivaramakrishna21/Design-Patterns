package org.example;

public class ConsoleLogger extends Logger{

    public ConsoleLogger(int level) {
        this.loglevel=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console Logger "+ message);
    }
}
