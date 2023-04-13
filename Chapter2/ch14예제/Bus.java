package ch14예제;

public class Bus {

  int busNumber;
  int passengerCount;
  int money;

  public Bus(int busNumber) {
    this.busNumber = busNumber;
  }

  public void take(int money) {
    this.money += money;
    passengerCount++;
  }

  public void showBusInfo() {
    System.out.println(String.format("%d번의 승객 수는 %d명이고, 수입은 %d원입니다", busNumber, passengerCount, money));
  }

}
