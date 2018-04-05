package user;

import java.util.List;
import java.util.Map;

public interface UserInterface {
	public UserModel createUSer(String userName, String email, String phone, String firstName, String lastName, int userLimit) throws Exception;
	public Map<Integer, UserModel> addUser(UserModel user) throws Exception;
	public UserModel getUser(Integer userID) throws Exception;
	public List<UserModel> searchUser(String searchKey) throws Exception;
	public boolean setUserLimit(Integer userID, int limit) throws Exception;
}
