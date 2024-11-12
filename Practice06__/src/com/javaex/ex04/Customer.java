package com.javaex.ex04;

public class Customer extends User {
	protected int point ; // 포인트점수

//	생성자
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}
	
	
//	getter / setter 
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
//	메서드
	@Override
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #포인트:%d" , id, password, name, point);
	}
}
