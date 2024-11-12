package com.javaex.ex04;

public abstract class User {
	protected String id; // 아이디
	protected String password; //패스워드
	protected String name; //이름
	
//	 생성자	 
	 
	 public User(String id, String password, String name) {
		 this.id = id;
		 this.password = password;
		 this.name = name;
	 }

	 
//	 getter / setter 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	
//	추상 메서드
	public abstract void showInfo();
	 
}
