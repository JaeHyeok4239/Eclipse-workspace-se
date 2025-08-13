package lang;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("-------------로또번호 6개 생성 [ 중복번호 허용안됨]--------------");
		int[] lottoNumber = {0,0,0,0,0,0};
		
		
		/*
		 * 번호 생성
		 * 
		 *  - Quiz : 중복체크
		 */
		for(int i=0;i < lottoNumber.length;i++) {
			lottoNumber[i] = (int)(Math.random()*45)+1;
			for(int j=0;j < i;j++) {
				if(lottoNumber[i] == lottoNumber[j]) {
					lottoNumber[i] = 0;
					i--;
					break;
				}
			}
			
		}
		System.out.println();
		for (int no : lottoNumber) {
			System.out.print(no+" ");
		}
	}

}