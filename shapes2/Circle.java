package CoreJavaQuickRevision.shapes2;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("area is " + (Math.PI*radius*radius));
    }

    @Override
    public void calculatorPerimeter() {
        System.out.println("perimeter is " + (2*radius*Math.PI));
    }
}
