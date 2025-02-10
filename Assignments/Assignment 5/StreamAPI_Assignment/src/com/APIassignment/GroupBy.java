package com.APIassignment;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("pavan","kalyan","premnath","sreenivasulu","bharathi");

        
        Map<Integer, List<String>> groupLength = words.stream()
                                                           .collect(Collectors.groupingBy(String::length));

    
        System.out.println("Words grouped by length: " + groupLength);
    }
}
