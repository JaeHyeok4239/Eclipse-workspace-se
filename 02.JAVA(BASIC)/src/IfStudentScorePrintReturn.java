
public class IfStudentScorePrintReturn {

	public static void main(String[] args) {

		/*
		 * 1. 입력되는 점수의 유효성체크 - 100점이넘는수나 음수가입력되면 메세지를 출력하고 실행흐름을 반환한다.
		 */

		int kor = 89;
		if (kor < 0 || kor > 100) {
			System.out.printf("%d 는 유효한 점수가 아닙니다. \n", kor);
			return;
		}

		/*
		 * 2. 학점계산후출력
		 */

		char hakjum = 'F';
		if (kor >= 90) {
			hakjum = 'A';
		} else if (kor >= 80) {
			hakjum = 'B';
		} else if (kor >= 70) {
			hakjum = 'C';
		} else if (kor >= 60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';

		}
		System.out.printf("학점은 %c 입니다.\n", hakjum);
		return;

	} // end main

} // end class
