package task2;

public class Rectangle extends Figure implements IFigureInfo{

    private double side1;
    private double side2;
    Rectangle(String borderColor, String fillColor, double side1, double side2) {
        super(borderColor, fillColor);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side2+side1;
    }

    @Override
    public double getSquare() {
        return side1*side2;
    }
}
