
public class PrimitiveTypeStudentArrayMain {

	public static void main(String[] args) {
		System.out.println("-----------------학생10명의 성적데이타를 저장하기위한 배열객체생성 & 초기화----------------");
		/*
		 * int[] noArray = new int[10]; noArray[0]=1;noArray[1]=2;noArray[2]=3;
		 * noArray[3]=4;noArray[4]=5;noArray[5]=6;noArray[6]=7;noArray[7]=8;noArray[8]=9
		 * ;noArray[9]=10;
		 */
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };
		int[] korArray = { 78, 90, 45, 78, 45, 80, 99, 71, 63, 89 };
		int[] engArray = { 98, 34, 56, 90, 91, 99, 88, 46, 79, 61 };
		int[] mathArray = { 93, 90, 34, 76, 81, 93, 66, 51, 89, 77 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		/*
		 * 총점,평균,평점
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i] / 3.0;
			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}
		}
		/*
		 * 총점으로 석차계산
		 */
		/*
		 * 1번학생(index -->0)석차계산 2번학생(index -->1)석차계산 3번학생 (index -->2)석차계산 4번학생 (index
		 * -->3)석차계산 5번학생 (index -->4)석차계산 6번학생 (index -->5)석차계산 7번학생 (index -->6)석차계산
		 * 8번학생 (index -->7)석차계산 9번학생 (index -->8)석차계산 10번학생(index -->9)석차계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length; j++) {
				if (totArray[i] < totArray[j]) {
					rankArray[i]++;
				}
			}
		}
		/*
		 * 학생검색(번호,이름,국어,영어,수학,학점,석차)
		 */
		System.out.println(">> 번호 3번인학생1명 찾아서 1명정보출력(학생번호는 중복되지않는다.)");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}
		System.out.println(">> 국어점수 80점이상인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (korArray[i] >= 80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println(">> 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (engArray[i] <= 50) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println(">> 학점이 C 학점인 학생모두찾아서 여러명 정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (gradeArray[i] == 'C') {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println(">> 이름이 KIM인학생 여러명 정보출력");
		/*
		 * 이름이 KIM인학생 모두찾아서 출력 - 문자열인경우는 비교시 비교연산자사용금지(==) - 문자열.equals("문자열")
		 */
		for (int i = 0; i < noArray.length; i++) {
			/*
			 * if(nameArray[i]=="KIM") {
			 * System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i],
			 * nameArray[i], korArray[i], engArray[i], mathArray[i], totArray[i],
			 * avgArray[i], gradeArray[i], rankArray[i]); }
			 */
			if (nameArray[i].equals("KIM")) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		/*
		 * 정렬 1.오름차순(ascending) ex> 1,2,3,4,5... a,b,c,d.. 가,나,다..힣 2.내림차순(descending)
		 * ex> 5,4,3,2,1 z,y,x.... 힣..다,나,가
		 */

		/*
		 * 학생총점순으로 오름차순정렬 https://www.youtube.com/watch?v=ebI54DXYQG8
		 */
		System.out.println("---------------swap--------------");
		/*
		 * 변수내용교환
		 */
		int a = 1;
		int b = 2;
		System.out.println("교체전 >> a= " + a + "," + " b= " + b);
		int tempa = a;
		a = b;
		b = tempa;
		System.out.println("교체후 >> a= " + a + "," + " b= " + b);
		System.out.printf("-----------------학생성적출력[정렬전]-----------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		/*
		 * 총점으로 오름차순정렬 9회정렬
		 */
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length - 1-i; j++) {
				if (totArray[j] > totArray[j + 1]) {
					// swap no
					int tempJno = noArray[j];
					noArray[j] = noArray[j + 1];
					noArray[j + 1] = tempJno;
					// swap name
					String tempJname = nameArray[j];
					nameArray[j] = nameArray[j + 1];
					nameArray[j + 1] = tempJname;
					// swap kor
					int tempJkor = korArray[j];
					korArray[j] = korArray[j + 1];
					korArray[j + 1] = tempJkor;
					// swap eng
					int tempJeng = engArray[j];
					engArray[j] = engArray[j + 1];
					engArray[j + 1] = tempJeng;
					// swap math
					int tempJmath = mathArray[j];
					mathArray[j] = mathArray[j + 1];
					mathArray[j + 1] = tempJmath;
					// swap tot
					int tempJtot = totArray[j];
					totArray[j] = totArray[j + 1];
					totArray[j + 1] = tempJtot;
					// swap avg
					double tempJavg = avgArray[j];
					avgArray[j] = avgArray[j + 1];
					avgArray[j + 1] = tempJavg;
					// swap grade
					char tempJgrade = gradeArray[j];
					gradeArray[j] = gradeArray[j + 1];
					gradeArray[j + 1] = tempJgrade;
					// swap rank
					int tempJrank = rankArray[j];
					rankArray[j] = rankArray[j + 1];
					rankArray[j + 1] = tempJgrade;
				}
			}
		}
		System.out.printf("-----------------학생성적출력[정렬후]-----------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);

		}
	}
}
