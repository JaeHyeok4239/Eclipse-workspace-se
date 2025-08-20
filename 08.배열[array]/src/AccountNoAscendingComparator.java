import java.util.Comparator;

public class AccountNoAscendingComparator implements Comparator<Account> {

	@Override
	public int compare(Account account1, Account account2) {
		return account1.getNo() - account2.getNo();
	}

}
