package generic;

class GenericClass< T >{
	private T member;
	public T getMember() {
		return member;
	}
	public void setMember(T member) {
		this.member = member;
	}
	
}

public class GenericClassMain {

	public static void main(String[] args) {
		
		GenericClass<Account> genericClass = new GenericClass<Account>();
		genericClass.setMember(new Account(111, "FIRST", 9090, 9.0));
		Account getAccount = genericClass.getMember();
		getAccount.print();

	}

}
