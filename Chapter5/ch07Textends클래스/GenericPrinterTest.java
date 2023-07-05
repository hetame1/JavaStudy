package Chapter5.ch07Textends클래스;

public class GenericPrinterTest {
  public static void main(String[] args) {

    GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
    Powder powder = new Powder();

    powderPrinter.setMaterial(powder);

    Powder p = powderPrinter.getMaterial();

    System.out.println(powderPrinter.toString());

  }
}
