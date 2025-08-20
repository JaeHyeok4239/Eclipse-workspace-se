package com.itwill06.실행흐름;

public class AMain {

	public static void main(String[] args) {
		/*
		2.AMain 이라는 이름의 클래스작성

		2-1.AMain 클래스에 메인메쏘드 작성(생성)

		2-1-1.메인메쏘드에 코드작성
	   	- A객체생성		 
	   	- A객체멤버변수에 값대입
	   	- A객체멤버변수의 값출력
		 */
		  // 2-1-1. A객체생성
        A a1 = new A();
        
        // A객체 멤버변수에 값 대입
        a1.x = 100;
        a1.name = "홍길동";

        // A객체 멤버변수 값 출력
        System.out.println("a1.x = " + a1.x);
        System.out.println("a1.name = " + a1.name);

	}

}
