## 03. 연결 리스트

### LinkedList 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조

- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음

- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)

- 연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)

- jdk 클래스 : LinkedList

### 메모

내가 삭제하거나 넣으려고 하는곳에 previous를 알아야함

head 가 null 이라는것은 첫 노드라는 뜻

맨 마지막 노드를 찾을때는 next가 null인것을 찾으면 됨

```java
MyListNode temp = head;
while(temp.next != null){
  temp = temp.next;
}
temp.next = newNode;
```

중간에 넣을때는 현재 포지션 위치가 넣을 수 있는 위치인가 확인

맨 앞에 들어가는 경우(next가 head)는 head를 바꿔줘야함

for 문을 사용하면서 이전 노드를 찾아야함

```java
for (i = 0; i < position; i++) {
      preNode = tempNode;
      tempNode = tempNode.next;
    }
    newNode.next = preNode.next;
    preNode.next = newNode;
```

첫 노드를 삭제할때는 head를 바꿔줘야함

중간 노드를 삭제할때는 이전 노드의 next를 삭제할 노드의 next로 바꿔줘야함

지워지는건 temp 노드
