package com.org.john.deer.pkg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ZensarDSAQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee Integer id, String name , salary , dept
		// 2nd highest salary employee display dept wise
		// Employee emp=new Employee();

		List<EmployeeTest> listOfEmp=Arrays.asList(new EmployeeTest(123,"ashutosh",2345d,"IT"),
				new EmployeeTest(124,"chandra",2345d,"HR"),new EmployeeTest(123,"dipak",23456d,"IT"),
				new EmployeeTest(125,"ashutosh",23325d,"IT"),new EmployeeTest(126,"ashutosh",32345d,"CS"),
				new EmployeeTest(127,"ashutosh",23431d,"CS"),new EmployeeTest(128,"ashutosh",265345d,"HR")
				);
		
		
		listOfEmp.stream()
		.collect(Collectors.groupingBy(EmployeeTest::getDept,Collectors.toList()))
		.forEach((k,listOfempDeptWise)->{
	        	Optional<EmployeeTest> emp=listOfempDeptWise.stream().sorted(Comparator.comparingDouble(EmployeeTest::getSalary)
	        	.reversed()).skip(1).findFirst();
		        System.out.println(" 2nd highest salar for dept "+k+"  employee "+emp);
		});
	}

}

class EmployeeTest {
	private Integer id;
	private String name;
	private Double salary;
	private String dept;
	
	public EmployeeTest(Integer id, String name, Double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public EmployeeTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeTest [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

}
