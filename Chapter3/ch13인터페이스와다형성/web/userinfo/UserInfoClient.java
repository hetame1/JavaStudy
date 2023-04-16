package Chapter3.ch13인터페이스와다형성.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Chapter3.ch13인터페이스와다형성.domain.userinfo.UserInfo;
import Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.UserInfoDao;
import Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import Chapter3.ch13인터페이스와다형성.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("db.properties");

    Properties prop = new Properties();
    prop.load(fis);

    String dbType = prop.getProperty("DBTYPE");

    UserInfo userInfo = new UserInfo();

    UserInfoDao userInfoDao = null;

    if (dbType.equals("ORACLE")) {
      userInfoDao = new UserInfoOracleDao();
    } else if (dbType.equals("MYSQL")) {
      userInfoDao = new UserInfoMySqlDao();
    } else {
      System.out.println("db error");
      return;
    }

    userInfoDao.insertUserInfo(userInfo);
    userInfoDao.updateUserInfo(userInfo);
    userInfoDao.deleteUserInfo(userInfo);

  }
}
