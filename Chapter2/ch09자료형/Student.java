package ch09자료형;

public class Student {
	int studentID;
	String studentName;

	Subject korea;
	Subject math;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		// 생성자에 생성안해줘도 되는데 쓰기전에 생성해줘야 오류가 안남
		korea = new Subject();
		math = new Subject();
	}

	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}

	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}

}
