package org.example;

public abstract class Logger {
    protected int loglevel;
    Logger nextLogger;

    public void setNextLogger(Logger logger){
        this.nextLogger=logger;
    }

    public void handleLog(String message,int logLevel){
        if(logLevel==this.loglevel){
            write(message);
        }
        else {
            nextLogger.handleLog(message,logLevel);
        }
    }
    protected abstract void write(String message);

}
