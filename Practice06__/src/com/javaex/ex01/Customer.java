package com.javaex.ex01;

public class Customer extends Person{
	
	protected int cNo;
	protected int point;
	
	public Customer() {}
	
	public Customer(String name, String hp, int cNo, int point) {
		this.name = name;
		this.hp = hp;
		this.cNo = cNo;
		this.point = point;
	}
	
//	*getter / setter
	
	public int getCNo() {
		return cNo;
	}
	
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	@Override
	public void showInfo() {
		System.out.println("#이름: " + name + ", #핸드폰: " + hp + ", #고객번호:" + cNo + ", #포인트점수:" + point);
	}
	
	
}
