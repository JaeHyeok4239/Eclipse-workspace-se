package generic;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMain {
	/*
	 Collections 클래스
	    - Collection객체들의 utility 메쏘드제공  
	 */
	public static void main(String[] args) {
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(34);
		intList.add(45);
		intList.add(78);
		intList.add(90);
		intList.add(23);
		intList.add(10);
		intList.add(99);
		intList.add(20);
		System.out.println("-------------- sort List<Integer>---------------");
		System.out.println("정렬전           :"+intList);
		Collections.sort(intList);
		System.out.println("정렬후(오름차순) :"+intList);
		Collections.reverse(intList);
		System.out.println("reverse후        :"+intList);
		
		ArrayList<String> stringList=new ArrayList<String>();
		stringList.add("유재석");
		stringList.add("조세호");
		stringList.add("김경호");
		stringList.add("이효리");
		stringList.add("유재식");
		System.out.println("-------------- sort List<String>---------------");
		System.out.println("정렬전             : "+stringList);
		Collections.sort(stringList);
		System.out.println("정렬후(오름차순)   : "+stringList);
		Collections.reverse(stringList);
		System.out.println("reverse후          : "+stringList);
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		accountList.add(new Account(4523, "BING", 33000, 0.5));
		accountList.add(new Account(2367, "KING", 23000, 0.1));
		accountList.add(new Account(8909, "KING", 89000, 0.2));
		accountList.add(new Account(1234, "YONG", 99000, 0.7));
		accountList.add(new Account(2789, "SANG", 12000, 0.3));
		System.out.println(">> 정렬전 [Comparable] ");
		for (Account account : accountList) {
			account.print();
		}
		Collections.sort(accountList);
		System.out.println(">> 정렬후 [Comparable] ");
		for (Account account : accountList) {
			account.print();
		}
		Collections.reverse(accountList);
		System.out.println(">> reverse [Comparable] ");
		for (Account account : accountList) {
			account.print();
		}
		
		/*
		  Comparator interface
		 << Collections.sort(List, Comparator); >>
		 */
		System.out.println(">> 잔고 오름(내림)차순[Comparator]");
		Collections.sort(accountList, new AccountBalanceAscendingComparator());
		for (Account account : accountList) {
			account.print();
		}
		
		System.out.println(">> 이름 오름(내림)차순");
		Collections.sort(accountList, new AccountOwnerAscendingComparator());
		for (Account account : accountList) {
			account.print();
		}	
		
	}

}