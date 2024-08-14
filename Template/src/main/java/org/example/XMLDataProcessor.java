package org.example;

public class XMLDataProcessor extends DataProcessor {
    @Override
    protected void processData() {
        System.out.println("Process XML data");
    }

    @Override
    protected void readData() {
        System.out.println("Read XML data");
    }
}
