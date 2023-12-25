package com.org.arrays.questions;

import java.util.Arrays;
import java.util.List;

public class UnionAndIntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer arr1[]= { 4, 5, 6, 2, 8, 9};
       Integer arr2[]= {14,34,4,5,9};
       
       // Union {-1,-3, -7, 4, 5, 6, 2, 8,9,14,34,};
       List<Integer> list=Arrays.asList(arr1);
       
       Arrays.asList(arr1).forEach(item->{
    	   if(list.contains(item)) {
    		   list.add(item);
    	   }
       });
       
       list.forEach(item->{
           System.out.println(" item "+item);
       });
       
	}

}
