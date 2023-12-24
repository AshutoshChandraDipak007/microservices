package com.org.john.deer.pkg;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String myStringInput="My india is great My india is great Hello"; List
		 * listOfName=new ArrayList<>();
		 * 
		 * for(int i=0; i<myStringInput.length();i++) { char name=
		 * myStringInput.charAt(i); listOfName.add(name); }
		 * 
		 * //List<String>
		 * listOfName=Arrays.asList("Ashutosh","chandra","kumar","dipak","Ashutosh",
		 * "chandra","dipak");
		 * 
		 * listOfName.stream()
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting());
		 */
		
		 // 
		
		String[] listOfStrings="my name is ashutosh ashutosh".split(" ");
		
//		for(int i=0; i<listOfStrings.length; i++) {		
//			 int count=0;
//			 int nameSize=listOfStrings[i].length();	
//			for(int j=0; j<listOfStrings.length; j++) {				
//				if(listOfStrings[i].equalsIgnoreCase(listOfStrings[j])) {
//					count++;									
//				}				
//			}
//			System.out.println(" word "+listOfStrings[i]+" nameSize " +nameSize+" count "+count);
//		}		
		
	     List<String> listofA=Arrays.asList("my name is ashutosh ashutosh".split(" "));
	 	 listofA.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.toList())).forEach((k,v)->{
		    System.out.println(" K "+k+" v "+v);		     
		   });
	     		}
		
   
}
	


