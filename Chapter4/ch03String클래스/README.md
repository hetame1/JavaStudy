## String 클래스

- String 선언하기

```java
String str1 = new String("abc");
String str2 = "abc";
```

- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법

- 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐

```java
String str1 = new String("abc");
String str2 = new String("abc");
str1 === str2 // false

String str3 = "abc";
String str4 = "abc";
str3 === str4 // true
```

- 한번 생성된 String은 불변(immutable)
- String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성
- 문자열 연결을 계속하면 메모리에 garbage가 많이 생길 수 있음

이럴 때 StringBuilder나 StringBuffer를 사용

### StringBuilder, StringBuffer

- 내부적으로 가변적인 char[]를 멤버 변수로 가짐

- 문자열을 여러번 연결하거나 변경할 때 사용하면 유용함

- 새로운 인스턴스를 생성하지 않고 char[] 를 변경함

- StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장

- 단인 쓰레드 프로그램에서는 StringBuilder 사용을 권장

- toString() 메서드로 String반환

### text block (java 13)

- 여러줄의 문자열을 """ """ 사이에 작성
- html.json 파일을 읽어서 문자열로 반환할 때 유용
