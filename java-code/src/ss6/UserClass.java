package ss6;

/* 
    @author: chu tien dat
    Date: 4/9/2022
    Time: 5:04 PM

    Project Name: java-code
*/

import java.util.ArrayList;

public class UserClass {
    ArrayList myCart = new ArrayList();

    public void createList() {
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");

        System.out.println("Cart contents are: " + myCart);
    }

    public static void main(String[] args) {
        UserClass objUser = new UserClass();
        objUser.createList();

        staticMembers objStatic = new staticMembers();
        objStatic.displayCount();
    }
}
