package q3;

public class Rectangle {
    // Instance variables
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Calculate area method
    public double calculateArea() {
        return width * height;
    }

    // Calculate perimeter method
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
