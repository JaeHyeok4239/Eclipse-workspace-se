
public class AccountManyMemberMain {

	public static void main(String[] args) {
		/*
		 * null --> 주소없다 주소값 리터럴
		 */
		Account a0 = null;
		Account a1 = null;
		Account a2 = null;
		Account a3 = null;
		Account a4 = null;
		
		
		a1=new Account();
		a2=new Account();
		a3=new Account();
		a4=new Account();
		
		AccountManyMember accountManyMember=
				new AccountManyMember();
		accountManyMember.acc0=new Account();
		accountManyMember.acc1=new Account();
		accountManyMember.acc2=new Account();
		accountManyMember.acc3=new Account();
		accountManyMember.acc4=new Account();
		

	}

}
