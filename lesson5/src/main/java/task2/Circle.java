package task2;

public class Circle extends Figure implements IFigureInfo{
    private int radius;

    Circle(String borderColor, String fillColor, int radius) {
        super(borderColor, fillColor);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI+radius;
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(radius, 2);
    }
}
