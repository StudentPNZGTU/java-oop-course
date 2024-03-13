package edu.penzgtu.oop;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(3);

        MergeSort<Integer> integerMergeSort = new MergeSort<>();
        integerMergeSort.sort(integerList);
        System.out.println("Sorted Integer List: " + integerList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.5);
        doubleList.add(1.2);
        doubleList.add(5.8);
        doubleList.add(2.1);
        doubleList.add(4.3);

        MergeSort<Double> doubleMergeSort = new MergeSort<>();
        doubleMergeSort.sort(doubleList);
        System.out.println("Sorted Double List: " + doubleList);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("grape");
        stringList.add("cherry");

        MergeSort<String> stringMergeSort = new MergeSort<>();
        stringMergeSort.sort(stringList);
        System.out.println("Sorted String List: " + stringList);
    }
}
