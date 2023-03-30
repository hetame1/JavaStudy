package ch15;

public class Taxi {
  
  String taxiName;
  int money;

  public Taxi(String taxiName) {
    this.taxiName = taxiName;
  } 

  public void take(int money) {
    this.money += money;
  }

  public void taxiInfo() {
    System.out.println(String.format("%s택시 수입은 %d원 입니다.", taxiName, money));
  }
}
