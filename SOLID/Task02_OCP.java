// Open-closed principle - принцип открытости/закрытости
// Классы должны быть открыты для расширения, но закрыты для изменения => можно улучшать, но нельзя изменять

public class Task02_OCP {
    public static void main(String[] args) {

        int maxSpeed = 110;

        Car car = new Car(maxSpeed);
        Bus bus = new Bus(maxSpeed);

        System.out.println(new SpeedCalculation().calculateAllowedSpeed(car));
        System.out.println(new SpeedCalculation().calculateAllowedSpeed(bus));

    }
}

class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed();
    }
}

abstract class Vehicle {
    int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

}

class Car extends Vehicle {

    private double slow_kf = .8;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (this.maxSpeed * slow_kf);
    }

}

class Bus extends Vehicle {

    private double slow_kf = .6;

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (this.maxSpeed * slow_kf);
    }

}
