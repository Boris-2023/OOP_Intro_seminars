// Interface segregation principle - Принцип разделения интерфейса 
// Клиенты не должны реализовывать интерфейсы, которые они не используют
// Необходимо делить "толстые" интерфейсы на специализированные

public class Task03_ISP {

    static double size = 10;
    public static void main(String[] args) {

        Circle circle = new Circle(size);
        Cube cube = new Cube(size);

        System.out.println("Площадь круга с радиусом " + size + " = " + circle.area());

        System.out.println("Площадь поверхн. куба с ребром " + size + " = " + cube.area());
        System.out.println("Объём куба с ребром " + size + " = " + cube.volume());
    }
}

// separate interface for 2D shapes - no need for volume
interface Shape2D {
    double area();
}

// separate interface for 3D shapes with volume
interface Shape3D {
    double area();
    double volume();
}

// implements appropriate interface for 2D shapes
class Circle implements Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

// implements appropriate interface for 3D shapes
class Cube implements Shape3D {
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}