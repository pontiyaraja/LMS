package lmsprocess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import books.Books;
import books.BooksInterface;
import books.BooksModel;
import user.User;
import user.UserInterface;
import user.UserModel;

class TransactionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		try {
			BooksModel bookData;
			BooksInterface infs = new Books();
			bookData = infs.createBook("Mein kalmf", "Adolf Hitler", "Hitler's Biography", "MccGraw");
			infs.addBook(bookData);
			BooksModel bookData1 = new BooksModel();
			bookData1 = infs.getBook(bookData.getBookID());
			
			UserModel userData;
			UserInterface uInfs = new User();
			userData = uInfs.createUSer("Pontiya", "pan@lms.com", "21232323", "Pan", "Diya", 10);
			uInfs.addUser(userData);
			UserModel um = new UserModel();
			um = uInfs.getUser(userData.getUserID());
			
			TransactionModel transx;
			TransactionInterface txInfs = new Transaction();
		
			transx = txInfs.lendBook(um.getUserID(), bookData1.getBookID());
			System.out.println(transx.toString());
			System.out.println(TransactionStore.getTransactionStoreMap().toString());
			
			txInfs.returnBook(um.getUserID(), bookData1.getBookID());
			System.out.println(TransactionStore.getTransactionStoreMap().toString());
			
			transx = txInfs.lendBook(um.getUserID(), bookData1.getBookID());
			System.out.println(transx.toString());
			System.out.println(TransactionStore.getTransactionStoreMap().toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
