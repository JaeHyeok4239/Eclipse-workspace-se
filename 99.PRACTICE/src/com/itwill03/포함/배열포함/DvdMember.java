package com.itwill03.포함.배열포함;

public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int no;
	private String name;
	private String phoneNum;
	private Dvd rentDvd;
	
	
	public DvdMember(int no, String name, String phoneNum, Dvd rentDvd) {
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
		this.rentDvd = rentDvd;
	}
	

	//빌린dvd
	/*
	<<기능>>
	  회원정보출력 
	 */

	public void print() {
		System.out.println("회원번호 : " + this.no);
		System.out.println("회원이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNum);
		System.out.println("빌린DVD : " + this.rentDvd);
		this.rentDvd.print();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Dvd getRentDvd() {
		return rentDvd;
	}
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	
}
