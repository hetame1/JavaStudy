package Chapter3.ch09추상클래스;

public class Desktop extends Computer {

  @Override
  public void display() {
    System.out.println("Desktop display");
  }

  @Override
  public void typing() {
    System.out.println("Desktop typing");
  }

  @Override
  public void turnOff() {
    System.out.println("Desktop turnOff");
  }

}
