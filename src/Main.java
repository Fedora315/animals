import Items.Bear;
import Items.Coordinate;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate=new Coordinate(5,5);
        Bear bear=new Bear(coordinate,10, 100, 100, 100);
        bear.eat();
        System.out.println(bear.canEat(bear));
    }

}