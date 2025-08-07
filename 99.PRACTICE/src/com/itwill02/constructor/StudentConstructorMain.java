package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
	
		
		Student student1 = new Student(); // 기본 생성자
		student1.setStudentData(1, "김경호", 88, 98, 75);

		Student student2 = new Student(2, "김경수", 85, 85, 65);
		Student student3 = new Student(3, "김경철", 55, 42, 30);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calculateTotal();
		student1.calculateAvg();
		student1.calculateGrade();

		student2.calculateTotal();
		student2.calculateAvg();
		student2.calculateGrade();

		student3.calculateTotal();
		student3.calculateAvg();
		student3.calculateGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();

		
		/*
		 * 학생 student1 의 이름변경메쏘드호출후 student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
	
		System.out.println("\n--- student1 이름 변경 후 출력 ---");
		student1.setName("장재혁");
		student1.print();

		int tot1 = student1.getTot();
		char grade1 = student1.getGrade();

		System.out.println("\nstudent1 총점: " + tot1);
		System.out.println("student1 평점: " + grade1);
	}

}