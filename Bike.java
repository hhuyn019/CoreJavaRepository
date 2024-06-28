package CoreJavaQuickRevision;

public class Bike extends Vehicle{
    private String make;
    private String model;
    private double topSpeed;

    public Bike(String make, String model, double topSpeed) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
