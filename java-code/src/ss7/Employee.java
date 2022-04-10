package ss7;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 2:15 PM

    Project Name: java-code
*/

public class Employee {
    String empID;
    String empName;
    int salary;
    float commission;

    public Employee(String id, String name, int sal) {
        empID = id;
        empName = name;
        salary = sal;
    }

    public void calcCommission(float sales) {
        if(sales > 10000)
            commission = salary * 20/100;
        else
            commission = 0;
    }

    public void calcCommission(int overtime) {
        if(overtime > 8)
            commission = salary / 30;
        else
            commission = 0;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
    }

    public static void main(String[] args) {
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
    }

}
