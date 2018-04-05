package books;

import java.util.List;
import java.util.Map;

public interface BooksInterface {
	public BooksModel createBook(String bookTitle, String authorName, String bookDescription, String publisher) throws Exception;
	public Map<Integer, BooksModel> addBook(BooksModel book) throws Exception;
	public BooksModel getBook(Integer ID) throws Exception;
	public List<BooksModel> searchBook(String key) throws Exception;
}
