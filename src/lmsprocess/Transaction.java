package lmsprocess;

import java.util.Calendar;
import java.util.Date;

import books.BookStore;
import books.Books;
import books.BooksInterface;
import books.BooksModel;
import user.User;
import user.UserInterface;
import user.UserModel;
import user.UserStore;

public class Transaction implements TransactionInterface {
	private UserModel userInfo;
	private BooksModel bookInfo;
	private TransactionModel transaction;

	@Override
	public TransactionModel lendBook(Integer userID, Integer bookID) throws Exception {
		try {
			userInfo = new UserModel();
			userInfo = getUserInfo(userID);
			if (userInfo.getUserLimit() > 0) {
				bookInfo = new BooksModel();
				bookInfo = getBookInfo(bookID);
				if (bookInfo.isAvailable()) {
					transaction = new TransactionModel();
					transaction = getTransactionData(userInfo, bookInfo);
					TransactionStore.getTransactionStoreMap()
							.put(itoS(userInfo.getUserID()) + "-" + itoS(bookInfo.getBookID()), transaction);
					bookInfo.setAvailable(false);
					BookStore.getBooksStoreMap().put(bookID, bookInfo);
					userInfo.setUserLimit(userInfo.getUserLimit() - 1);
					UserStore.getUserDataMap().put(userID, userInfo);
					return transaction;
				} else {
					throw new Error("book is not available");
				}
			} else {
				throw new Error("user reached the  limit");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public boolean returnBook(Integer bookID, Integer userID) throws Exception {
		try {
			transaction = new TransactionModel();
			transaction = getTransaction(itoS(userID) + "-" + itoS(bookID));
			if (transaction != null) {
				transaction.setReturned(true);
				TransactionStore.getTransactionStoreMap()
						.put(itoS(userInfo.getUserID()) + "-" + itoS(bookInfo.getBookID()), transaction);
				bookInfo.setAvailable(true);
				BookStore.getBooksStoreMap().put(bookID, bookInfo);
				userInfo.setUserLimit(userInfo.getUserLimit() + 1);
				UserStore.getUserDataMap().put(userID, userInfo);
				return true;
			}
			return false;
		} catch (Exception e) {
			throw e;
		}
	}

	private UserModel getUserInfo(Integer userID) throws Exception {
		try {
			UserInterface user = new User();
			userInfo = user.getUser(userID);
			return userInfo;
		} catch (Exception e) {
			throw e;
		}
	}

	private BooksModel getBookInfo(Integer bookID) throws Exception{
		try {
			BooksInterface book = new Books();
			bookInfo = book.getBook(bookID);
			return bookInfo;
		}catch (Exception e) {
			throw e;
		}
	}

	private TransactionModel getTransactionData(UserModel user, BooksModel book) throws Exception{
		try {
			transaction = new TransactionModel();
			transaction.setTransactionID(getTransactionID());
			transaction.setBookID(bookInfo.getBookID());
			transaction.setUserID(userInfo.getUserID());
			transaction.setBorrowedDate(getDate(0));
			transaction.setReturnedDate(getDate(10));
			transaction.setDueDate(getDate(12));
			return transaction;
		}catch (Exception e) {
			throw e;
		}
	}

	private int getTransactionID() throws Exception{
		try {
		return TransactionStore.getTransactionStoreMap().size() + 1;
		}catch (Exception e) {
			throw e;
		}
	}

	private Date getDate(int numberofDays) {
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		if (numberofDays > 0) {
			cal.add(Calendar.DATE, numberofDays);
		}
		return cal.getTime();
	}

	private String itoS(Integer intData) {
		return Integer.toString(intData);
	}

	public TransactionModel getTransaction(String ID) throws Exception {
		try {
			if (TransactionStore.getTransactionStoreMap().containsKey(ID)) {
				return TransactionStore.getTransactionStoreMap().get(ID);
			}else {
				throw new Error("No transaction Found");
			}
		}catch (Exception e) {
			throw e;
		}
	}

}
