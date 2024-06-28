package CoreJavaQuickRevision.shapes2;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("area is " + (length * width));
    }

    @Override
    public void calculatorPerimeter() {
        System.out.println("perimeter is " + (length*2 + width*2));
    }
}
