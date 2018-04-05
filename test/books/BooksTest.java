package books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BooksTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		try {
			BooksModel bookData;
			BooksInterface infs = new Books();
			bookData = infs.createBook("Mein kalmf", "Adolf Hitler", "Hitler's Biography", "MccGraw");
			System.out.println(bookData.toString());
			infs.addBook(bookData);
			System.out.println(infs.getBook(bookData.getBookID()).toString());
			System.out.println(BookStore.getBooksStoreMap());
			
			for (BooksModel strTemp : infs.searchBook("Mein kalmf")){
				System.out.println(strTemp.toString());
			}
			
			for (BooksModel strTemp : infs.searchBook("Adolf Hitler")){
				System.out.println(strTemp.toString());
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
