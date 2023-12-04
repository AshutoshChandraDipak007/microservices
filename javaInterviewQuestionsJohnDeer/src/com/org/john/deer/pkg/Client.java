package com.org.john.deer.pkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   // List<String> listOfString=Arrays.asList("ashutosh","dipak","chandra","ashutosh");
	    
	    List<Integer> listOfString=Arrays.asList(23,34,56,32);
	    //List<Integer> listOfString=listOfString.stream().distinct();
	    
	    Map<Integer, Long> mapOfString=listOfString.stream().collect(Collectors.groupingBy(
	    		Function.identity(),Collectors.counting()
	    		));
	    
	    mapOfString.values().stream().distinct().collect(null);
		
		Map<Integer,Employee> mapOfEmployee=new HashMap<Integer,Employee>();
		
		mapOfEmployee.put(1, new Employee("1","emp1",23));
		mapOfEmployee.put(2, new Employee("2","emp2",24));
		mapOfEmployee.put(3, new Employee("3","emp3",25));
		mapOfEmployee.forEach((k,v)->{
			System.out.println(" K "+k+" V "+v);
		});
		
		
		mapOfEmployee.values().stream().filter(emp->!emp.getEid().endsWith("2")).forEach(emp->{
			System.out.println(" Employee "+emp.getEid()+"  "+emp);
		});
	    
		
	    
	}

}
