package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Books implements BooksInterface{
	BooksModel booksModel;
	public Map<Integer, BooksModel> addBook(BooksModel book) throws Exception{
		try {
			BookStore.getBooksStoreMap().put(book.getBookID(), book);
			addBookinSearchStore(book.getAuthorName(), book);
			addBookinSearchStore(book.getBookTitle(), book);
		}catch (Exception e) {
			throw e;
		}
		return BookStore.getBooksStoreMap();
	}
	public BooksModel createBook(String bookTitle, String authorName, String bookDescription, String publisher) throws Exception {
		try {
			BooksModel book = new BooksModel();
			book.setBookID(getBookID());
			book.setBookTitle(bookTitle);
			book.setAuthorName(authorName);
			book.setBookDescription(bookDescription);
			book.setPublisher(publisher);
			book.setAvailable(true);
		return book;
		}catch (Exception e) {
			throw e;
		}
	}
	public BooksModel getBooksModel() {
		return booksModel;
	}
	public void setBooksModel(BooksModel booksModel) {
		this.booksModel = booksModel;
	}
	public BooksModel getBook(Integer ID) throws Exception {
		try {
			if (BookStore.getBooksStoreMap().containsKey(ID)) {
				return BookStore.getBooksStoreMap().get(ID);
			}else {
				throw new Exception("no books found");
			}
		}catch (Exception e) {
			throw e;
		}
	}
	
	private Integer getBookID() throws Exception{
		try {
			return BookStore.getBooksStoreMap().size()+1;
		}catch (Exception e) {
			throw e;
		}
	}
	
	private void addBookinSearchStore(String key, BooksModel book) throws Exception{
		try {
			if (BookStore.getBookSearchMap().containsKey(key)) {
				List<BooksModel> searchArray = new ArrayList<BooksModel>(); 
				searchArray = BookStore.getBookSearchMap().get(key);
				if (!searchArray.contains(book)) {
				   searchArray.add(book);
				   BookStore.getBookSearchMap().put(key, searchArray);
			    }
			}else {
				List<BooksModel> searchArray = new ArrayList<BooksModel>();
				searchArray.add(book);
				BookStore.getBookSearchMap().put(key, searchArray);
			}
		}catch (Exception e) {
			throw e;
		}
	}
	@Override
	public List<BooksModel> searchBook(String key) throws Exception{
		try {
			if (BookStore.getBookSearchMap().containsKey(key)) {
				return BookStore.getBookSearchMap().get(key);
			}else {
				throw new Exception("No book found");
			}
		}catch (Exception e) {
			throw e;
		}
	}
}
