package Chapter6.ch02익명클래스;

class Outer2 {
  Runnable getRunnable() {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Runnable이 구현된 익명 클래스 변수");
      }
    };
    return runnable;
  }
}

public class AnonumousInnerTest {

}
