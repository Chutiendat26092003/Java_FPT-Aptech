package ss7;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 1:57 PM

    Project Name: java-code
*/

public class FourWheeler extends Vehicle{
    private boolean powerSteer;

    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {
//        vehicleNo = vId;
//        vehicleName = vName;
//        wheels = numWheels;
//        powerSteer = pSteer;

        super(vId, vName, numWheels);
        powerSteer = pSteer;
    }

    public void showDetails() {
        System.out.println("Vehicle no" + vehicleNo);
        System.out.println("Vehicle name" + vehicleName);
        System.out.println("Number of Wheels" + wheels);

        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }

    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("LA-09CS", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);
    }
}


