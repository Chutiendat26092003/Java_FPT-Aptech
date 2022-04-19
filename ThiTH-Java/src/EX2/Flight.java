package EX2;

/* 
    @author: chu tien dat
    Date: 4/19/2022
    Time: 8:53 AM

    Project Name: ThiTH-Java
*/

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println(this.number + ", " + this.destination);
    }
}
