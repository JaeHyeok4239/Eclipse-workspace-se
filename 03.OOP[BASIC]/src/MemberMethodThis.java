
public class MemberMethodThis {
	
	
	int memberField1;
	int memberField2;
	
	
	/***********getter method*************/

	public int getMemberField1() {
		return this.memberField1;
		
	}
	public int getMemberField2() {
		return this.memberField2;
		
	}
	/*************setter method************/
	
	public void setMemberField1(int memberField1) {
		/*
		 * this
		 *   - self참조변수
		 *   - public void setMemberField1(int memberField1) 
		 *      메쏘드가 호출될때 호출주체객체의 주소값을 가지는 변수
		 *   - this는 생략이가능  
		 */
		this.memberField1 = memberField1;
		
		
	}

	public void setMemberField2(int memberField2) {
		this.memberField2=memberField2;
		
	}
}
