package vehicles;

public class VehiclesMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0]= new Car("Lamborghini","Veneno");
        cars[1]= new Car("Syrena","Bosto");
        cars[2]= new Car("Skoda","Favorit");
        cars[3]= new Car("Volkswagen","Golf 5");
        cars[4]= new Car("Ferrari ","Testarossa ");

        Car thirdCar = cars[2]; // reference for third element of array Car.
        // change model of third car
        thirdCar.setModel("Octavia");
        // print information about cars by show method
        for (Car car : cars) {
            car.show();
        }
        System.out.println();
        // print information about cars by object
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
