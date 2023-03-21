package ch08;

public class OrderTest {
  
  public static void main(String[] args) {
    
    Order foodOrder = new Order("01023450001", "서울시 강남국 역삼동 111-333", 0003);

    foodOrder.receiptNumber = "202011020003";
    foodOrder.orderDate = 20201102;
    foodOrder.orderTime = 130258;
    foodOrder.price = 35000;

    System.out.println(foodOrder.orderInfo());

  }
}
