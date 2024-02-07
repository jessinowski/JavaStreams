package com.github;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Step 1: Filter a list of numbers and only output the even numbers.
        List<Integer> numbers = List.of(5,4,6,8,12,54,587,12);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number%2 ==0)
                .toList();

        System.out.println(evenNumbers);

        // Step 2: Use 'map' and double each number in the list.
        List<Integer> doubledNumbers = evenNumbers.stream()
                .map(number -> number*2)
                .sorted()   // Step 3: Sort the list in ascending order.
                .toList();

        // Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
        int sum = doubledNumbers.stream()
                .reduce(0,Integer::sum);

        System.out.println(sum);

        // Step 5: Use 'forEach' and output each processed number.
        doubledNumbers.forEach(System.out::println);

        // Step 6: Collect the processed numbers into a new list using 'collect'.
        List<Integer> processedNumbers = doubledNumbers.stream()
                .collect(Collectors.toList());

        System.out.println(processedNumbers);
    }
}