package ch08복습;

public class Person {
  String name;
  String sex;
  int age;
  int stature;
  int weight;

  Person(int stature, int weight, int age, String sex, String name) {
    this.weight = weight;
    this.stature = stature;
    this.age = age;
    this.sex = sex;
    this.name = name;
  }

  public void personInfo() {
    System.out.println(String.format("키가 %d 이고 몸무게가 %d 킬로인 %s이 있습니다. 이름은 %s 이고 나이는 %d세입니다.", stature, weight, sex, name, age));
  }
}
