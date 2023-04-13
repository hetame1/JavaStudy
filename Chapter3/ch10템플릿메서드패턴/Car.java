package Chapter3.ch10템플릿메서드패턴;

public abstract class Car {

  public abstract void drive();

  public abstract void stop();

  public abstract void wiper();

  public void startCar() {
    System.out.println("시동을 켭니다");
  }

  public void turnOff() {
    System.out.println("시동을 끕니다");
  }

  // 추상메서드가 아님 필요한 경우 오버라이딩 (훅메서드)
  public void washCar() {
  }

  // 시나리오 변하면 안됨(final 선언)
  final public void run() {
    startCar();
    drive();
    wiper();
    stop();
    turnOff();
    washCar();
  }

}
