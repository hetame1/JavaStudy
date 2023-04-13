package ch06생성자;

public class Student {
  public int studentNumber;
  public String studentName;
  public int grade;

  public Student() {
  };

  public Student(int studentNumber, String studentName, int grade) {
    // this 를 붙여줘야 이름이 중복되는 문제가 생기지않음
    this.studentName = studentName;
    this.studentNumber = studentNumber;
    this.grade = grade;
  }

  public String showStudentInfo() {
    return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
  }
}
