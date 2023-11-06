package task2;

public abstract class Figure {
    private String borderColor;
    private String fillColor;

    Figure(String borderColor, String fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }
}
