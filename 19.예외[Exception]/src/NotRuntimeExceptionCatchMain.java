import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionCatchMain {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException{
		
		System.out.println("stmt1");
		Socket socket = new Socket("www.daum.net",80);
		System.out.println(socket);
		System.out.println("stmt2");
		
		/*
		 * 예외발생예상코드( ClassNotFoundException )
		 */
		
		
		
		Class aClass = Class.forName("AClass");
		System.out.println(aClass);
		
		/*
		 * 예외발생예상코드 ( ArithmeticException [ RuntimeException ] 
		 * RuntimeException 은 생략되어 있다. 메인문에 
		 */

		
		int result = 3/(int)(Math.random()*2);
		System.out.println("stmt3");
		System.out.println("jvm return");
		
		
		
		
		
		
		
		
		
		
		
	}

}
