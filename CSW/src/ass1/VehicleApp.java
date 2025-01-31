//Q9
package ass1;

public class VehicleApp {

    interface Vehicle {
        void accelerate();
        void brake();
    }

    static class Car implements Vehicle {
        private String model;

        public Car(String model) {
            this.model = model;
        }

        @Override
        public void accelerate() {
            System.out.println(model + " is accelerating.");
        }

        @Override
        public void brake() {
            System.out.println(model + " is braking.");
        }

        public void accelerate(int speed) {
            System.out.println(model + " is accelerating to " + speed + " km/h.");
        }

        public void accelerate(int speed, int duration) {
            System.out.println(model + " is accelerating to " + speed + " km/h for " + duration + " minutes.");
        }
    }

    static class Bicycle implements Vehicle {
        private String model;

        public Bicycle(String model) {
            this.model = model;
        }

        @Override
        public void accelerate() {
            System.out.println(model + " is accelerating using pedals.");
        }

        @Override
        public void brake() {
            System.out.println(model + " is braking using handbrakes.");
        }

        public void accelerate(int speed) {
            System.out.println(model + " is accelerating to " + speed + " km/h by pedaling faster.");
        }

        public void accelerate(int speed, int duration) {
            System.out.println(model + " is accelerating to " + speed + " km/h for " + duration + " minutes while cycling.");
        }
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBicycle = new Bicycle("Mountain Bike");

        System.out.println("Calling overridden methods:");
        myCar.accelerate();
        myCar.brake();

        myBicycle.accelerate();
        myBicycle.brake();

        System.out.println("\nCalling overloaded methods:");
        Car car = (Car) myCar;
        car.accelerate(80);
        car.accelerate(80, 10);

        Bicycle bicycle = (Bicycle) myBicycle;
        bicycle.accelerate(20);
        bicycle.accelerate(20, 30);
    }
}
