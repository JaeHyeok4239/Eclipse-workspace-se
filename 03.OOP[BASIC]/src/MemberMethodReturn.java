
public class MemberMethodReturn {

	int memberField1;
	int memberField2;
	int memberField3;

	int method1() {
		System.out.println("\t int method1() 실행");
		int result = 12345 + 12345;
		System.out.println("\\t int method1() 실행종료 후 int 데이터반환");
		/*
		 * return <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>; - 호출한곳으로 실행흐름반환 - 호출한곳으로 데이타반환 -
		 * 반환할 데이타가 없는경우에는(void) return문생략이 가능하다. - 반환할 데이타가 있는경우에는(int,...) return문 반드시
		 * 기술하여야한다.
		 * 
		 */

		return result;

	}

	boolean method2() {
		System.out.println("\t boolean method2()실행");
		boolean isMarried = false;
		System.out.println("\t boolean method2()실행종료 후 boolean 데이터 반환");
		return isMarried;

	}

	int add(int a, int b) {
		System.out.println("\t int add(int a,int b)  실행");
		System.out.println("\t int add(int a,int b)  실행종료 후 int 데이터 반환");
		return a + b;
	}
	
	
	String hello(String name) {
		return name+"님 안녕하세요";
		
	}

}
