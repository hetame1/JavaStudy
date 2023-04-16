package Chapter3.ch13인터페이스와다형성.domain.userinfo.dao;

import Chapter3.ch13인터페이스와다형성.domain.userinfo.UserInfo;

public interface UserInfoDao {

  void insertUserInfo(UserInfo userinfo);

  void updateUserInfo(UserInfo userInfo);

  void deleteUserInfo(UserInfo userInfo);
}
