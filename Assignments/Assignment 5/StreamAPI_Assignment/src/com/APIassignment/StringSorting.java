package com.APIassignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorting {
    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("pavan","kalyan","premnath","sreenivasulu","bharathi");
        List<String> ascending = strings.stream()
                                        .sorted()  
                                        .collect(Collectors.toList());
        List<String> descending = strings.stream() .sorted((s1, s2) -> s2.compareTo(s1)) 
                                         .collect(Collectors.toList());
        System.out.println("Ascending Order: " + ascending);
        System.out.println("Descending Order: " + descending);
    }
}
