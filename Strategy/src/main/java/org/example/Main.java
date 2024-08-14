package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StrategyContext strategyContext=new StrategyContext(new MergeSort());
        strategyContext.sort(Arrays.asList(1,2,3,4,4,3,21));

        StrategyContext strategyContext1=new StrategyContext(new HeapSort());
        strategyContext.sort(Arrays.asList(1,2,3,4,4,3,21));

    }
}