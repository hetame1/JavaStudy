package Chapter3.ch04오버라이딩;

public class CustomerTest {
  public static void main(String[] args) {

    Customer customerLee = new Customer("이순신", 1010);
    customerLee.bonusPoint = 1000;
    int price = customerLee.calcPrice(1000);
    System.out.println(price);
    System.out.println(customerLee.showCustomerInfo());

    VIPCustomer vipCustomerKim = new VIPCustomer("김유신", 1020);
    vipCustomerKim.bonusPoint = 10000;
    int priceKim = vipCustomerKim.calcPrice(1000);
    System.out.println(priceKim);
    System.out.println(vipCustomerKim.showCustomerInfo());

    Customer vc = new VIPCustomer("test", 1030);
    System.out.println(vc.calcPrice(1000));
  
  }
}
