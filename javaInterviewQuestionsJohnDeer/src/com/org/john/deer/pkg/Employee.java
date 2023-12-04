package com.org.john.deer.pkg;

public class Employee {

	private String eid;
	private String name;
	private Integer age;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String eid, String name, Integer age) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
