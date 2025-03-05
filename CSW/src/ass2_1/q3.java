package ass2_1;

public class q3 {
    public static void main(String[] args) {
        Car car1 = new Car("Model1", "Red", 150);
        Car car2 = new Car("Model2", "Blue", 180);

        System.out.println("Car 1 details: " + car1);
        System.out.println("Car 2 details: " + car2);

        if (car1.compareTo(car2) > 0) {
            System.out.println("Car with greater speed: " + car1);
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("Car with greater speed: " + car2);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}

class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }
}
