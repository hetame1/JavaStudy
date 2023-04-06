package ch24;

import java.util.ArrayList;

public class Student {
  
  private int studentId;
  private String studentName;
  ArrayList<Subject> subjectList;
  int total;

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;

    subjectList = new ArrayList<>();
  }

  public void addSubject(String name, int score) {
    Subject subject = new Subject();
    subject.setName(name);
    subject.setScore(score);

    subjectList.add(subject);
  }

  public void showStudentInfo() {
    for (Subject subject : subjectList) {
      total += subject.getScore();
      System.out.println(String.format("학생 %s의 %s 과목 성적은 %d 입니다", studentName, subject.getName(), subject.getScore()));
    }
    System.out.println(String.format("학생 %s의 총점은 %d 입니다.", studentName, total));
  }

}
