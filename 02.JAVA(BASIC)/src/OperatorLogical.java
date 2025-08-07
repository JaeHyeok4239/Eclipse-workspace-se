
public class OperatorLogical {

	public static void main(String[] args) {
		/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) 
		   - 좌우측의항이 논리형변수(데이타)이다.
           - 결과도 논리형데이타이다.
		     ex> true || false, false && false
         */
		
		boolean b1,b2,b3,b4;
		boolean result;
		
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		
		 /*
		 *  || 논리합(logical or) --> false || false인경우에만 false를 반환
		 */
		
		result = b1 || b2;
	    System.out.println("true || ture -->"+result);
		result = b1 || b3;
	    System.out.println("true || ture -->"+result);	
		result = b3 || b1;
		System.out.println("true || ture -->"+result);
		result = b3 || b4;
		System.out.println("true || ture -->"+result);
		
		
		
		
		result = b1 && b2;
		System.out.println("true && true -->"+result);
		result = b1 && b3;
		System.out.println("true && false -->"+result);
		result = b3 && b1;
		System.out.println("false && true -->"+result);
		result = b3 && b4;
		System.out.println("false && false -->"+result);
		
		
		
		int kor=89;
		int eng=90;
		
		boolean condition1 = kor>=0;
		boolean condition2 = kor<=0;
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수유효성여부:"+isValidScore);
		
		System.out.println(">> A대학 국어,영어점수중에서 하나라도 90점이상이면 합격");
		boolean isPass1 = (kor>=90) || (eng>=90);
		System.out.println("\t A대학합격여부:"+isPass1);
		System.out.println(">> B대학 국어,영어점수중 모두 90점이상이어야 합격");
		boolean isPass2 = (kor >= 90) && (eng >= 90);
		System.out.println("\t B대학합격여부:"+isPass2);
		
		System.out.println("-----배수판별-----");
		int number=12;
		boolean isMultiple3 = (number%3) ==0; 
		System.out.println("3의배수여부:"+isMultiple3);
		boolean isMultiple4 = (number%4) ==0; 
		System.out.println("4의배수여부:"+isMultiple4);
		boolean isMultiple34 = isMultiple3 && isMultiple4;
		System.out.println("3과4의 공통배수여부:"+isMultiple34);
		/*
		 * Quiz: 윤년여부판단 
		 * - 4의배수(4로나누어떨어지는수)이면서 
		 * - 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 * - 400의배수(400로나누어떨어지는수)가 윤년
		 */
		System.out.println("--------윤년여부판단--------------");
		int year=2025;
		boolean isLeapYear= (year%4==0)&&(year%100!=0)||(year%400==0);
		System.out.println("윤년여부:"+isLeapYear);
		boolean isLeapYear1 = (year%4) ==0;
		System.out.println("4의배수여부:"+isLeapYear1);
		boolean isLeapYear2 = (year%100) !=0;
		System.out.println("100의배수여부:"+isLeapYear2);
		boolean isLeapYear3 = (year%400)  ==0;
		System.out.println("400의배수여부:"+isLeapYear3);
		
		
		
		
		/*
		 * 영문대문자여부
		 *  A ~ Z
		 */
		char c = 's';
		boolean isCapitalLetter = (c >= 'A') && (c <= 'Z');
		System.out.println("영문대문자여부: "+isCapitalLetter);
		/*
		 * Quiz: 한글여부판단
		 * '가'~'힣'
		 */
		c='홍';
		boolean isHangul=true;
		System.out.println("한글여부:"+isHangul);
		/*
		 * Quiz: 아이디의첫글자는영문대문자나 소문자이여야한다.
		 * 'A'~'Z' 'a'~'z'
		 */
		char idFirstLetter='8';
		boolean isValidId = true;
		System.out.println("아이디의 적합성여부:"+isValidId);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
