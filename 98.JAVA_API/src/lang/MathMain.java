package lang;

public class MathMain {

	public static void main(String[] args) {
		double r = Math.abs(-4234.4);
		System.out.println(r);
		System.out.println(Math.max(9999, 8888));
		System.out.println(Math.min(9999, 8888));
		System.out.println(Math.round(35.555));
		System.out.println(Math.round(35.555*100.0));
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sqrt(4));

		System.out.println("----------------------random-----------------------");
		
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1~45 사이의 정수 6개 랜덤생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
	}

}
