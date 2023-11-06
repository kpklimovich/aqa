package task2;

public class Triangle extends Figure implements IFigureInfo{

    private double side1;
    private double side2;
    private double side3;

    Triangle(String borderColor, String fillColor, double side1, double side2, double side3) {
        super(borderColor, fillColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter()/2.0;
        return Math.sqrt(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3));
    }
}
