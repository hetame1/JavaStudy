package ch06생성자;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userLee = new UserInfo();
		userLee.userId = "1234";
		userLee.userPassWord = "1234";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01000000000";
		userLee.userAddress = "Seoul, Korea";

		System.out.println(userLee.showUserInfo());

		UserInfo userKim = new UserInfo("123", "123", "Kim");
		System.out.println(userKim.showUserInfo());

	}

}
