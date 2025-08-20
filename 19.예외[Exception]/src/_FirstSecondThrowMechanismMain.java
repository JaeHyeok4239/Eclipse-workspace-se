import java.io.FileNotFoundException;
import java.io.IOException;

public class _FirstSecondThrowMechanismMain {

	public static void main(String[] args) throws RuntimeException,FileNotFoundException,IOException {
		
		System.out.println("1.main 실행흐름 start");
		
		_First first = new _First();
		
		System.out.println("2.main 실행흐름 first.method1()에 호출 전");
		
		first.method1();
		
		System.out.println("3.main 실행흐름 first.method1()에 호출 후");

		System.out.println("4.main 실행흐름 JVM 반환");
		
		return;
		
		

	}

}
