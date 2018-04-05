package lmsprocess;

import java.util.Date;

public class TransactionModel {
	private Integer transactionID;
	private int bookID;
	private int userID;
	private Date borrowedDate;
	private Date dueDate;
	private Date returnedDate;
	private boolean isReturned;
	
	public Integer getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Date getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
	public boolean isReturned() {
		return isReturned;
	}
	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}
	@Override
	public String toString() {
		return "TransactionModel [transactionID=" + transactionID + ", bookID=" + bookID + ", userID=" + userID
				+ ", borrowedDate=" + borrowedDate + ", dueDate=" + dueDate + ", returnedDate=" + returnedDate
				+ ", isReturned=" + isReturned + "]";
	}
	
}
