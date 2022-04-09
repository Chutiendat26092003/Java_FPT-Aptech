package ss6;
/* 
    @author: chu tien dat
    Date: 4/9/2022
    Time: 4:51 PM

    Project Name: java-code
*/

public class staticMembers {
    public static int staticCounter = 0;
    int instanceCounter = 0;

    static {
        System.out.println("I am static block");
    }

    /**
     * Static method
     *
     * @return void
     */

    public static void staticMethod() {
        System.out.println("I am static method");
    }

    public void displayCount() {
        staticCounter++;
        instanceCounter++;

        System.out.println("Static counter is: " + staticCounter);
        System.out.println("Instance counter is: " + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("I am the main method");

        staticMembers.staticMethod();

        staticMembers obj = new staticMembers();
        obj.displayCount();

        staticMembers obj2 = new staticMembers();
        obj2.displayCount();

        staticMembers obj3 = new staticMembers();
        obj3.displayCount();
    }
}
