// Dependency Inversion Principle - принцип инверсии зависимостей
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

public class Task05_DIP {
    public static void main(String[] args) throws Exception {

        CarDIP carPetrol = new CarDIP(new PetrolEngine());
        CarDIP carDiesel = new CarDIP(new DieselEngine());

        carPetrol.start();
        carDiesel.start();

    }
}

// interface for engines - with its implementation we can make any number of
// engine types, which all be suitable for CarDIP objects
interface iEngine {
    public void start();
}

// now can consume any type of engine implementing iEngine interface
class CarDIP {
    private iEngine engine;

    public CarDIP(iEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

// type of engine implementing iEngine interface
class PetrolEngine implements iEngine {

    public void start() {
        System.out.println("PETROL engine sounds 'rrrrrrrrrr'");
    }
}

// one more type of engines - just for demonstration
class DieselEngine implements iEngine {

    public void start() {
        System.out.println("DIESEL engine sounds 'RRRRRRRRRR'");
    }
}