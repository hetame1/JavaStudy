package ch12This;

public class Person {

  String name;
  int age;

  public Person() {
    this("unkonwn", 1);
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showPerson() {
    System.out.println(name + "," + age);
  }

  public Person getPerson() {
    return this;
  }

  public static void main(String[] args) {

    Person person = new Person();
    person.showPerson();

    System.out.println(person);

    Person person2 = person.getPerson();
    System.out.println(person2);

  }

}
