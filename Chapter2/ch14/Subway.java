package ch14;

public class Subway {

  int lineNumber;
  int passengerCount;
  int money;

  public Subway(int lineNumber) {
    this.lineNumber = lineNumber;
  }

  public void take(int money) {
    this.money += money;
    passengerCount++;
  }

  public void showSubwayInfo() {
    System.out.println(String.format("%d번의 승객 수는 %d명이고, 수입은 %d원입니다",lineNumber, passengerCount, money));
  }

}
