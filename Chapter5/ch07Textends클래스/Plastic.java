package Chapter5.ch06제네릭프로그래밍;

public class Plastic extends Material {
  @Override
  public String toString() {
    return "재료는 Plastic 입니다.";
  }

  @Override
  public void doPrinting() {
    System.out.println("Plastic으로 프린팅합니다.");
  }
}
