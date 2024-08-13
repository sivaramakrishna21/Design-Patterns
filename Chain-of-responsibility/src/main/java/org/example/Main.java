package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Logger logger=new ConsoleLogger(0);
        Logger logger1=new ErrorLogger(2);
        Logger logger2=new FileLogger(1);

        logger.setNextLogger(logger1);
        logger1.setNextLogger(logger2);
        logger.handleLog("This is Info", LogLevel.INFO.ordinal());
        logger.handleLog("This is WARNING", LogLevel.WARNING.ordinal());
        logger.handleLog("This is ERROR", LogLevel.ERROR.ordinal());

    }
}