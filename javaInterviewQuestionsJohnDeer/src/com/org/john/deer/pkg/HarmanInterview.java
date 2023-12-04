package com.org.john.deer.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HarmanInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		// No array , sorting, inbuild
		
		int[] array = {4,-3,8,9,-1,5,2,-10,-11,45};
		int temp=0;
		for(int i=0; i<array.length;i++) {		  
			for(int j=0; j<array.length-1;j++) {
				if(array[j+1]>array[j]) {
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0; i<array.length;i++) {
			System.out.println(" arrays elements "+array[i]);
		}

		String names="ashutoshasd fine thanks chandra dipak Hi Ashutosh Heloo chandra dipak Hi Ashutosh Heloo";
		// output 
		
		
		
		
		List<String> listOfstring=Arrays.asList(names.split(" "));
		System.out.println(" listOfstring "+listOfstring);
		
		Map<String ,Long> mapOfString=listOfstring.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(" first value "+mapOfString.keySet().toArray()[0]);
	
	}

}
