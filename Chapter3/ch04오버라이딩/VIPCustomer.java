package Chapter3.ch04오버라이딩;

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

    System.out.println("VIPCustomer 호출");
  }

}
