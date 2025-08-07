
public class Account {
	/*
	 * 생성자 메쏘드
	 */

	public Account() {
		
	}
	public Account(int no, String owner, int balance, double iyul) {
		super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private int no;// 계좌번호
	private String owner;// 계좌주이름
	private int balance;// 계좌잔고
	private double iyul;// 계좌이율
	/*
	 * 계좌데이타대입
	 */
	public void setAccount(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	/*
	 * 입금
	 */
	public void deposit(int money) {
		this.balance=this.balance+money;
		//this.balance+=money;
	}
	/*
	 * 출금
	 */
	public void withDraw(int  money) {
		this.balance=this.balance-money;
		//this.balance-=money;
	}
	/*
	 * 이율증가
	 */
	public void increaseIyul(int iyul) {
		this.iyul=this.iyul+iyul;
	}
	/*
	 * 계좌헤더출력
	 */
	public void headerPrint() {
		System.out.printf("-------------------------\n");
		System.out.printf("%s %s %4s %4s\n","번호","이름","잔고","이율");
		System.out.printf("-------------------------\n");
	}
	/*
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %s %8d %5.1f\n",this.no,this.owner,this.balance,this.iyul);
	}
	//gette,setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	
	
	}
}
