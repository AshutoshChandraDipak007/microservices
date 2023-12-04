package com.org.john.deer.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LTIMindtreeTechQsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a program to find duplicate elements in a given integers 
		// list[1,2,3,4,5,6,2,5,6] in java using Stream functions?
		
		 System.out.println(" ########################### Duplicate values ########################### ");
		List<Integer> listOfIntegers=Arrays.asList(1,2,3,4,5,6,2,5,6);
				
		listOfIntegers.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((k,v)->{
			if(v>1)
		    System.out.println(" duplicates value "+k);
		});
	
		System.out.println(" ########################### reverse string ################################## ");
		String [] names="Ashutosh chandra dipak".split(" ");
		String temp="";
		for(int i=0; i<names.length; i++) {					
			String worlds=names[names.length-1-i];
			for(int j=0; j<worlds.length(); j++) {	
				temp=temp+worlds.charAt(worlds.length()-1-j);
			}
			temp=temp+" ";
		}
		System.out.println(temp);
	}	

}
