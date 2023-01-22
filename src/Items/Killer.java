package Items;

public abstract class Killer extends MovableItem{

    public Killer (Coordinate coordinate,int distance){
        super(coordinate,distance);
    }
    public abstract void kill (Item item);
}
