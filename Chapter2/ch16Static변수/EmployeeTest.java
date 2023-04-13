package ch16Static변수;

public class EmployeeTest {

  public static void main(String[] args) {

    System.out.println(Employee.getSerialNum());

    Employee employeeLee = new Employee();
    employeeLee.setEmployeeName("이순신");

    Employee employeeKim = new Employee();
    employeeKim.setEmployeeName("김유신");

    System.out.println(employeeLee.getEmployeeId());
    System.out.println(employeeKim.getEmployeeId());

  }

}
