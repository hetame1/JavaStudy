package Chapter5.ch06제네릭프로그래밍;

public class GenericPrinterTest {
  public static void main(String[] args) {

    GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
    Powder powder = new Powder();

    powderPrinter.setMaterial(powder);

    Powder p = powderPrinter.getMaterial();

    System.out.println(powderPrinter.toString());

  }
}
