package nogeneric;

import lombok.Setter;
import lombok.ToString;

/**
 * 은행에서계좌객체를 생성할클래스
 * @author  김수한무거북이
 * @version 0.001
 */
@Setter
@ToString
public class Account {
	/*
	 * 필드
	 */
	private int no;// 계좌번호
	private String owner;// 계좌주이름
	private int balance;// 계좌잔고
	private double iyul;// 계좌이율
	/*
	 * 생성자메쏘드
	 */
	/**
	 * 기본값으로초기화된 Account객체생성
	 */
	public Account() {
	}
	/**
	 * 매개변수값으로 초기화된객체생성
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 계좌잔고
	 * @param iyul 계좌이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	/*
	 * 메쏘드
	 */
	/*
	 * 계좌데이타대입
	 */
	/**
	 * 계좌데이타대입
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 계좌잔고
	 * @param iyul 계좌이율
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
	/**
	 * 입금
	 * @param money 입금할돈
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
	public static void headerPrint() {
		System.out.println("-------------------------");
		System.out.printf("%s %4s %5s %3s\n","번호","이름","잔고","이율");
		System.out.println("-------------------------");
	}
	
	/*
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %5s %8d %4.1f\n",no,owner,balance,iyul);
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
	/**
	 * 잔고반환
	 * @return 잔고
	 */
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
	@Override
	public String toString() {
		return "Account(no=" + no + ",owner=" + owner+")";
	}

	
	

}










