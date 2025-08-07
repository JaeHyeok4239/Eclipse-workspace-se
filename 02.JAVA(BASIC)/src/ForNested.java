
public class ForNested {

	public static void main(String[] args) {
		System.out.println("1.-------------------------------");
		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%s(%d,%d)", "★", i, j);
			}
			System.out.print("\n");
		}

		System.out.println("2.-------------------------------");
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != j) {
					System.out.printf("%s", "★");
				} else {
					System.out.printf("%s", "☆");
				}
			}
			System.out.print("\n");
		}
		System.out.println("3.-------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		for (int i = 0; i <  5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%s","★");
			}
			System.out.print("\n");
		}
		System.out.println("4.-------------------------------");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		for (int i = 0; i <  5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.printf("%s","★");
			}
			System.out.print("\n");
		}
		System.out.println("5.-------------------------------");
		/*
		★★★★★
		☆★★★★
		☆☆★★★
		☆☆☆★★
		☆☆☆☆★
		 */
		for (int i = 0; i <  5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j>i) {
					System.out.printf("%s","★");
				}else if(j==i){
					System.out.printf("%s","\\");
				}else {
					System.out.printf("%s","☆");
				}
			}
			System.out.print("\n");
		}
		
	}
}