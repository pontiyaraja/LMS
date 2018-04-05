package books;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
	public static Map<Integer, BooksModel> booksStoreMap = new HashMap<Integer, BooksModel>();
	public static Map<String, List<BooksModel>> bookSearchMap = new HashMap<String, List<BooksModel>>();

	public static Map<Integer, BooksModel> getBooksStoreMap() {
		return booksStoreMap;
	}

	public static void setBooksStoreMap(Map<Integer, BooksModel> booksStoreMap) {
		BookStore.booksStoreMap = booksStoreMap;
	}

	@Override
	public String toString() {
		return "BookStore [booksStoreMap=" + booksStoreMap + "]";
	}

	public static Map<String, List<BooksModel>> getBookSearchMap() {
		return bookSearchMap;
	}

	public static void setBookSearchMap(Map<String, List<BooksModel>> bookSearchMap) {
		BookStore.bookSearchMap = bookSearchMap;
	}
	
}
