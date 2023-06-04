package Chapter5.ch06제네릭프로그래밍;

public class ThreeDPrinter3 {
  private Object material;

  public Object getMaterial() {
    return material;
  }

  public void setMaterial(Object material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "재료는 " + material + " 입니다.";
  }
}
