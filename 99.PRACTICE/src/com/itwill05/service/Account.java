package com.itwill05.service;
/*
 * 은행 계좌 객체
 *  - 속성 : 번호, 예금주, 잔액, 이율
 *  - 기능 : 입금, 출금, 출력
 */
public class Account {
	private int no;         // 계좌번호
	private String owner;   // 예금주
	private int balance;    // 잔액
	private double iyul;    // 이율

	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	// getter & setter
	public int getNo() { return no; }
	public String getOwner() { return owner; }
	public int getBalance() { return balance; }
	public double getIyul() { return iyul; }

	public void setOwner(String owner) { this.owner = owner; }
	public void setBalance(int balance) { this.balance = balance; }
	public void setIyul(double iyul) { this.iyul = iyul; }

	// 입금
	public void deposit(int amount) {
		this.balance += amount;
	}

	// 출금
	public void withdraw(int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 헤더 출력
	public static void headerPrint() {
		System.out.printf("%-6s %-6s %-8s %-6s\n", "번호", "이름", "잔고", "이율");
		System.out.println("-------------------------------");
	}

	// 계좌 정보 출력
	public void print() {
		System.out.printf("%-6d %-6s %-8d %-6.1f\n", no, owner, balance, iyul);
	}
}