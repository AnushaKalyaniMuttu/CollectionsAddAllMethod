package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAddAllMethod {

	public static void main(String[] args) {
	/*
	 * Collections.addAll() adds array elements to a list
	 * takes a COLLECTION OF LIST OF ELEMENTS and ARRAY as an input
	 */

		List<String> destinationList = new ArrayList<>();
        
        String[] sourceArray = {"apple", "banana", "cherry"};
        
        List<String> sourceList = new ArrayList<>();
        sourceList.add("grape");
        sourceList.add("orange");
        
        // Adding elements from an array to the destination list
        Collections.addAll(destinationList, sourceArray);
        
        // Adding elements from a list to the destination list 
        Collections.addAll(destinationList, sourceList.toArray(new String[0]));
        
        System.out.println("Destination List: " + destinationList);
	
    
      }
}
}
