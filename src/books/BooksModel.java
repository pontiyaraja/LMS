package books;

public class BooksModel {
	private Integer bookID;
	private String bookTitle;
	private String authorName;
	private String bookDescription;
	private String publisher;
	private boolean isAvailable;
	
	public Integer getBookID() {
		return bookID;
	}
	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	@Override
	public String toString() {
		return "BooksModel [bookID=" + bookID + ", bookTitle=" + bookTitle + ", authorName=" + authorName
				+ ", bookDescription=" + bookDescription + ", publisher=" + publisher + ", isAvailable=" + isAvailable
				+ "]";
	}
}
