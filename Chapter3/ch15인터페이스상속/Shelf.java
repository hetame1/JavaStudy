package Chapter3.ch15인터페이스상속;

import java.util.ArrayList;

public class Shelf {
  protected ArrayList<String> shelf;

  public Shelf() {
    shelf =  new ArrayList<String>();
  }

  public ArrayList<String> getShelf() {
    return shelf;
  } 

  int getCount() {
    return shelf.size();
  }
}
