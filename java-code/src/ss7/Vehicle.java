package ss7;
/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 1:51 PM

    Project Name: java-code
*/

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public void accelerate(int speed) {
        System.out.println("Accelerating at: " + speed + "kmph");
    }

    public Vehicle(String vId, String vName, int numWheels) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
    }
}
