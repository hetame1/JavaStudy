package ch04인스턴스;

public class StudentTest {
  public static void main(String[] args) {

    Student studentLee = new Student();

    studentLee.studentId = 12345;
    studentLee.setStudentName("Lee");
    studentLee.address = "서울 강남구";

    studentLee.showStudentInfo();

    Student studentKim = new Student();

    studentKim.studentId = 54321;
    studentKim.studentName = "Kim";
    studentKim.address = "서울 강북구";

    studentKim.showStudentInfo();
  }
}
