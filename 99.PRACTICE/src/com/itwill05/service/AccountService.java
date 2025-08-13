package com.itwill05.service;
/*
 * Account 객체 전체를 관리하는 서비스 클래스
 *  - 계좌 목록을 멤버변수로 가지고, 다양한 검색/출력/정렬/입출금 기능 제공
 */
public class AccountService {
    public static final int SORT_BY_NO = 1;
    public static final int SORT_BY_OWNER = 2;
    public static final int SORT_BY_BALANCE = 3;
    public static final int SORT_BY_IYUL = 4;

    public static final int SORT_ASC = 1;
    public static final int SORT_DESC = 2;

    private Account[] accounts;

    public AccountService() {
        accounts = new Account[9];
        accounts[0] = new Account(1111, "KIM", 89000, 1.3);
        accounts[1] = new Account(2222, "AIM", 45000, 2.7);
        accounts[2] = new Account(3333, "FIM", 89000, 4.7);
        accounts[3] = new Account(4444, "XIM", 34000, 6.7);
        accounts[4] = new Account(5555, "hIM", 78000, 3.7);
        accounts[5] = new Account(6666, "KIM", 89000, 5.7);
        accounts[6] = new Account(7777, "KIM", 89000, 4.7);
        accounts[7] = new Account(8888, "qIM", 91000, 1.7);
        accounts[8] = new Account(9999, "mIM", 12000, 0.7);
    }

    /* 1. 총 계좌 수 출력 */
    public void totAccountNumberPrint() {
        System.out.println("총 계좌 수: " + accounts.length);
    }

    /* 2. 전체 계좌 출력 */
    public void print() {
        Account.headerPrint();
        for (Account acc : accounts) {
            acc.print();
        }
    }

    /* 3. 총 잔고 출력 */
    public void totBalancePrint() {
        int total = 0;
        for (Account acc : accounts) {
            total += acc.getBalance();
        }
        System.out.println("총 잔고: " + total);
    }

    /* 4. 계좌번호로 한 개 계좌 출력 */
    public void findByNoPrint(int no) {
        for (Account acc : accounts) {
            if (acc.getNo() == no) {
                acc.print();
                return;
            }
        }
        System.out.println(no + " 번 계좌는 없습니다.");
    }

    /* 5. 잔고 이상 계좌 출력 */
    public void findByBalancePrint(int balance) {
        Account.headerPrint();
        for (Account acc : accounts) {
            if (acc.getBalance() >= balance) {
                acc.print();
            }
        }
    }

    /* 6. 이율 이상 계좌 출력 */
    public void findByIyulPrint(double iyul) {
        Account.headerPrint();
        for (Account acc : accounts) {
            if (acc.getIyul() >= iyul) {
                acc.print();
            }
        }
    }

    /* 7. 이름 일치 계좌 출력 */
    public void findByNamePrint(String name) {
        Account.headerPrint();
        for (Account acc : accounts) {
            if (acc.getOwner().equalsIgnoreCase(name)) {
                acc.print();
            }
        }
    }

    /* 8. 입금 */
    public void ipGum(int no, int m) {
        for (Account acc : accounts) {
            if (acc.getNo() == no) {
                acc.deposit(m);
                System.out.println(no + " 번 계좌에 " + m + "원 입금 완료");
                return;
            }
        }
        System.out.println("해당 계좌를 찾을 수 없습니다.");
    }

    /* 9. 출금 */
    public void chulGum(int no, int m) {
        for (Account acc : accounts) {
            if (acc.getNo() == no) {
                acc.withdraw(m);
                System.out.println(no + " 번 계좌에서 " + m + "원 출금 완료");
                return;
            }
        }
        System.out.println("해당 계좌를 찾을 수 없습니다.");
    }

    /* 10. 잔고 오름차순 정렬 */
    public void sortByBalanceAscending() {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = 0; j < accounts.length - 1 - i; j++) {
                if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;
                }
            }
        }
    }

    /* 11. 잔고 내림차순 정렬 */
    public void sortByBalanceDescending() {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = 0; j < accounts.length - 1 - i; j++) {
                if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;
                }
            }
        }
    }
}