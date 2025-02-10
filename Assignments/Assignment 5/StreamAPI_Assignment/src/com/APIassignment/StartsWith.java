package com.APIassignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("web", "tech", "wipro", "ademy");
        List<String> name = strList.stream()
                                   .filter(s -> s.startsWith("a"))  
                                   .collect(Collectors.toList());     
        System.out.println(name);
    }
}
