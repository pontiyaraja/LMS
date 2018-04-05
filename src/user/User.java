package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User implements UserInterface{
	UserModel userModel;
	@Override
	public UserModel createUSer(String userName, String email, String phone, String firstName,
			String lastName, int userLimit) throws Exception{
		try {
			UserModel userModel = new UserModel();
			userModel.setUserID(getUserID());
			userModel.setUserName(userName);
			userModel.setEmail(email);
			userModel.setFirstName(firstName);
			userModel.setLastName(lastName);
			userModel.setPhoneNumber(phone);
			userModel.setUserLimit(userLimit);
			return userModel;
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Map<Integer, UserModel> addUser(UserModel user) throws Exception{
		try {
			UserStore.getUserDataMap().put(user.getUserID(), user);
			addUserinSearchStore(user.getUserName(), user);
			return UserStore.getUserDataMap();
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public UserModel getUser(Integer userID) throws Exception {
		try {
			if (UserStore.getUserDataMap().containsKey(userID)) {
				return UserStore.getUserDataMap().get(userID);
			}else {
				throw new Exception("No user found");
			}
			}catch (Exception e) {
				throw e;
			}
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
	
	private Integer getUserID() throws Exception{
		try {
			return UserStore.getUserDataMap().size()+1;
		}catch (Exception e) {
			throw e;
		}
	}
	
	private void addUserinSearchStore(String key, UserModel user) throws Exception{
		try {
			if (UserStore.getUserSearchMap().containsKey(key)) {
				List<UserModel> searchArray = new ArrayList<UserModel>(); 
				searchArray = UserStore.getUserSearchMap().get(key);
				if (!searchArray.contains(user)) {
				   searchArray.add(user);
				   UserStore.getUserSearchMap().put(key, searchArray);
			    }
			}else {
				List<UserModel> searchArray = new ArrayList<UserModel>();
				searchArray.add(user);
				UserStore.getUserSearchMap().put(key, searchArray);
			}
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<UserModel> searchUser(String searchKey) throws Exception {
		try {
			if (UserStore.getUserSearchMap().containsKey(searchKey)) {
				return UserStore.getUserSearchMap().get(searchKey);
			}else {
				throw new Exception("No book found");
			}
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public boolean setUserLimit(Integer userID, int limit) throws Exception {
		if (UserStore.getUserDataMap().containsKey(userID)) {
			UserModel user = new UserModel();
			user = UserStore.getUserDataMap().get(userID);
			user.setUserLimit(limit);
			UserStore.getUserDataMap().put(userID, user);
		}else {
			throw new Exception("user not found");
		}
		return false;
	}
}
