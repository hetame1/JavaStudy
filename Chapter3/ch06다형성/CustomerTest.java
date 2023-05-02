package Chapter3.ch06다형성;

import java.util.ArrayList;

public class CustomerTest {
  public static void main(String[] args) {

    ArrayList<Customer> customerList = new ArrayList<>();

    Customer customerT = new Customer("Tomas", 10010);
    Customer customerJ = new Customer("James", 10020);
    Customer customerE = new GoldCustomer("Edward", 10010);
    Customer customerP = new GoldCustomer("Percy", 10010);
    Customer customerK = new VIPCustomer("Kim", 10010);

    VIPCustomer customerV = new VIPCustomer("Vip", 10010);

    customerList.add(customerT);
    customerList.add(customerJ);
    customerList.add(customerE);
    customerList.add(customerP);
    customerList.add(customerK);

    for (Customer customer : customerList) {
      System.out.println(customer.showCustomerInfo());
    }

    int price = 10000;
    for (Customer customer : customerList) {
      int cost = customer.calcPrice(price);

      System.out.println(String.format("%s 님이 %d원 지불하셨습니다", customer.getCustomerName(), cost));
      System.out.println(String.format("%s 님의 현재 보너스 포인트는 %d 입니다", customer.getCustomerName(), customer.bonusPoint));
    }

  }
}
