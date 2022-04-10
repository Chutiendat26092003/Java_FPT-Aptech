package ss7;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 2:27 PM

    Project Name: java-code
*/

public class PartTimeEmployee extends Employee{
    String shift;

    public PartTimeEmployee(String id, String name, int sal, String shift) {
        super(id, name, sal);
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift" + shift);
    }

    public static void main(String[] args) {
        Employee objEmp = new Employee("E001", "Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();

        System.out.println("------------------");

        Employee ebjEmp1 = new PartTimeEmployee("E002", "Rob Smith", 30000, "Day");
        ebjEmp1.displayDetails();
    }
}
