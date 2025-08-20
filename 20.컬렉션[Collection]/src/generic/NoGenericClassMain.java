package generic;

class NoGenericClass{
	private Object member;
	
	
	public Object getMember() {
		return member;
	}
	public void setMember(Object member) {
		this.member = member;
	}
	
}

public class NoGenericClassMain {

	public static void main(String[] args) {
		
		NoGenericClass noGenericClass = new NoGenericClass();
		noGenericClass.setMember(new Account(1111, "일일일", 1000, 1.1));
		Account getAccount = (Account)noGenericClass.getMember();
		getAccount.print();
		
		

	}

}
