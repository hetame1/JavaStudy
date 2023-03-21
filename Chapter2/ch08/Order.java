package ch08;

public class Order {
  public String receiptNumber;
  public String phoneNumber;
  public String address;
  public int orderDate;
  public int orderTime;
  public int price;
  public int menuNumber;

  public Order(String phoneNumber, String address, int menuNumber) {
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.menuNumber = menuNumber;
  }

  public String orderInfo() {
    return "주문 접수 번호 : " + receiptNumber + "\n"
         + "주문 핸드폰 번호 : " + phoneNumber + "\n"
         + "주문 집 주소 : " + address + "\n"
         + "주문 날짜 : " + orderDate + "\n"
         + "주문 시간 : " + orderTime + "\n"
         + "주문 가격 : " + price + "\n" 
         + "메뉴 번호 : " + menuNumber;
  }

}
