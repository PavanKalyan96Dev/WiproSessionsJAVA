package com.HashMap;

import java.util.*;
public class hashmap {
    public static void main(String[] args) {
       
        Map<Integer, String> map = new HashMap<>();

   
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        //display the values
        System.out.println(map);
       
        //access the vlaues
        System.out.println("Value for key 2: " + map.get(2));

       
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

       
        System.out.println("Contains key 1 " + map.containsKey(1));
    }
}

/*
{1=One, 2=Two, 3=Three} 
Value for key 2: Two
Key: 1, Value: One
Key: 2, Value: Two
Key: 3, Value: Three
Contains key 1 true
		
		*/
