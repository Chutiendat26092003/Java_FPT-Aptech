package ss7;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 2:47 PM

    Project Name: java-code
*/

import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        if (args.length == 2) {
            shape = args[0].toLowerCase();
            switch (shape) {
                case "circle": objShape = new Circle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;

                case "rectangle": objShape = new Rectangle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
            }
        }
        else {
            System.out.println("Usage: java Calculator<shape-name><value>");
        }
    }
}
