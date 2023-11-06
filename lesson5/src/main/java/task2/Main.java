package task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("black", "black", 2, 3);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getBorderColor());
        System.out.println(rectangle.getFillColor());

        Circle circle = new Circle("red", "red", 3);
        System.out.println(circle.getSquare());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getBorderColor());
        System.out.println(circle.getFillColor());

        Triangle triangle = new Triangle("green", "black", 2,3,4);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getBorderColor());
        System.out.println(triangle.getFillColor());
    }
}
