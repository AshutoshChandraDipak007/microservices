package com.org.john.deer.pkg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> listOfEmployee=Arrays.asList(
				new Employee("123","ashutosh1",22),
				new Employee("124","ashutosh2",23),
				new Employee("125","ashutosh3",24),
				new Employee("126","ashutosh4",26),
				new Employee("127","ashutosh",26),
				new Employee("128","ashutosh2",28),
				new Employee("129","ashutosh",29)
				);
		
		  listOfEmployee.stream()
		     .sorted(Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getAge))
		          .collect(Collectors.groupingBy(Employee::getName,Collectors.toList()))
		          .forEach((k,v)->{
		        	  System.out.println(" Key "+v+" V "+v);
		          });
		  
		Optional<Employee> em= listOfEmployee.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println(" em "+em);

	}

}
