package Chapter5.ch06제네릭프로그래밍;

public class Powder extends Material {
  @Override
  public String toString() {
    return "재료는 Powder 입니다.";
  }

  @Override
  public void doPrinting() {
    System.out.println("Powder로 프린팅합니다.");
  }
}
