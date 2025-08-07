import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 임력하세요.");
		/*
		 * 키보드로부터 데이타를 입력받기위해서 실행흐름대기(blocking)
		 */
		
		String string = scanner.next();
		System.out.println("입력받은 문자열:"+string);
		System.out.println("정수를 입력하세요.");
		
		/*
		 * 키보드로부터 데이타를 입력받기위해서 실행흐름대기(blocking)
		 */
		
		int no=scanner.nextInt();
		
		System.out.println("입력받은정수."+no);
		System.out.println("실수를 입력하세요.");
		
		/*
		 * 키보드로부터 데이타를 입력받기위해서 실행흐름대기(blocking)
		 */
		
		double d = scanner.nextDouble();
		System.out.println("입력받은실수."+d);
		
		
		System.out.println("국어 영어 수학 점수를 입력하세요.");
		int kor=scanner.nextInt();
		int eng=scanner.nextInt();
		int math=scanner.nextInt();

		int tot=kor+eng+math;
		double avg=tot/3.00;
		System.out.printf("%d %d %d %d %6.2f",kor,eng,math,tot,avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
