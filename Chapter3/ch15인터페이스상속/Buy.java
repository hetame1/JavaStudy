package Chapter3.ch15인터페이스상속;

public interface Buy {
  
  void buy();

  default void order() {
    System.out.println("buy order");
  }

}
