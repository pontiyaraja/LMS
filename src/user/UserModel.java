package user;

public class UserModel {
	private Integer userID;
	private String userName;
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private int userLimit;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getUserLimit() {
		return userLimit;
	}
	public void setUserLimit(int userLimit) {
		this.userLimit = userLimit;
	}
	@Override
	public String toString() {
		return "UserModel [userID=" + userID + ", userName=" + userName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", FirstName=" + firstName + ", LastName=" + lastName + ", userLimit=" + userLimit
				+ "]";
	}
}
