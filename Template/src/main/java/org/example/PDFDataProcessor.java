package org.example;

public class PDFDataProcessor extends DataProcessor{
    @Override
    protected void processData() {
        System.out.println("Process PDF data");
    }

    @Override
    protected void readData() {
        System.out.println("Read PDF data");
    }
}
