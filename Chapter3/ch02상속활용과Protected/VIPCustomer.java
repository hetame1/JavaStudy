package Chapter3.ch02상속활용과Protected;

public class VIPCustomer extends Customer {

  double salesRatio;
  private String agentID;

  public String getAgentID() {
    return agentID;
  }

  public void setAgentID(String agentID) {
    this.agentID = agentID;
  }

  public VIPCustomer() {
    bonusRatio = 0.05;
    salesRatio = 0.1;
    customerGrade = "VIP";
  }

}
