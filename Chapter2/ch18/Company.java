package ch18;

public class Company {

  // 유일한 객체
  private static Company instatnce = new Company();

  private Company() {

  }

  public static Company getInstance() {
    if (instatnce == null) {
      instatnce = new Company();
    }
    return instatnce;
  }

}