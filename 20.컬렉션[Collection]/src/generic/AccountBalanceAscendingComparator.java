package generic;

import java.util.Comparator;

public class AccountBalanceAscendingComparator implements Comparator<Account>{

	@Override
	public int compare(Account account1, Account account2) {
		return account1.getBalance()-account2.getBalance();
	}

}