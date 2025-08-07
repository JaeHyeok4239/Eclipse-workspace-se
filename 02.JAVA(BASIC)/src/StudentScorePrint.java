
public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int userNumber1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int tot1;
		double avg1;
		int rank1;
		
		int userNumber2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int tot2;
		double avg2;
		int rank2;
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		userNumber1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		userNumber2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		kor1 = 42;
		if(kor1>100 || kor1<0) {
			System.out.println("오류");
			return;
		}
		eng1 = 56;
		if(eng1>100 || eng1<0) {
			System.out.println("오류");
			return;
		}
		math1 = 78;
		if(math1>100 || math1<0) {
			System.out.println("오류");
			return;
		}
		kor2 = 45;
		if(kor2>100 || kor2<0) {
			System.out.println("오류");
			return;
		}
		eng2 = 53;
		if(eng2>100 || eng2<0) {
			System.out.println("오류");
			return;
		}
		math2 = 76;
		if(math2>100 || math2<0) {
			System.out.println("오류");
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1=kor1+eng1+math1;
		avg1=tot1/3.0;
		rank1='F';
		if(avg1>90) {
			rank1='A';
		}else if(avg1>80) {
			rank1='B';
		}else if(avg1>70) {
			rank1='C';
		}else if(avg1>60) {
			rank1='D';
		}else {
			rank1='F';
		}
		
		
		tot2=kor2+eng2+math2;
		avg2=tot2/3.0;
		rank2='F';
		if(avg2>90) {
			rank2='A';
		}else if(avg2>80) {
			rank2='B';
		}else if(avg2>70) {
			rank2='C';
		}else if(avg2>60) {
			rank2='D';
		}else {
			rank2='F';
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
		-----------------------------------------------
		*/
		
		System.out.println("--------------학생 성적출력-------------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("---------------------------------------------------------");
		System.out.printf("  %d  %s  %d    %d  %d   %d  %.1f  %c \n",userNumber1 , name1,kor1,eng1,math1,tot1,avg1,rank1);
		System.out.printf("  %d  %s  %d    %d  %d   %d  %.1f  %c \n",userNumber2 , name2,kor2,eng2,math2,tot2,avg2,rank2);
		System.out.println("---------------------------------------------------------");
	}//end main

}//end class
