package ss7;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 2:38 PM

    Project Name: java-code
*/

abstract class Shape {
    private final float PI = 3.14F;

    public float getPI() {
        return PI;
    }

    abstract void calculate(float val);
}
