
public class ForTest {

	public static void main(String[] args) {
		System.out.println("----------------while----------");
		int k = 0;
		while (k < 10) {
			System.out.println("k=" + k);
			k++;
		}

		System.out.println("-----------------for i증가---------------");
		for (int i = 0; i < 10; i++) {
			System.out.println("i= " + i);

		}
		System.out.println("-------------------for i감소---------------");
		for (int i = 0; i < -10; i--) {
			System.out.println("i= " + i);
		}
		System.out.println(">> 홀수만출력[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				System.out.print("i+");
		}
		System.out.println();
		System.out.println(">> 3의배수만출력[1~100]");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(">> 3과4의 공통배수만출력[1~100]");

		/*
		 * break; 1. 반복문에서 사용 2. break문이실행되면 반복블록을 빠져나온다.
		 */

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 00 && i % 4 == 0) {
				System.out.print(i + " ");
				break;
			}
		}

		System.out.println(">> 3과4의 최소공배수만출력[1~100](break)");
		System.out.println(">> 4의 배수가출아닌수만출력[1~100](continue)");
		for (int i =1;i<=100;i++) {
			if(i%4==0) {
				
				
				/*
				 4의배수조건을 만족하면 continue문이 실행되고
				 현재실행중인 for블록의 continue문이후코드를 실행하지않고
				 다음횟수의의 블록을실행한다.  
				 */
				continue;
				/*
				 0.반복 블록에서만 사용가능하다.
				 1.continue문이후의  for블록코드를 실행하지 않는다.
				 2.다음반복을 계속실행한다(continue)
				 */	
				
		
			}
			System.out.print(i+" ");
		}
		
		
		
		
		System.out.println(">> 영문소문자(continue)");
		for(char c ='a';c<='z';c++) {
			System.out.print(c);
			if(c=='z') {
				continue;
			}
			System.out.print(",");
		}
			System.out.println();
			
			/*
			 [Quiz]
			 - 영문소문자출력
			   a b c d e \n
			   f g h i j \n
			   k l m n o \n
			   p q r s t \n
			   u v w x y \n
			   z
			 */
			
			for(char c='a';c<='z';c++) {
				System.out.print(c+" ");
				int charCount = c -'a'+1;
				if(charCount%5==0) {
					System.out.print("\n");
					continue;
				}
			
				System.out.print(",");
			}
			
	
  
	
		
		System.out.println(">> 홀수,짝수합[1~100]");
		int evenTot=0;
		int oddTot=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenTot+=i;
				//evenTot=evenTot+i;
			}else {
				
				oddTot+=i;
				//oddTot=oddTot+i;
			}
			}
		System.out.println("짝수합:"+evenTot);
		System.out.println("홀수합:"+oddTot);
		
	}
		

	}

