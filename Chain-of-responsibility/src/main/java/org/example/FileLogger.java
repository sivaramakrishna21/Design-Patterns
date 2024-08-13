package org.example;

public class FileLogger extends Logger{
    public FileLogger(int level) {
        this.loglevel=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File Logger "+message);
    }
}
