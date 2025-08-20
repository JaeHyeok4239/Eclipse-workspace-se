package com.itwill06.실행흐름;

public class B {
	/*
	 * 	1.B 라는 이름의 클래스작성

 		1-1. B 클래스안에 멤버변수 2개선언(정의): 이름 x,y 
 		1-2. B 클래스안에 멤버메쏘드 m1,m2 2개선언(정의)
 
    	- 멤버메쏘드내용은 
        	System.out.println("m1호출");	 
        	System.out.println("m2호출");	
	 */
	 // 1-1. 멤버변수 2개 선언
    int x;
    int y;

    // 1-2. 멤버메쏘드 2개 선언
    public void m1() {
        System.out.println("m1호출");
    }

    public void m2() {
        System.out.println("m2호출");

}
}