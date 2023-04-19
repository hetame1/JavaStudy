package ch19복습;

public class CarTest {
  public static void main(String[] args) {

    CarFactory factory = CarFactory.getInstance();

    Car mySonata = factory.createCar();
    Car yourSonata = factory.createCar();

    System.out.println(mySonata.getCarNum());
    System.out.println(yourSonata.getCarNum());

  }
}
