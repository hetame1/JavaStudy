package Chapter3.ch15인터페이스상속;

public interface Sell {
  
  void sell();

  default void order() {
    System.out.println("sell order");
  }
}
