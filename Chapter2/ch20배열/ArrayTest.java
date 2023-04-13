package ch20배열;

public class ArrayTest {
  public static void main(String[] args) {

    int[] arr = new int[10];
    int total = 0;

    for (int i = 0, num = 1; i < arr.length; i++) {
      arr[i] = num++;
    }

    // 향상된 for문
    // 배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용
    for (int i : arr) {
      total += i;
    }

    System.out.println(total);

  }
}
