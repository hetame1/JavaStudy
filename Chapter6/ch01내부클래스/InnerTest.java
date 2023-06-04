package Chapter6.ch01내부클래스;

class OutClass {
  private int num = 10;
  private static int sNum = 20;
  private InClass inClass;

  public OutClass() {
    inClass = new InClass();
  }

  private class InClass {
    int iNum = 100;

    // int static sInNum = 500;
    // 아우터 클래스가 아닌 인스턴스 클래스에서는 정적 변수를 선언할 수 없음(아우터가 먼저 생성되어야 하므로)

    void inTest() {
      System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");

      System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
    }
  }

  public void usingClass() {
    inClass.inTest();
  }

  static class InStaticClass {
    int iNum = 100;
    static int sInNum = 200;

    void inTest() {
      // System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); // 외부 클래스의
      // 인스턴스 변수는 못씀
      System.out.println("OutClass num = " + iNum + "(외부 클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
      System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 정적 변수)");
    }

    static void sTest() {
      // System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); // 외부 클래스의
      // 인스턴스 변수 못씀
      // System.out.println("OutClass num = " + iNum + "(외부 클래스의 인스턴스 변수)"); // 내부
      // 클래스의 인스턴스 변수 못씀

      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
      System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 정적 변수)");
    }

  }

}

public class InnerTest {
  public static void main(String[] args) {
    OutClass outClass = new OutClass();
    outClass.usingClass();

    OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
    sInClass.inTest();
  }
}
