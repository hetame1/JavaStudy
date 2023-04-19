package ch19복습;

public class CarFactory {

  private static CarFactory instance = new CarFactory();

  public static CarFactory getInstance() {
    if (instance == null) {
      instance = new CarFactory();
    }

    return instance;
  }

  private CarFactory() {

  }

  public Car createCar() {

    return new Car();
  }

}
