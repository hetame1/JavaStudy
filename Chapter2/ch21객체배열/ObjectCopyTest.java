package ch21객체배열;

public class ObjectCopyTest {
  public static void main(String[] args) {

    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];

    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");

    // System.arraycopy(library, 0, copyLibrary, 0, 5);

    copyLibrary[0] = new Book();
    copyLibrary[1] = new Book();
    copyLibrary[2] = new Book();
    copyLibrary[3] = new Book();
    copyLibrary[4] = new Book();

    for (int i = 0; i < copyLibrary.length; i++) {
      copyLibrary[i].setAuthor(library[i].getAuthor());
      copyLibrary[i].setTitle(library[i].getTitle());
    }

    System.out.println("========원본========");
    for (Book book : library) {
      System.out.println(book);
      book.showInfo();
    }

    System.out.println("=========카피========");
    for (Book book : copyLibrary) {
      System.out.println(book);
      book.showInfo();
    }

  }
}
