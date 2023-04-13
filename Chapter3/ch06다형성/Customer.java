package Chapter3.ch06다형성;

public class Customer {

  protected int customerID;
  protected String customerName;
  protected String customerGrade;

  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerGrade() {
    return customerGrade;
  }

  public void setCustomerGrade(String customerGrade) {
    this.customerGrade = customerGrade;
  }

  int bonusPoint;
  double bonusRatio;

  public Customer(String customerName, int customerID) {
    this.customerName = customerName;
    this.customerID = customerID;

    customerGrade = "SILVER";
    bonusRatio = 0.01;
  }

  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
    return price;
  }

  public String showCustomerInfo() {
    return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";
  }

}
