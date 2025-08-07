
public class StaticMain {

	public static void main(String[] args) {
		System.out.println("--------static member access-------");
		/*
		 * 정적 멤버접근 - 클래스이름.정적멤버이름
		 */

		System.out.println(Static.static_field);
		Static.static_field = 8888;
		System.out.println(Static.static_field);
		Static.static_field = 9999;
		System.out.println(Static.static_field);
		Static.static_method();
		System.out.println("--------instance member access--------");

		/*
		 * 인스턴스멤버접근 - 참조변수.인스턴스멤버이름
		 */
		Static static1 = new Static();
		System.out.println(">>>> static1객체주소:" + static1);
		static1.instance_field = 1111;
		static1.instance_method();

		Static static2 = new Static();
		System.out.println(">>>> static1객체주소:" + static2);
		static2.instance_field = 2222;
		static2.instance_method();

		/*	
		<<The static method static_method() from the type Static should be accessed in a static way>	
		  System.out.println(static1.static_field);
		  System.out.println(static2.static_field);
		  static1.static_method();
		  static2.static_method();
		*/  

	}

}
