package com.itwill03.포함.배열포함;
/*
- 캡슐화

<<속성>>
 회원번호
 회원이름
 전화번호
 빌린책
*/

/*
<<기능>>
  회원정보출력 
 */



public class BookMember {
	
	private int no;
	private String name;
	private String phoneNum;
	private Book book;
	

	
	
	
	
	public BookMember(int no, String name, String phoneNum, Book book){
	this.no = no;
	this.name = name;
	this.phoneNum = phoneNum;
	this.book = book;
	
		
	}
	
	
	
	public void print() {
		System.out.println("번호 : " + this.no);
		System.out.println("이름 : " + this.name);
		System.out.println("핸드폰번호 : " + this.phoneNum);
		this.book.print();
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



	public Book getBook() {
		return book;
	}



	public void setBook(Book book) {
		this.book = book;
	}
	
	


	

}
