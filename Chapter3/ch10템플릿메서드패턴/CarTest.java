package Chapter3.ch10템플릿메서드패턴;

public class CarTest {
  public static void main(String[] args) {

    Car aiCar = new AICar();
    aiCar.run();

    System.out.println("-------------");

    Car mCar = new ManualCar();
    mCar.run();

  }
}
