// Liskov substitution principle - принцип подстановки Барбары Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

public class Task04_LSP {

    public static void main(String[] args) {

        int width = 10;
        int height = 20;

        Square square = new Square(width);
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(square.area());
        System.out.println(rectangle.area());

    }

}

// Прямоугольник расширяет возможности квадрата (второе измерение стороны), а не
// наоборот. Поэтому квадрат- базовый класс
class Square {
    protected int baseSide;

    public Square(int baseSide) {
        this.baseSide = baseSide;
    }

    public int area() {
        return baseSide * baseSide;
    }
}

class Rectangle extends Square {
    private int height;

    public Rectangle(int baseSide, int height) {
        super(baseSide);
        this.height = height;
    }

    @Override
    public int area() {
        return baseSide * height;
    }
}