package ch15;

public class Person {

  String name;
  int money;
  
  public Person(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public void takeTaxi(Taxi taxi) {
    taxi.take(10000);
    money -= 10000;
  }

  public void personInfo() {
    System.out.println(String.format("%s님의 남은 돈은 %d원 입니다", name, money));
  }

}
