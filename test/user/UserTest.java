package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		try {
			UserModel userData;
			UserInterface infs = new User();
			userData = infs.createUSer("Pontiya", "pan@lms.com", "21232323", "Pan", "Diya", 10);
			System.out.println(userData.toString());
			infs.addUser(userData);
			System.out.println(infs.getUser(userData.getUserID()).toString());
			System.out.println(UserStore.getUserDataMap().toString());
			for (UserModel strTemp : infs.searchUser("Pontiya")){
				System.out.println(strTemp.toString());
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
