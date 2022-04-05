public class TestObjectReferences {
    public static void main(String[] args) {
        Rectangle objRec1 = new Rectangle(10, 20);

        Rectangle objRec2;

        objRec2 = objRec1;

        System.out.println("\nRectangle1 Details");
        System.out.println("===================");

        objRec1.displayDimensions();

        System.out.println("\nRectangle2 Details");
        System.out.println("===================");
        objRec2.displayDimensions();
    }

}
