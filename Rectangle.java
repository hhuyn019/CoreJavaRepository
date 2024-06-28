package CoreJavaQuickRevision;

public class Rectangle {
    private Double length;
    private Double width;

    Double calcArea() {
        return length*width;
    }

    Double calcPerimeter() {
        return (length*2) + (width*2);
    }

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
