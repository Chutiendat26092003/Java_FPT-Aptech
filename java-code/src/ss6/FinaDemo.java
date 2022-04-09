package ss6;
/* 
    @author: chu tien dat
    Date: 4/9/2022
    Time: 4:34 PM

    Project Name: java-code
*/

public class FinaDemo {
    final float PI = 3.14F;

    public void display(float pi) {
//        this.PI = pi;
        System.out.println("The value of PI is: " + PI);
    }

    public static void main(String[] args) {
        final FinaDemo objFinaDemo = new FinaDemo();
        objFinaDemo.display(22.7F);
    }
}
