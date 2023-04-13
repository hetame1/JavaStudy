package ch11캡슐화;

public class TestReport {
  public static void main(String[] args) {

    MakeReport builder = new MakeReport();

    String report = builder.getReport();

    System.out.println(report);

  }
}
