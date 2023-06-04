package Chapter5.ch06제네릭프로그래밍;

public class ThreeDPrinter2 {
  private Plastic material;

  public Plastic getMaterial() {
    return material;
  }

  public void setMaterial(Plastic material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "재료는 Plastic 입니다.";
  }
}
