package Chapter3.ch06다형성;

public class GoldCustomer extends Customer {

  double salesRatio;

  public GoldCustomer(String customerName, int customerID) {
    super(customerName, customerID);

    salesRatio = 0.1;
    bonusRatio = 0.02;
    customerGrade = "Gold";
  }

  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
    price -= (int) (price * salesRatio);
    return price;
  }

}
