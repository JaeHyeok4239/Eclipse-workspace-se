package generic;

import java.util.Comparator;

public class AccountOwnerAscendingComparator implements Comparator<Account> {

	@Override
	public int compare(Account account1, Account account2) {
		// TODO Auto-generated method stub
		return account1.getOwner().compareTo(account2.getOwner());
	}

}