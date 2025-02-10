package com.APIassignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {
       
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5,6),
            Arrays.asList(7, 8,9,10,11)
        );


        List<Integer> flattenedList = listOfLists.stream()
                                                 .flatMap(List::stream) //flatten each nstd list into a stream 
                                                 .collect(Collectors.toList());//then collect all flattenOne in the form of list  
        
        System.out.println("Flattened List: " + flattenedList);
    }
}
