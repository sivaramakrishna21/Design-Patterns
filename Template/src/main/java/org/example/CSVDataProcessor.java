package org.example;

public class CSVDataProcessor extends DataProcessor{

    @Override
    protected void processData() {
        System.out.println("Process CSV data");
    }

    @Override
    protected void readData() {
        System.out.println("Read CSV data");
    }
}
