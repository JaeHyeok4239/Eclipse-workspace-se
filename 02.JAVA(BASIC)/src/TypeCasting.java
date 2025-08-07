/*
		형변환--> 숫자형데이타간에만 가능
			
			- 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte--> short -->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
 */
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자동형변환(promotion)
		 */
		
		int i1=56;
		long l1=i1;
		double d1=l1;
		
		/*
		 * 자동형변환안됨 큰데이타-->작은데이타타입 변수(컴파일에러)
		 * 필요에 따라 강제형변환을 할수 있다.
		 * 
		 */
		
		double avgd=85.32;
		int avgi= (int)avgd;
		System.out.println(avgd);
		System.out.println(avgi);
		
		/*
		 *   연산시의 자동형변환
		 *     - 연산항들중에 가장 큰 타입으로 모든 항들이 자동형변환(Promotion)된 후 연산한다.
		 */
		
		int ii=100;
		double dd=0.1;
		
		double result = ii+dd;
        System.out.println(result);		
		result = ii + 36 + i1 + l1 + 0.2;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
