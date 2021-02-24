package com.park.blog2.test;

public class Member {
	private int id; // 이 값은 함부로 못바꾸고 메소드를 통해 바꿔야한다.
	private String username;
	private String password;
	private String email;
	
	
	// 생성자 자동생성
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	// 게터 세터 자동생성
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
