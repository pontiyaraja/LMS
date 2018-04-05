package lmsprocess;

public interface TransactionInterface {
	public TransactionModel lendBook(Integer userID, Integer bookID) throws Exception;
	public boolean returnBook(Integer bookID, Integer userID) throws Exception;
}
