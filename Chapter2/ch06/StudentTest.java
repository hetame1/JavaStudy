package ch06;

public class StudentTest {
  public static void main(String[] args) {

    // 이렇게 하려면 기본생성자를 따로 만들어줘야함
    Student studentLee = new Student();
    studentLee.grade = 1;

    System.out.println(studentLee.showStudentInfo());

    Student studentKim = new Student(12345, "Kim", 3);
    System.out.println(studentKim.showStudentInfo());

  }

}
