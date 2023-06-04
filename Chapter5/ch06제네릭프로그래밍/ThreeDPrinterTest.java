package Chapter5.ch06제네릭프로그래밍;

public class ThreeDPrinterTest {
  public static void main(String[] args) {

    Powder powder = new Powder();
    ThreeDPrinter3 printer = new ThreeDPrinter3();

    printer.setMaterial(powder);

    Powder p = (Powder) printer.getMaterial();

  }
}
