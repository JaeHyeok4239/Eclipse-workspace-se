
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
  		result = a + b;
		System.out.println("a+b --> "+result);
		result = a - b;
		System.out.println("a-b --> "+result);
		result = a * b;
		System.out.println("a*b --> "+result);
		result = a / b;
		System.out.println("a/b --> "+result);
		double dresult=a/b;
		System.out.println("a/b --> "+dresult); 
		dresult = (double)a/b;
		System.out.println("a/b --> "+dresult);
		
		
		int number=13;
		
		result=number%4;
		System.out.println("result변수에는 4로나눈 나머지값이 대입:"+result);
		
		
		int year=2025;
		result = year % 4;
		System.out.println("2025 % 4 -->"+result);
		result = year % 100;
		System.out.println("2025 % 100 -->"+result);
		result = year % 400;
		System.out.println("2025 % 400 -->"+result);
		
		int no=34;
		result=no%2;
		System.out.println("34 % 2"+result);
		System.out.println("-------문자연산-------");
		char ca='A';
		char cz='Z';
		int numOfAlphabet = cz-ca+1;
		System.out.println("알파벳 대문자수"+numOfAlphabet);
		int numberOfHangul='힣'-'가'+1;
		System.out.println("한글 글자수:"+numberOfHangul);
		char cb = 'A'+1;
		System.out.println(" 'A' + 1 -->"+cb);
		
		int kor,eng,math;
		kor=89;
		eng=90;
		math=96;
		int tot=kor+eng+math;
		double avg=tot/3.0;
		
		System.out.printf("%d \t %8s %d %d %d %d %6.2f \n",1,"KIM",kor,eng,math,tot,avg);
		System.out.printf("%d %8s %d %d %d %d %6.2f \n",1,"KIM",kor,eng,math,tot,avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
