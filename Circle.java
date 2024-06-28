package CoreJavaQuickRevision;

public class Circle {
    private Double radius;

    Double calcArea() {
        return Math.PI*(radius*radius);
    }

    Double calcCircumference() {
        return 2*Math.PI*radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
