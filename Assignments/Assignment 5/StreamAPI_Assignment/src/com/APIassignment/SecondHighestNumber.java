package com.APIassignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(10, 20, 5, 25, 15, 20);

       
        Integer secondHighest = numbers.stream()
                                       .distinct()  //find out& remove the dupictes
                                       .sorted((a, b) -> b - a) 	//sort in reverse order	 
                                       .skip(1) //skip the first elmnt then we will be having the 
                                       .findFirst() .orElse(null);  //finding the 1st element after skipping or else null will print

    
        System.out.println("Second-highest number: " + secondHighest);
    }
}
