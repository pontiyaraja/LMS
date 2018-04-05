package user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStore {
	public static Map<Integer, UserModel> userDataMap  = new HashMap<Integer, UserModel>();
	public static Map<String, List<UserModel>> userSearchMap  = new HashMap<String, List<UserModel>>();
	public static Map<Integer, UserModel> getUserDataMap() {
		return userDataMap;
	}

	public static void setUserDataMap(Map<Integer, UserModel> userDataMap) {
		UserStore.userDataMap = userDataMap;
	}
	
	public static Map<String, List<UserModel>> getUserSearchMap() {
		return userSearchMap;
	}

	public static void setUserSearchMap(Map<String, List<UserModel>> userSearchMap) {
		UserStore.userSearchMap = userSearchMap;
	}

	@Override
	public String toString() {
		return "UserStore [userDataMap=" + userDataMap + "]";
	}
}
