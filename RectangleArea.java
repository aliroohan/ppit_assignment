class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 4; 
        r1.width = 2; 

        double area = r1.calculateArea();
        double perimeter = r1.calculatePerimeter();

        System.out.printf("Length is %.2f%n", r1.length);
        System.out.printf("Width is %.2f%n", r1.width); 
        System.out.printf("Area is %.2f%n", area); 
        System.out.printf("Perimeter is %.2f%n", perimeter); 
    }
}
