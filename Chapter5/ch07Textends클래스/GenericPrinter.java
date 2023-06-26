package Chapter5.ch06제네릭프로그래밍;

public class GenericPrinter<T extends Material> {

  private T material;

  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return material.toString();
  }

}
