import java.util.Arrays;
import java.util.Iterator;

public class ArraysMain {

	public static void main(String[] args) {
		Account[] accountArray= {
				new Account(1111, "LEE", 56000, 0.9),
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 90000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		System.out.println("배열복사");
		Account[] newAccountArray = Arrays.copyOf(accountArray, accountArray.length+1);
		for (Account account : newAccountArray) {
			System.out.println(account);
		}
		Account[] destAccounts = new Account[accountArray.length+1];
		System.arraycopy(accountArray, 0, destAccounts, 0, accountArray.length);
		for (Account account : destAccounts) {
			System.out.println(account);
		}
		
		System.out.println(" >> 배열 정렬 [Comparable] ");
		Arrays.sort(accountArray);
		for (Account account : destAccounts) {
			account.print();
		}
		

		System.out.println(" >> 배열 정렬 [Comparator] ");
		Arrays.sort(accountArray, new AccountNoAscendingComparator());
		//Arrays.sort(accountArray,new AccountOwnerAscendingComparator() );
		//Arrays.sort(accountArray,new AccountBalanceAscendingComparator() );
		for (Account account : destAccounts) {
			account.print();
		}
		

	
	
	
	
	}

}