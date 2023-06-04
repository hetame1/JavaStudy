package Chapter5.ch06제네릭프로그래밍;

public class ThreeDPrinter1 {
  private Powder material;

  public Powder getMaterial() {
    return material;
  }

  public void setMaterial(Powder material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "재료는 Powder 입니다.";
  }
}
