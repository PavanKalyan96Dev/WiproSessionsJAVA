package com.APIassignment;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(2,4,2,5,6,2,5,3);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
