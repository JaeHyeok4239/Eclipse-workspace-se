
public class encapsulationMain {

	public static void main(String[] args) {
		encapsulation encapsulation = new encapsulation();
		
		
		
		/*
		 * encapsulation 객체멤버필드에 데이터 대입
		 */
		
		/*
		encapsulation.memberField2 = false;
		encapsulation.memberField3 = "김";
		encapsulation.memberField4 = 3.14159;
		 * 
		 */
		
		encapsulation.setMemberField1(0);
		encapsulation.setMemberField2(false);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(3.14159);
		
		
		/*
		 * encapsulation 객체멤버필드 내용 출력
		 */

		/*
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		
		*/
		
		
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.getMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
		
		
		
		
		
	}

}
