package EX1;

/* 
    @author: chu tien dat
    Date: 4/19/2022
    Time: 8:34 AM

    Project Name: ThiTH-Java
*/

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(5000, 20);
        System.out.printf("Calculate Interest: $%.2f%n", b1.calculateInterest());
    }
}
