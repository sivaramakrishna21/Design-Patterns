package org.example;

import java.util.ArrayList;
import java.util.List;

public class StrategyContext {

    SortingStrategy sortingStrategy;

    public StrategyContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(List<Integer> arr){
        sortingStrategy.sort(arr);
    }
}
