
public class ReferenceVariableMain {

	public static void main(String[] args) {

		System.out.println("----------참조변수의대입------------");
		Account account1 = new Account(1234,"김경수",56000,3.5);
		Account account2 = new Account(9988,"김경우",89000,5.9);
		Account account3 = account1;
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		account1.print();
		account3.print();
		account1.setOwner("김경미");
		account1.print();
		account3.print();
		System.out.println("------------- 참조변수비교------------");
		if(account1 != account2) {
			System.out.println("주소값이 동일하지않다.---->" +account1 + "!=" +account2);
		}
		
		if(account1 == account3) {
			System.out.println("주소값이 동일하다.---->" +account1 + "==" +account3);
		}

		System.out.println("-----------주소값 교환-------------");
		Account a1 = new Account(1000, "일천님", 1000, 0.1);
		Account a2 = new Account(2000, "이천님", 2000, 0.2);
		System.out.println("-----------swap 전 ----------------");
		a1.print();
		a2.print();

		
		Account tempAccount1 = a1;
		a1 = a2;
		a2 = tempAccount1;
		
		
		
		System.out.println("-----------swap 후 ----------------");
		a1.print();
		a2.print();
		
		
		
		Account account = null;
		if(account == null) {
			System.out.println("account 객체값이 null 입니다. account -->" +account);
		}else {
			account.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
