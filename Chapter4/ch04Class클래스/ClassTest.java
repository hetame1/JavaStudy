package Chapter4.ch04Class클래스;

import java.lang.reflect.Constructor;

public class ClassTest {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Class c1 = Class.forName("Chapter4.ch04Class클래스.Person");

    Person person = c1.newInstance();

    person.setName("Kim");
    System.out.println(person);

    Class c2 = person.getClass();
    Person p = (Person) c2.newInstance();
    System.out.println(p);

    Class[] parameterTypes = { String.class };
    Constructor cons = c2.getConstructor(parameterTypes);

    Object[] initargs = { "Lee" };
    Person Lee = cons.newInstance(initargs);
  }
}
