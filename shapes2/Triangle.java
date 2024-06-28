package CoreJavaQuickRevision.shapes2;

public class Triangle implements Shape{
    private double base;
    private double sideA;
    private double sideB;
    private double height;

    public Triangle(double base, double sideA, double sideB, double height) {
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("area is " + ((base*height)/2));
    }

    @Override
    public void calculatorPerimeter() {
        System.out.println("perimeter is " + (sideA+sideB+base));
    }
}
