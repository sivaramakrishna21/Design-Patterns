package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DataProcessor csvDataProcessor=new CSVDataProcessor();
        csvDataProcessor.execute();

        DataProcessor xmlDataProcessor=new XMLDataProcessor();
        xmlDataProcessor.execute();
    }
}