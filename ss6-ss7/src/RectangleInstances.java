public class RectangleInstances {
    public static void main(String[] args) {
        Rectangle objRec1 = new Rectangle(10, 20);
        Rectangle objRec2 = new Rectangle(6, 9);

        System.out.println("\nRectangle1 Details");
        System.out.println("===================");
        objRec1.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        objRec2.displayDimensions();
    }
}