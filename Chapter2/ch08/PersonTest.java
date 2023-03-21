package ch08;

public class PersonTest {
  
  public static void main(String[] args) {
    
    Person tomas = new Person(180, 78, 37, "남성", "Tomas");
    
    System.out.println(tomas.personInfo());
  }
}
