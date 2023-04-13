package Chapter3.ch06다형성;

public class VIPCustomer extends Customer {

  double salesRatio;
  private String agentID;

  public String getAgentID() {
    return agentID;
  }

  public void setAgentID(String agentID) {
    this.agentID = agentID;
  }

  @Override
  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
    price -= (int) (price * salesRatio);
    return price;
  }

  public VIPCustomer(String customerName, int customerID) {
    super(customerName, customerID);

    bonusRatio = 0.05;
    salesRatio = 0.1;
    customerGrade = "VIP";
  }

}
