package Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.mysql;

import Chapter3.ch13인터페이스와다형성.domain.userinfo.UserInfo;
import Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("Inser Into MYSQL DB userID = " + userInfo.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("Update Into MYSQL DB userID = " + userInfo.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.println("Delete Into MYSQL DB userID = " + userInfo.getUserId());
  }

}
