/*
#### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
*/
public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 대입메쏘드호출(3명)
		 */
		std1.no = 1;
		std1.name = "김경호";
		std1.kor = 42;
		std1.eng = 56;
		std1.math = 78;
		std1.data(1,  "김경호", 42, 56, 78);
		
		std2.no = 2;
		std2.name = "김경수";
		std2.kor = 45;
		std2.eng = 53;
		std2.math = 76;
		std2.data(2,  "김경수", 45, 53, 76);
	
		std3.no = 3;
		std3.name = "김경우";
		std3.kor = 45;
		std3.eng = 53;
		std3.math = 76;
		std3.data(3,  "김경우", 45, 53, 76);
		
		
		
		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */
		
		std1.total();  std1.average(); std1.totalGrade();
		std2.total();  std2.average(); std2.totalGrade();
		std3.total();  std3.average(); std3.totalGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
	

	
		std1.headerPrint();
		std1.print();
		std2.print();
		std3.print();
	}
       
	 
	
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2
   		 3   김경우   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
	}


