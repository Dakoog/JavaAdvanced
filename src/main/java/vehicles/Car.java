package vehicles;

public class Car {
    private final String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void show() {
        System.out.printf("This is my car: %s %s %n", brand, model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "Brand: " + brand + " || Model:" + model;
    }
}
