package Chapter3.ch14인터페이스요소;

public abstract class Calculator implements Calc {

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int subtract(int num1, int num2) {
    return num1 - num2;
  }
}
