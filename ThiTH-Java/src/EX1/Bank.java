package EX1;

/* 
    @author: chu tien dat
    Date: 4/19/2022
    Time: 8:32 AM

    Project Name: ThiTH-Java
*/

public class Bank {
    private double balance;
    private double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest() {
        return balance*(rate/1200);
    }
}
