public class Rectangle {
    int width;
    int height;

    Rectangle() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }

    Rectangle(int wid, int hei) {
        System.out.println("Parameterized Constructor");
        width = wid;
        height = hei;
    }

    void displayDimensions(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
