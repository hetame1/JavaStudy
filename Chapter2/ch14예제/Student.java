package ch14예제;

public class Student {

  String studentName;
  int money;

  public Student(String studentName, int money) {
    this.studentName = studentName;
    this.money = money;
  }

  public void takeBus(Bus bus) {
    bus.take(1000);
    this.money -= 1000;
  }

  public void takeSubway(Subway subway) {
    subway.take(1200);
    this.money -= 1200;
  }

  public void showInfo() {
    System.out.println(String.format("%s 님의 남은 돈은 %d 원 입니다.", studentName, money));
  }

}
