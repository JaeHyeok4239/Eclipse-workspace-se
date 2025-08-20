package lang;

/*
- Wrapper 클래스
	
	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.

	Integer,Boolean,Double,Character,Float,Long,Byte,Short
*/

public class WrapperClassMain {

	public static void main(String[] args) {
		
		System.out.println("--------------Boxing(Wrapping), Unboxing(Unwrapping) -------------------");
		
		/*
		 * Boxing [기본형 --> Wrapper 객체]
		 */
		
		Integer wi1 = new Integer(123);
		Character wc1 = new Character('김');
		Double wd1 = new Double(3.141592);
		Boolean wb1 = new Boolean(true);
		
		/*
		 * Unboxing [Wrapper 객체 --> 기본형]
		 */
		
		int i1 = wi1.intValue();
		char c1 = wc1.charValue();
		double d1 = wd1.doubleValue();
		boolean b1 = wb1.booleanValue();
		
		/*
		 *  Auto boxing [기본형 --> Wrapper 객체]
		 */
		
		Integer wi2 = 123;
		Character wc2 = '김';
		Double wd2 = 3.14159;
		Boolean wb2 = true;
	    
		/*
		 * Auto Unboxing [Wrapper 객체 --> 기본형]
		 */
		
		int i2 = wi2;
		char c2 = wc2;
		double d2 = wd2;
		boolean b2 = wb2;
		
		
		int a = 89;
		int b = 45;
		int c = 78;
		int d = 90;
		int e = 99;
		
		System.out.println("************** AUTO BOXING ***************");
		Integer ia = a;
		Integer ib = b;
		Integer ic = c;
		Integer id = d;
		Integer ie = e;
		System.out.println("**************** AUTO BOXING(자동형변환) ***************");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		System.out.println("**************** AUTO CASTING(자동형변환) ***************");
		Object ooa = 89;
		Object oob = 45;
		Object ooc = 78;
		Object ood = 90;
		Object ooe = 99;
		
		System.out.println("***************** Object[](AUTO BOXING 자동형변환)");
		Object[] scoreArray = new Object[5];
		scoreArray[0] = 89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 90;
		scoreArray[4] = 99;
		for (Object score : scoreArray) {
			int tempScore = (Integer)score;
			System.out.println(tempScore+" ");
			
		}
		
		System.out.println();
		System.out.println("******************* equals ********************");
		Integer wi11 = new Integer(123);
		Integer wi22 = new Integer(123);
		System.out.println("주소비교(==)       : " + (wi11=wi22));
		System.out.println("내용비교(equals)   : " + (wi11.equals(wi22)));
		
		
		

	}

}
