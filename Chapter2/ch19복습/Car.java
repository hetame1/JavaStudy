package ch19복습;

public class Car {

  private static int num = 10000;
  private int carNum;

  public int getCarNum() {
    return carNum;
  }

  public Car() {
    num++;
    carNum = num;
  }

}
