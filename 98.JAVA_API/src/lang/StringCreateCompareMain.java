package lang;

public class StringCreateCompareMain {

	public static void main(String[] args) {
		
		
		
		/*
			String 객체의 생성
			1. 생성자호출(명시적)
			2. " " 으로 생성(암시적)
			
		*/
		
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		
		
		/**   String 객체 주소비교   **/
		
		if(name1!=name2) {
		System.out.println(" >> name1과 name2의 주소는 같다 " );	
		}else {
			System.out.println(" >> name1과 name2의 주소는 다르다 " );	
			
		}
		if(name3 == name4) {
			System.out.println(" >> name1과 name2의 주소는 같다 " );	
		}else {
			System.out.println(" >> name1과 name2의 주소는 다르다 " );	
			
		}
		
		/*
		 * String equals메소드는 멤버필드문자열비교로 재정의되어 있다.
		 */
		System.out.println("------------String 객체의 값비교는 반드시 재정의된 equals 메쏘드를 사용하여야합니다.----------");
		if(name1.equals(name2)) {
			System.out.println(" >> name1객체의 멤버필드 문자열과 name2객체의 멤버필드문자열이 동일하다" );	
			
		}
		if(name1.equals(name3)) {
			System.out.println(" >> name1객체의 멤버필드 문자열과 name3객체의 멤버필드문자열이 동일하다" );	
			
		}
		if(name1.equals(name4)) {
			System.out.println(" >> name1객체의 멤버필드 문자열과 name4객체의 멤버필드문자열이 동일하다" );	
			
		}
		if(name3.equals(name4)) {
			System.out.println(" >> name3객체의 멤버필드 문자열과 name4객체의 멤버필드문자열이 동일하다" );	
			
		}
		if(name1.equals("KIM")) {
			System.out.println(" >> name1객체의 멤버필드 문자열과 \"KIM\" 객체의 멤버필드문자열이 동일하다" );	
			
		}
		if("KIM".equals(name1)) {
			System.out.println(" >> \"KIM\"객체의 멤버필드 문자열과 name1객체의 멤버필드문자열이 동일하다" );	
			
		}
		
		System.out.println("-----------------equalsIgnoreCase-----------------");
		if(!name1.equals("kim")) {
			System.out.println("name1객체의 멤버필드 문자열과 \"kim\" 객체의 멤버필드문자열이 동일하다.");
			
		}
		if(name1.equalsIgnoreCase("kim")) {
			System.out.println("name1객체의 멤버필드 문자열과 \"kim\" 객체의 멤버필드문자열이 대소문자구분없이 동일하다.");
		}
		
		System.out.println("KIM".charAt(0));
		System.out.println("KIM".charAt(1));
		System.out.println("KIM".charAt(2));
		
		
		
		System.out.println("------------------compareTo-----------------------");
	
	
	
	int result = "aaa".compareTo("aaa");
	System.out.println(result);
	System.out.println("aaa".compareTo("aab"));
	System.out.println("aab".compareTo("aaa"));
	
	
	String irum1="홍경호";
	String irum2="김경호";
	if(irum1.compareTo(irum2) > 0) {
		System.out.println("irum1과 irum2교환(오름차순)");
		
		
	}
	
}	
	
	
	}
	


