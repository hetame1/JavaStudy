## 메서드 재정의 오버라이딩(Overriding)

### 하위 클래스에서 메서드 재정의 하기

- 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
  하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음

- VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음

- 재정의 하여 구현해야 함

### @overriding 애노테이션 (annotation)

- 애노테이션은 원래 주석이라는 의미

- 컴파일러에게 특별한 정보를 제공해주는 역할

<img src="https://user-images.githubusercontent.com/121005861/230776347-7f52b7a7-1d60-46e4-94ef-3e544a5efed0.png" />

### 형 변환과 오버라이딩 메서드 호출

Customer vc = new VIPCustomer();
vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer
자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상메서드의 원리)
자바의 모든 메서드는 가상 메서드(virtual method) 임
