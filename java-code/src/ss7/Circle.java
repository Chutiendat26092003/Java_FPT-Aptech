package ss7;

/* 
    @author: chu tien dat
    Date: 4/10/2022
    Time: 2:39 PM

    Project Name: java-code
*/

class Circle extends Shape{
    float area;

    void calculate (float rad) {
        area = getPI() * rad * rad;
        System.out.println("Area of circle is: " + area);
    }
}

class Rectangle extends Shape {
    float perimeter;
    float length = 10;

    @Override
    void calculate(float width) {
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle is: " + perimeter);
    }
}
