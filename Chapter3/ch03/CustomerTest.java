package Chapter3.ch03;

public class CustomerTest {
  public static void main(String[] args) {
    
    Customer customerLee = new Customer("이순신", 1010);
    customerLee.bonusPoint = 1000;
    System.out.println(customerLee.showCustomerInfo());

    VIPCustomer vipCustomerKim = new VIPCustomer("김유신", 1020);
    vipCustomerKim.bonusPoint = 10000;
    System.out.println(vipCustomerKim.showCustomerInfo());

  }
}
