import java.util.Scanner;

public class SwitchUse {

	public static void main(String[] args) {


		int num=34;
		switch(num%2) {
		case 0:
			
			System.out.println(num+ "은 짝수 입니다.");
			
			break;
		case 1:
			System.out.println(num+ "은 홀수 입니다.");
			break;
			
		}
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("캐릭터 이동방향을 입력하세요[L/l(left),R/r(right),U/u(up),D/d(down)]:");
		String direction = scanner.next();
		
		
		switch (direction) {
		case "L","l":
			System.out.println("move left!!");
			break;

		case "R","r":
			System.out.println("move right!!");
			break;
			
		case "U","u":
			System.out.println("move up!!");
			break;
			
		case "D","d":
			System.out.println("move down!!");
			break;
			
		default:
			System.out.println("nothing~~");
			
			
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
