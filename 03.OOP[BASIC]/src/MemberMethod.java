
public class MemberMethod {
	int member1;
	int member2;

	void method1() {
		System.out.println("\t void method() 실행시작");
		System.out.println("\t method stmt1");
		System.out.println("\t method stmt2");
		System.out.println("\t void method() 실행끝");
		/*
		 * << return >> - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야한다. - 실행흐름을 반환하는 문장이
		 * return문이다. - return 문을 만나면 실행흐름이 호출한곳으로 반환된다. - return type이 void 인경우에는 생략이
		 * 가능하다. - return문이 생략된경우에는 컴파일러가 자동으로 return문을 삽입하여준다.
		 */
		return;
	}

	void method2(int count) {
		System.out.println("\t void method2(int count)실행시작");
		System.out.println("\t method2블록의 파라메타로 선언된 로컬변수:" + count);
		int localVar = 111;
		System.out.println("\t method2블록안에서 선언된 로컬변수" + localVar);
		for (int i = 0; i < count; i++) {
			System.out.println("\t method stmt" + i);
		}
		System.out.println("\t void method2(int count)실행끝 실행흐름반환");
		return;

	}

	void method3(String msg, int count) {
		System.out.println("void method3(String msg,int count) 실행시작");
		for (int i = 0; i < count; i++) {
			System.out.println("\t\t" + msg);
		}
		System.out.println("\t void method3(String msg,int count)실행끝 실행흐름반환");
		return;
	}

	void method4(String name, String msg, int count) {
		System.out.println("\t void method4(String name,String msg,int count)");
		for (int i = 0; i < count; i++) {
			System.out.println();
		}
		System.out.println("\t void method4(String name,String msg,int count)");

	}
}