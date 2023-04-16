package Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.oracle;

import Chapter3.ch13인터페이스와다형성.domain.userinfo.UserInfo;
import Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("Inser Into ORACLE DB userID = " + userInfo.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("Update Into ORACLE DB userID = " + userInfo.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.println("Delete Into ORACLE DB userID = " + userInfo.getUserId());
  }

}
