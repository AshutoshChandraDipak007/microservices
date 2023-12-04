package com.org.john.deer.pkg;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find second highest number
		//write own custom login not inbuild functions
		
		//Map<Integer, Integer> mapOfNumber=new 
		
		int numbers[]= {23,45,12,56,43,788,788};
		
		System.out.println(" Numbers "+numbers);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<numbers.length-1; j++) {
				if(numbers[j]>numbers[j+1]) {					
					int temp=numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j]=temp;
				}
				
			}
		}
		
		System.out.println(" Numbers "+numbers[1]);
		

	}

}
