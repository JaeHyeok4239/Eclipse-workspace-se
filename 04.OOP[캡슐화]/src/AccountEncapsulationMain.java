
public class AccountEncapsulationMain {

	public static void main(String[] args) {

		/*
		 * 계좌객체생성
		 */
		Account account1=new Account();
		/*
		 * 계좌데이타대입
		 */
		account1.setAccount(1111, "KIM", 50000, 1.2);
		/*
		 * account1 8000원입금
		 */
		account1.deposit(8000);
		
		/*
		 * account1잔고얻기
		 */
		int account1Balance=account1.getBalance();
		System.out.println("account1잔고: "+account1Balance);
		/*
		 * account1계좌이율 1%증가
		 */
		account1.setIyul(account1.getIyul()+1);
		account1.increaseIyul(1);
		
		/*
		 * account1계좌출력
		 */
		account1.headerPrint();
		account1.print();
		
		System.out.println(">>은행계좌전체잔고 50원 증가");
	
	    /*
	     * 은행전체계좌생성
	     */
		
		Account acc1=new Account();
		Account acc2=new Account();
		Account acc3=new Account();
		
		/*
		 * 은행계좌데이터 초기화
		 */
		
		acc1.setAccount(1111,  "LIM", 89000,  3.5);
		acc2.setAccount(2222,  "JIM", 34000,  2.6);
		acc3.setAccount(3333,  "SIM", 12300,  1.9);
		
		/*
		 * 은행 모든 잔고 50원 증가
		 */
		
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		
		
	
	
	}

}
