package ch15복습;

public class TakeTest {
  public static void main(String[] args) {
    Person edward = new Person("edward", 20000);

    Taxi goodDayTaxi = new Taxi("잘 간다 운수");

    edward.takeTaxi(goodDayTaxi);

    edward.personInfo();
    goodDayTaxi.taxiInfo();
  }
}
