package com.itwill03.포함.배열포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember dvdMember = new DvdMember(1, "장재혁", "010-9999-8888", null);
		/*
		 * Dvd객체생성
		 */
		Dvd rentDvd = new Dvd(1, "아이언맨", "히어로");
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dvdMember.setRentDvd(rentDvd);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */

		dvdMember.print();
	}

}
