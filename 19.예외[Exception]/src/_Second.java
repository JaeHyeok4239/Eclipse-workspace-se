import java.io.FileInputStream;
import java.io.IOException;

public class _Second {
	
	
	public void method2() throws RuntimeException, IOException {
	
		System.out.println("\t\t Second.method2() 호출");
		
		/***********case1(RuntimeException)***********************************
		 * 1.JVM 예외상황을 감지하고 예외객체(NullPointerException)생성
		 * 2.JVM은 생성한예외객체를 반환방향으로 던진다.(throw)
		 * 3.실행중인쓰레드는 실행을멈추고 호출한곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진예외객체의 메세지를 출력한후 쓰레드종료(shut down)
		
		String str=null;
		int length=str.length();
		System.out.println("length:"+length);
		
		*/
		
		/***********case2(RuntimeException)***********************************
		
		 * 1.내가예외객체생성
		 * 2.내가 예외객체를 던진다.
		 * 3.실행중인쓰레드는 실행을멈추고 호출한곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진예외객체의 메세지를 출력한후 쓰레드종료(shut down)
		 */
		
		/*
		boolean b = true;
		if(b) {
			NullPointerException exception = new NullPointerException("널포인터에로사항발생");
		
					throw exception;
		}
		*/
		
		/*
		/****************** case3() ******************
		
		boolean b = true;
		if(b) {
			FileNotFoundException fiilFileNotFoundException = 
					new FileNotFoundException("파일이 존재하지 않아요");
			throw FileNotFoundException;
		}
		
		
		*/
		
		/************* case4( RuntimeException)[자바라이브러리사용] **************/
		
		FileInputStream fis = new FileInputStream("a.txt");
		int readByte = fis.read();
		
		System.out.println("\t\t Second.method2() 반환");
		return;
		
	
	}

}
