import java.util.Scanner;

public class Practice2222 {

	public static void main(String[] args) {
		/*---------------------------------------------------------------------------7/31(연습)
		/*
		 * 아래 정보를 담을 수 있는 변수 5개를 자바에서 알맞은 자료형을 사용하여 선언해 보세요.
		단, 변수 이름은 의미 있게 작성하세요.
		
		학생의 이름 (예: "김철수")
		
		학생의 나이 (예: 20세)
		
		학생의 키 (예: 174.5cm)
		
		학생이 재학 중인지 여부 (예: true 또는 false)
		
		학생의 학점 (예: 'A', 'B', 'C' 중 하나)
		 */

		int age; // int 정수
		String name; // 문자열
		double height; // 실수
		boolean school; // 참/거짓 여부
		char rank; // 문자

		name = "김철수";
		age = 20;
		height = 174.5;
		school = true;
		rank = 'A';

		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("키 :" + height);
		System.out.println("재학 여부 :" + school);
		System.out.println("학점 :" + rank);

		/*---------------------------------------------------------------------연습
		 * 어떤 사각형의 가로 길이와 세로 길이가 아래와 같습니다.
		
		*가로: 8.5cm
		
		*세로: 4.2cm
		
		*이 사각형의:
		
		*넓이를 구해서 변수에 저장하고,
		
		*둘레도 구해서 변수에 저장한 뒤,
		
		*각 값을 출력해보세요!
		 */

		double hLength;
		double vLength;
		double area;
		double length;
		hLength = 8.5;
		vLength = 4.2;

		area = (hLength * vLength);
		length = (hLength * 2) + (vLength * 2);

		System.out.println("사각형의 넓이 : " + area + "cm2");
		System.out.println("사각형의 둘레 : " + length + "cm");

		/*
		 * [문제 3] 삼각형 정보 저장하기 어떤 삼각형의 정보를 다음과 같이 저장하려고 해요:
		 * 
		 * 삼각형의 밑변 길이: 6.0cm
		 * 
		 * 삼각형의 높이: 3.5cm
		 * 
		 * 삼각형이 정삼각형인지 여부: false
		 * 
		 * 삼각형의 색상: "blue"
		 * 
		 * 🎯 당신의 할 일 위 정보를 담을 수 있는 변수 4개 선언
		 * 
		 * 각 변수에 적절한 자료형 사용
		 * 
		 * 값 대입
		 * 
		 * 아래처럼 출력
		 * 
		 * ⛳ 출력 예시 makefile 복사 편집 밑변: 6.0cm 높이: 3.5cm 정삼각형 여부: false 색상: blue
		 */

		double length1;
		double height1;
		boolean square;
		String color;

		length1 = 6.0;
		height1 = 3.5;
		square = false;
		color = "blue";

		System.out.println("밑변 :" + length1 + "cm");
		System.out.println("높이 :" + height1 + "cm");
		System.out.println("정삼각형 여부 :" + square);
		System.out.println("색상 :" + color);

		/*
		 * BMI = 몸무게(kg) / (키(m) * 키(m)) ※ 키는 cm로 입력받고, 계산할 때 미터(m) 단위로 변환해야 해요.
		 * 
		 * ✍ 출력 예시 makefile 복사 편집 이름: 김철수 키: 174.5cm 몸무게: 67.8kg BMI: 22.3
		 */

		
		String name3;
		double height3;
		double weight;
		double bmi;
		
		name3 = "김철수";
		height3 = 174.5;
		weight = 67.8;
		bmi = (weight/height3)*height3;
		
		System.out.println("이름 :"+name3);
		System.out.println("키 :"+height3+"cm");
		System.out.println("몸무게 :"+weight+"kg");
		System.out.println("BMI :"+bmi);

		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		



	}

}