package com.javaex.ex04;

public class Employee extends User {

	protected int salary; //  급여
	
	//생성자
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	//getter / setter

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메서드
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #월급:%d", id, password,name,salary);
	}
	
}
