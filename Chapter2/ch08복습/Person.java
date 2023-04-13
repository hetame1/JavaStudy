package ch08복습;

public class Person {
  public int stature;
  public int weight;
  public int age;
  public String gender;
  public String Name;

  public Person(int stature, int weight, int age, String gender, String Name) {
    this.Name = Name;
    this.age = age;
    this.gender = gender;
    this.stature = stature;
    this.weight = weight;
  }

  public String personInfo() {
    return "키가 " + stature + "이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다. 이름은 " + Name + "이고 나이는 " + age + "세 입니다";
  }
}
